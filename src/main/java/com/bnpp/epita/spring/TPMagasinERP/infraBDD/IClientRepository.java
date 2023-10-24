package com.bnpp.epita.spring.TPMagasinERP.infraBDD;

import com.bnpp.epita.spring.TPMagasinERP.domaine.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IClientRepository extends JpaRepository<Client, Integer> {
    @Query("SELECT c FROM Client c JOIN FETCH c.roles WHERE c.email=:email")
    Optional<Client> findByEmail (String email);
}
