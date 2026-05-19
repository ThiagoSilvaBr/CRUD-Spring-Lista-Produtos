package com.bn.products.models;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tb_produtos")
public class ProdutoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private double preco;


}
