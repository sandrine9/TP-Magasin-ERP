package com.bnpp.epita.spring.TPMagasinERP.converter;

import com.bnpp.epita.spring.TPMagasinERP.application.ICalcul;
import com.bnpp.epita.spring.TPMagasinERP.domaine.Devis;
import com.bnpp.epita.spring.TPMagasinERP.domaine.DevisLigne;
import com.bnpp.epita.spring.TPMagasinERP.dto.DevisDTO;
import com.bnpp.epita.spring.TPMagasinERP.dto.DevisLigneDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class DevisConverter {
    @Autowired
    ICalcul calculService;
    public Devis convertDevisDTOtoDevisEntity (DevisDTO devisDTO){
        Devis devis = new Devis();
        if (devisDTO.getId()!=null){
            devis.setId(devisDTO.getId());
        }
        devis.setDate(devisDTO.getDate());
        devis.setClient(devisDTO.getClient());
        devis.setListeLignes(devisDTO.getListeLignes().stream()
                .map(devisLigneDTO -> convertDevisLigneDTOtoDevisLigneEntity(devisLigneDTO))
                .collect(Collectors.toList()));

        /*
        //calcul du montant TTC du devis
        BigDecimal montantDevis= new BigDecimal(0);
        for (DevisLigne l : devis.getListeLignes()) {
            BigDecimal montantLigne = calculService.calculateMontantDevisLigne(l.getProduit().getId(), l.getRemise());
            montantDevis = montantDevis.add(montantLigne);
        }

        devis.setMontantDevis(montantDevis);
        */
        return devis;

    }

    public static DevisLigne convertDevisLigneDTOtoDevisLigneEntity (DevisLigneDTO devisLigneDTO){
        DevisLigne devisLigne = new DevisLigne();

        if (devisLigneDTO.getId()!=null){
            devisLigne.setId(devisLigneDTO.getId());
        }
        devisLigne.setProduit(ProduitConverter.convertirDTOenProduit(devisLigneDTO.getProduitDTO()));
        devisLigne.setQuantite(devisLigneDTO.getQuantite());
        devisLigne.setRemise(devisLigneDTO.getRemise());

        return devisLigne;
    }
    public DevisDTO convertDevisToDevisDTO (Devis devis){
        System.out.println("convertDevisToDevisDTO");
        DevisDTO devisDTO = new DevisDTO();
        devisDTO.setId(devis.getId());
        devisDTO.setDate(devis.getDate());
        devisDTO.setClient(devis.getClient());
        devisDTO.setListeLignes(devis.getListeLignes()
                .stream()
                .map(l->convertDevisLigneToDevisLigneDTO(l))
                .collect(Collectors.toList()));
        devisDTO.setMontantDevis(calculService.calculTotalDevis(devisDTO.getListeLignes()));
        return devisDTO;
    }

    public DevisLigneDTO convertDevisLigneToDevisLigneDTO (DevisLigne devisLigne){
        DevisLigneDTO dto = new DevisLigneDTO();
        dto.setId(devisLigne.getId());
        dto.setQuantite(devisLigne.getQuantite());
        dto.setRemise(devisLigne.getRemise());
        dto.setProduitDTO(ProduitConverter.convertirProduitEnDTO(devisLigne.getProduit()));
        dto.setMontantTTCavecRemise(calculService.calculMontantLigne(dto));
        return dto;
    }
}

