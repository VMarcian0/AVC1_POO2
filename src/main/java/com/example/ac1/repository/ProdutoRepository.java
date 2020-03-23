package com.example.ac1.repository;

import java.util.ArrayList;
import java.util.HashMap;

import com.example.ac1.model.Produto;

import org.springframework.stereotype.Repository;

/**
 * ProdutoRepository
 */
@Repository
public class ProdutoRepository {
    HashMap <Integer, Produto> hsmProduto = new HashMap<Integer, Produto>();

    public ProdutoRepository() {
        //digitar todos os 10 produtos aq
        hsmProduto.put(1, new Produto(1, "Abacate", 5, 5));
        hsmProduto.put(2, new Produto(2, "Limão", 25, 0));
        hsmProduto.put(3, new Produto(3, "Beteraba", 66, 6));
        hsmProduto.put(4, new Produto(4, "Agua", 77, 3));
        hsmProduto.put(5, new Produto(5, "BomBom", 88, 9));
        hsmProduto.put(6, new Produto(6, "Chocolate", 22, 1));
        hsmProduto.put(7, new Produto(7, "Maca", 11, 5));
        hsmProduto.put(8, new Produto(8, "Banana", 645, 33));
        hsmProduto.put(9, new Produto(9, "Peito de Peru", 22, 5));
        hsmProduto.put(10, new Produto(10, "Bolacha", 78, 9));
        //hsmProduto.put(1, new Produto());
    }
    /*
        Os dois métodos
    */
    public Produto getById(int id)
    {
        return hsmProduto.get(id);
    }
    public ArrayList<Produto> getProdutos(){
        ArrayList<Produto> ret = new ArrayList<Produto>();
        ret.addAll(hsmProduto.values());
        return ret;
    }
}