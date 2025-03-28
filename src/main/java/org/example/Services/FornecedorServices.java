package org.example.Services;

import org.example.Entities.Contato;
import org.example.Entities.Fornecedor;
import org.example.dto.FornecedorDTO;

public class FornecedorServices {





    public Fonecedor update(Long id, FornecedorDTO objDto) {
        try {
            Fornecedor entity = findById(id);

            entity.setRazaoSocial(objDto.getRazaoSocial());
            entity.setFantasia(objDto.getFantasia());
            entity.setCnpj(objDto.getCnpj());
            entity.setStatus(objDto.getStatus());

            Contato contato = entity.getContatos().get(0);
            contato.setConNumero(objDto.getNumero());
            contato.setConEmail(objDto.getEmail());

        }


    }
}
