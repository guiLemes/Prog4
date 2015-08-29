/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.prog4.steamo.games;

import br.pucpr.prog4.steamo.models.IProdutoManager;
import br.pucpr.prog4.steamo.models.Produto;
import br.pucpr.prog4.steamo.models.ProdutoManager;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author guilherme.lemes
 */
public class ProdutoDetalheServlet extends HttpServlet {

  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        
        IProdutoManager manager = new ProdutoManager();
        Produto produto = manager.obterPorId(id);
        
        String view = "WEB-INF/jsp/produto-detalhe.jsp";
        RequestDispatcher rd = request.getRequestDispatcher(view);
        rd.forward(request, response);
      
    }

}
