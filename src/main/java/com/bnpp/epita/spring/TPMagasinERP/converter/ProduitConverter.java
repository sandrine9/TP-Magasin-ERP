package com.bnpp.epita.spring.TPMagasinERP.converter;

import com.bnpp.epita.spring.TPMagasinERP.domaine.Produit;
import com.bnpp.epita.spring.TPMagasinERP.dto.ProduitCourtDTO;
import com.bnpp.epita.spring.TPMagasinERP.dto.ProduitDTO;
import org.modelmapper.ModelMapper;

import java.math.BigDecimal;

public class ProduitConverter {
    public static ProduitDTO convertirProduitEnDTO (Produit p){
        ProduitDTO produitDTO = new ProduitDTO();
        produitDTO.setId(p.getId());
        produitDTO.setNom(p.getNom());
        produitDTO.setPrixHT(p.getPrixHT());
        produitDTO.setPrixTTC(p.getPrixHT().multiply(BigDecimal.valueOf(1.2)));
        produitDTO.setDescription(p.getDescription());
        produitDTO.setPhotoURL(p.getPhotoURL());
        return produitDTO;
    }
    public static ProduitCourtDTO convertirProduitEnProduitCourtDTO (Produit p){
        ProduitCourtDTO produitCourtDTO = new ProduitCourtDTO();
        produitCourtDTO.setId(p.getId());
        produitCourtDTO.setNom(p.getNom());
        produitCourtDTO.setPrixHT(p.getPrixHT());
        produitCourtDTO.setPhotoURL(p.getPhotoURL());
        return produitCourtDTO;

        //ModelMapper mapper = new ModelMapper();
        //produitCourtDTO = mapper.map(p, ProduitCourtDTO.class);
    }
    public static Produit convertirDTOenProduit (ProduitDTO dto){
        Produit produit = new Produit();
        if(dto.getId() != null){
            produit.setId(dto.getId());
        }
        produit.setNom(dto.getNom());
        produit.setPrixHT(dto.getPrixHT());
        produit.setDescription(dto.getDescription());
        produit.setPhotoURL(dto.getPhotoURL());
        return produit;
    }
}
