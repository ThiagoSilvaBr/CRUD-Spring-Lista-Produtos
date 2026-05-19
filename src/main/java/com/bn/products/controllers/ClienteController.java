package com.bn.products.controllers;

import com.bn.products.models.ClienteModel;
import com.bn.products.models.ProdutoModel;
import com.bn.products.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<ClienteModel>> procurarTodosClientes(){
        List<ClienteModel> request = clienteService.procurarTodosClientes();
        return ResponseEntity.ok().body(request);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<ClienteModel>> procurarClientesPorId(@PathVariable Long id){
        Optional<ClienteModel> request = clienteService.procurarClientesPorId(id);
        return ResponseEntity.ok().body(request);
    }

    @PostMapping
    public ResponseEntity<ClienteModel> criarClientes(@RequestBody ClienteModel clienteModel){
        ClienteModel request = clienteService.criarClientes(clienteModel);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
                path("/{id}").buildAndExpand(request.getId()).toUri();

        return ResponseEntity.created(uri).body(request);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClienteModel> atualizarClientes(@PathVariable Long id, @RequestBody ClienteModel clienteModel){
        ClienteModel request = clienteService.atualizarClientes(id, clienteModel);
        return ResponseEntity.status(201).body(request);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarClientes(@PathVariable Long id){
        clienteService.deletarClientes(id);
        return ResponseEntity.noContent().build();
    }
}
