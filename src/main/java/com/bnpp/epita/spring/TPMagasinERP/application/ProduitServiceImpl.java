package com.bnpp.epita.spring.TPMagasinERP.application;

import com.bnpp.epita.spring.TPMagasinERP.domaine.Produit;
import com.bnpp.epita.spring.TPMagasinERP.infraBDD.IProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServiceImpl implements IProduitService{

    @Autowired
    IProduitRepository produitDao;
    @Override
    public void createProduit(Produit p) {
        produitDao.save(p);
        //ajouter envoi evt pour incrémenter le stock
    }
    public void updateProduit(Produit p) {
        produitDao.save(p);
    }

    @Override
    public List<Produit> afficherListeProduit() {
        return produitDao.findAll();
    }

    @Override
    public List<Produit> findAll(Sort sort) {
        return produitDao.findAll(sort);
    }

    @Override
    public Produit findProduit(Integer id) {
        return produitDao.findById(id).get();
    }
}
