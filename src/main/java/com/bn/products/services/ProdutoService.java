package com.bn.products.services;

import org.springframework.stereotype.Service;

import com.bn.products.models.ProdutoModel;
import com.bn.products.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoModel> listarProduto() {
        return produtoRepository.findAll();
    }

    public Optional<ProdutoModel> procurarProdutoPorID(Long id) {
        return produtoRepository.findById(id);
    }

    public ProdutoModel criarProduto(ProdutoModel produtoModel){
        return produtoRepository.save(produtoModel);
    }


    public ProdutoModel atualizarProduto(Long id, ProdutoModel produtoModel){
        ProdutoModel atualizado = produtoRepository.findById(id).get();
        atualizado.setNome(produtoModel.getNome());
        atualizado.setPreco(produtoModel.getPreco());

        return produtoRepository.save(atualizado);
    }


    public void deletarProduto(Long id) {
        produtoRepository.deleteById(id);
    }
}
