package com.bnpp.epita.spring.TPMagasinERP.application;

import com.bnpp.epita.spring.TPMagasinERP.application.exception.DevisNonConformeException;
import com.bnpp.epita.spring.TPMagasinERP.domaine.Devis;
import com.bnpp.epita.spring.TPMagasinERP.domaine.DevisLigne;
import com.bnpp.epita.spring.TPMagasinERP.domaine.Produit;
import com.bnpp.epita.spring.TPMagasinERP.infraBDD.IDevisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
public class DevisServiceImpl implements IDevisService{
    @Autowired
    IDevisRepository repository;

    @Override
    public void createDevis(Devis d) throws DevisNonConformeException {
        if (d.getDate().isAfter(LocalDate.now())){
            throw new DevisNonConformeException("La date du devis est postérieur à aujourd'hui");
            //on peut aussi ajouter un msg dans le LOG différent de celui de l'exception
        }
        repository.save(d);
    }

    @Override
    public Devis findById(Integer id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Devis> findAll(Sort s) {
        return repository.findAll(s);
    }


}
