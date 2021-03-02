package br.com.alura.gerenciador.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(urlPatterns = "/listaEmpresas")
public class ListaEmpresasServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Banco banco = new Banco();
        List<Empresa> lista = banco.getEmpresas();

        RequestDispatcher rd = request.getRequestDispatcher("listaEmpresas.jsp");
        request.setAttribute("empresas", lista);
        rd.forward(request, response);
    }
}
