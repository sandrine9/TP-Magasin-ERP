package com.bnpp.epita.spring.TPMagasinERP.application;

import com.bnpp.epita.spring.TPMagasinERP.domaine.Produit;
import com.bnpp.epita.spring.TPMagasinERP.dto.DevisLigneDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

import static com.bnpp.epita.spring.TPMagasinERP.util.ConstantUtil.TAX_PROPERTY;

@Component
public class CalculService implements ICalcul{

    @Autowired
    IProduitService service;

    //ne fonctionne qu'avec SpringBoot
    //@Value("TAX_RATE")
    //public static double TAX_PROPERTY;

    //ou en utilisant une constante (TAX_PROPERTY déclarée dans ConstantUtil)
    @Override
    public BigDecimal calculPrixTTC(BigDecimal prixHT) {
        //return prixHT.multiply(new BigDecimal(1.2));
        return prixHT.multiply(new BigDecimal(TAX_PROPERTY));
    }

    @Override
    public BigDecimal calculateMontantDevisLigne(Integer produitId, BigDecimal remise) {
        System.out.println("dans calculateMontantDevisLigne - après findProduit");
        System.out.println("produitID : "+ produitId);

        Produit produit = service.findProduit(produitId);
        System.out.println("dans calculateMontantDevisLigne - après findProduit");
        System.out.println("produit: " + produit.toString());
        BigDecimal prixTTC = calculPrixTTC(produit.getPrixHT());
        BigDecimal prixTTCavecRemise = prixTTC.subtract(remise);
        return prixTTCavecRemise;
    }

    //version Sébastien pour calculer montant total du devis dans le DTO (il n'a pas mis le total dans l'entité)
    @Override
    public BigDecimal calculTotalDevis(List<DevisLigneDTO> lignesDto){
         /*return lignesDto
                .stream()
                .map(ligneDevisDto -> ligneDevisDto.getMontantTTCavecRemise())
                .reduce(BigDecimal::add).get();
          */
        //OU
        BigDecimal result=BigDecimal.ZERO;
        for ( DevisLigneDTO ldto:lignesDto) {
            result=result.add(ldto.getMontantTTCavecRemise());
        }
        return result;
    }


    public BigDecimal calculMontantLigne (DevisLigneDTO ligne){
        BigDecimal pricTTC = calculPrixTTC(ligne.getProduitDTO().getPrixHT());
        return pricTTC
                .multiply(new BigDecimal(ligne.getQuantite()))
                .subtract(ligne.getRemise());
    }

}
