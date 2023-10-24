package com.bnpp.epita.spring.TPMagasinERP.application;

import com.bnpp.epita.spring.TPMagasinERP.domaine.Client;

import java.util.List;
import java.util.Optional;

public interface IClientService {
    void createClient(Client c);
    List<Client> afficherListeClient();
    Client afficherClient (Integer id);

    Client findByemail (String email);
}
