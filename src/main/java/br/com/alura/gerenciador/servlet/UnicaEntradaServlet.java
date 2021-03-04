package br.com.alura.gerenciador.servlet;

import br.com.alura.gerenciador.acao.ListaEmpresas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/entrada")
public class UnicaEntradaServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String paramAcao = request.getParameter("acao");

        if (paramAcao.equals("ListaEmpresas")) {
            ListaEmpresas acao = new ListaEmpresas();
            acao.executa(request, response);

        } else if (paramAcao.equals("RemoveEmpresa")) {
            System.out.println("removendo empresa");
        } else if (paramAcao.equals("MostraEmpresa")) {
            System.out.println("mostrando empresa");
        }
    }
}
