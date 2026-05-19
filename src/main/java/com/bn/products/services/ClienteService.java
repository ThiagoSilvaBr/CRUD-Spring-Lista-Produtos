package com.bn.products.services;

import com.bn.products.models.ClienteModel;
import com.bn.products.models.ProdutoModel;
import com.bn.products.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteModel> procurarTodosClientes(){
        return clienteRepository.findAll();
    }

    public Optional<ClienteModel> procurarClientesPorId(Long id){
        return clienteRepository.findById(id);
    }

    public ClienteModel criarClientes(ClienteModel clienteModel){
        return clienteRepository.save(clienteModel);
    }

    public ClienteModel atualizarClientes(Long id, ClienteModel clienteModel){
        ClienteModel atualizar = clienteRepository.findById(id).get();
        atualizar.setNome(clienteModel.getNome());
        atualizar.setProdutos(clienteModel.getProdutos());

        return clienteRepository.save(atualizar);
    }

    public void deletarClientes(Long id){
        clienteRepository.deleteById(id);
    }
}
