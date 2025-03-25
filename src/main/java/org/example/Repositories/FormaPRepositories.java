package org.example.Repositories;

import org.example.Entities.FormaP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormaPRepositories extends JpaRepository<FormaP, Long> {

}
