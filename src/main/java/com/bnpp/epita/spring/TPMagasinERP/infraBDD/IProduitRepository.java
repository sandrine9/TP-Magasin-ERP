package com.bnpp.epita.spring.TPMagasinERP.infraBDD;

import com.bnpp.epita.spring.TPMagasinERP.domaine.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProduitRepository extends JpaRepository<Produit, Integer> {
}
