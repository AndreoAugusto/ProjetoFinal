package org.example.Services;

import org.example.Entities.Contato;
import org.example.Entities.Fornecedor;
import org.example.Repositories.FornecedorRepositories;
import org.example.dto.FornecedorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornecedorServices {

    @Autowired
    private FornecedorRepositories repository;

    public List<Fornecedor>findAll()    {
        return repository.findAll();
    }

    public Optional<Fornecedor> findById(Long id)   {
        return  repository.findById(id);
    }

    public Fornecedor insert(Fornecedor fornecedor) {
        return repository.save(fornecedor);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Fornecedor update(Long id, FornecedorDTO objDto) {
        try {
            Fornecedor entity = findById(id);

            entity.setRazaoSocial(objDto.getRazaoSocial());
            entity.setFantasia(objDto.getFantasia());
            entity.setCnpj(objDto.getCnpj());
            entity.setStatus(objDto.getStatus());

            Contato contato = entity.getContatos().get(0);
            contato.setNumero(objDto.getNumero());
            contato.setEmail(objDto.getEmail());

            return FornecedorRepositories.save(entity);

        } catch (Exception e)  {
            throw new RuntimeException("Tentativa Inutil de atualizar.");
        }


    }
}
