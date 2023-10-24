package com.bnpp.epita.spring.TPMagasinERP.exposition;

import com.bnpp.epita.spring.TPMagasinERP.application.IClientService;
import com.bnpp.epita.spring.TPMagasinERP.converter.ClientConverter;
import com.bnpp.epita.spring.TPMagasinERP.domaine.Client;
import com.bnpp.epita.spring.TPMagasinERP.dto.ClientCourtDTO;
import com.bnpp.epita.spring.TPMagasinERP.dto.ClientDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/client")
public class ClientController {
    @Autowired
    IClientService clientService;

    @Autowired
    ClientConverter clientConverter;

    @PostMapping
    public void createClient(@RequestBody ClientDTO clientDTO){
        Client client = clientConverter.convertirDTOenClient(clientDTO);
        clientService.createClient(client);
    }
    @GetMapping
    public List<ClientCourtDTO> afficherListeClient() {
        List<Client> listeClient = clientService.afficherListeClient();
        List<ClientCourtDTO> listeClientCourtDTO = listeClient.stream()
                                         .map(c -> ClientConverter.convertirClientEnClientCourtDTO(c))
                                         .collect(Collectors.toList());
        return listeClientCourtDTO;
    }
    @GetMapping("/{id}")
    public ClientDTO afficherClient(@PathVariable("id") Integer id){
        Client client = clientService.afficherClient(id);
        return ClientConverter.convertirClientEnDTO(client);
    }

}
