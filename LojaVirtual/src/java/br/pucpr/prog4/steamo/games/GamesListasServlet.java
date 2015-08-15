/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.prog4.steamo.games;

import br.pucpr.prog4.steamo.models.Produto;
import br.pucpr.prog4.steamo.models.ProdutoManager;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author guilherme.lemes
 */
public class GamesListasServlet extends HttpServlet {

   

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ProdutoManager prdMag = new ProdutoManager();
        
        prdMag.obterTudo();
        
        List<Produto> produtos;
        produtos = prdMag.obterTudo();
        
        request.setAttribute("produtos", produtos);
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("/WEB-INF/jsp/game-lista.jsp");
        rd.forward(request, response);
    }

}
