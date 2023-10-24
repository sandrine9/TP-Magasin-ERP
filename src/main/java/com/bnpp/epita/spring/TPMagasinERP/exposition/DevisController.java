package com.bnpp.epita.spring.TPMagasinERP.exposition;

import com.bnpp.epita.spring.TPMagasinERP.application.ICalcul;
import com.bnpp.epita.spring.TPMagasinERP.application.IDevisService;
import com.bnpp.epita.spring.TPMagasinERP.application.exception.DevisNonConformeException;
import com.bnpp.epita.spring.TPMagasinERP.converter.DevisConverter;
import com.bnpp.epita.spring.TPMagasinERP.domaine.Devis;
import com.bnpp.epita.spring.TPMagasinERP.domaine.DevisLigne;
import com.bnpp.epita.spring.TPMagasinERP.dto.DevisDTO;
import com.bnpp.epita.spring.TPMagasinERP.dto.DevisLigneDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/v1/devis")
public class DevisController {
    @Autowired
    DevisConverter devisConverter;
    @Autowired
    IDevisService devisService;
    @PostMapping
    void createDevis (@RequestBody DevisDTO devisDTO) throws DevisNonConformeException {
        //convertir devisDTO en devis
        Devis devis = devisConverter.convertDevisDTOtoDevisEntity(devisDTO);
        //appel creation devis en BDD
        devisService.createDevis(devis);
    }
    @GetMapping("/{id}")
    DevisDTO findById (@PathVariable("id") Integer id){
        Devis devis = devisService.findById(id);
        return devisConverter.convertDevisToDevisDTO(devis);
    }
    @PostMapping("/ligne")   //pas utiliser, on passera par création/modif de devis pour ajouter ligne
    void createDevisLigne(@RequestBody DevisLigneDTO devisLigneDTO){

    }
}
