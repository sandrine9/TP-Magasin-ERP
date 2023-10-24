package com.bnpp.epita.spring.TPMagasinERP.application;

import com.bnpp.epita.spring.TPMagasinERP.domaine.Client;
import com.bnpp.epita.spring.TPMagasinERP.infraBDD.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements IClientService{

    @Autowired
    IClientRepository repository;
    @Override
    public void createClient(Client c) {
        //encoder le password -> ça a été fait dans le converter dto
        repository.save(c);
    }

    @Override
    public List<Client> afficherListeClient() {
        //findAll simple
        return repository.findAll();

        //findAll avec tri (très utile quand remonte bcp de lignes et que le front ne peut en afficher que 10

    }

    @Override
    public Client afficherClient(Integer id) {
        Optional<Client> clientOptional=repository.findById(id);

        return clientOptional.isPresent() ? clientOptional.get() : null ;
        /*   écriture avec opérations ternaires
              ? si vrai     : si faux

        //équivaut à :
        if(clientOptional.isPresent()){
            return clientOptional.get();
        }
        return null;
        */
    }

    @Override
    public Client findByemail(String email) {
        return repository.findByEmail(email).get();
    }

}
