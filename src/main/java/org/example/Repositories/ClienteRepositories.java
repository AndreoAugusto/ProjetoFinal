package org.example.Repositories;

import org.example.Entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepositories extends JpaRepository<Cliente, Long> {

}
