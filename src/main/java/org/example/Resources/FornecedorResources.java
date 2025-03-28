package org.example.Resources;


import org.example.Entities.Fornecedor;
import org.example.Services.FornecedorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/fornecedores")
public class FornecedorResources {

    @Autowired
    private FornecedorServices service;

    @GetMapping
    public ResponseEntity<List<Fornecedor>> findAll()   {
        List<Fornecedor> fornecedor = service.findAll();
        return ResponseEntity.ok(fornecedor);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Fornecedor> findById(@PathVariable Long id)   {
        Optional<Fornecedor> fornecedor = service.findById(id);
        return fornecedor.map(ResponseEntity::ok).orElseGet(()
                -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Fornecedor> insert(@RequestBody Fornecedor fornecedor)    {
        Fornecedor created = service.insert(fornecedor);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Fornecedor> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id,
                                    @RequestBody Fornecedor fornecedor)   {
        if (service.update(id, fornecedor))    {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
