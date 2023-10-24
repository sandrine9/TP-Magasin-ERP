package com.bnpp.epita.spring.TPMagasinERP.application;

import com.bnpp.epita.spring.TPMagasinERP.application.exception.DevisNonConformeException;
import com.bnpp.epita.spring.TPMagasinERP.domaine.Devis;
import com.bnpp.epita.spring.TPMagasinERP.domaine.DevisLigne;
import org.springframework.data.domain.Sort;

import java.math.BigDecimal;
import java.util.List;


public interface IDevisService {

    void createDevis(Devis d) throws DevisNonConformeException;

    Devis findById (Integer id);

    List<Devis> findAll(Sort s);

}
