package com.bnpp.epita.spring.TPMagasinERP.application;

import com.bnpp.epita.spring.TPMagasinERP.domaine.Produit;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface IProduitService {
    void createProduit (Produit p);
    void updateProduit (Produit p);

    List<Produit> afficherListeProduit ();
    List<Produit> findAll(Sort sort);
    Produit findProduit(Integer id);
}
