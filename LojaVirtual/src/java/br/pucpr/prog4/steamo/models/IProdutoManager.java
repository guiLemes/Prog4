/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.prog4.steamo.models;

import java.util.List;

/**
 *
 * @author guilherme.lemes
 */
public interface IProdutoManager {
    List<Produto> obterTudo(); 
    Produto obterPorId(int id);
}
