/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.prog4.steamo.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author guilherme.lemes
 */
public class ProdutoManager implements IProdutoManager{

    List<Produto> produtos = new ArrayList<>();
    
    @Override
    public List<Produto> obterTudo() {
        
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();
        
        produto1.setNome("csgo01");
        produto1.setPreço(29.90);
        produto1.setCod(1);
        
        produto2.setNome("ark");
        produto2.setPreço(60.00);
        produto2.setCod(2);
        
        produto3.setNome("gtav");
        produto3.setPreço(90.99);
        produto3.setCod(3);
        
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        
       return produtos;
    }
    
    public List<Produto> obterTodos(){
        return produtos;
    }

    @Override
    public Produto obterPorId(int id) {
        for (Produto produto : produtos) {
            if (produto.getCod() == id) {
                return produto;
            }
        }
        return null;
    }
    
    
}
