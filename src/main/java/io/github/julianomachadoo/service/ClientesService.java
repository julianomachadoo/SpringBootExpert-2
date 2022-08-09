package io.github.julianomachadoo.service;

import io.github.julianomachadoo.model.Cliente;
import io.github.julianomachadoo.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {
    
    @Autowired
    private ClientesRepository repository;

    public void salvarCliente(Cliente cliente) {
        validarCliente(cliente);
        repository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente) {
//        Aplica validações
    }
}
