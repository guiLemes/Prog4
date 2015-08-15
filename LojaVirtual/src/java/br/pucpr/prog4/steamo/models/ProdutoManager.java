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

    @Override
    public List<Produto> obterTudo() {
        List<Produto> produtos = new ArrayList<>();
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();
        
        produto1.setNome("CSGO");
        produto1.setPreço(29.90);
        produto1.setCod(1);
        
        produto2.setNome("ARK");
        produto2.setPreço(60.00);
        produto2.setCod(2);
        
        produto3.setNome("GTA V");
        produto3.setPreço(90.99);
        produto3.setCod(3);
        
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        
       return produtos;
    }
    
}
