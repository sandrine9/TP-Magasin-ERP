package com.bnpp.epita.spring.TPMagasinERP.application;

import com.bnpp.epita.spring.TPMagasinERP.dto.DevisLigneDTO;

import java.math.BigDecimal;
import java.util.List;

public interface ICalcul {

    public BigDecimal calculPrixTTC(BigDecimal prixHT);

    BigDecimal calculateMontantDevisLigne (Integer produitId, BigDecimal remise);

    BigDecimal calculTotalDevis(List<DevisLigneDTO> lignesDto);

    BigDecimal calculMontantLigne(DevisLigneDTO ligne);
}
