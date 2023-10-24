package com.bnpp.epita.spring.TPMagasinERP.infraBDD;

import com.bnpp.epita.spring.TPMagasinERP.domaine.Devis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDevisRepository extends JpaRepository<Devis, Integer> {
}
