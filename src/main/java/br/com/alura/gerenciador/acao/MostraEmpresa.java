package br.com.alura.gerenciador.acao;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MostraEmpresa {

    public void executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String paramId = request.getParameter("id");
        Integer id = Integer.valueOf(paramId);

        Banco banco = new Banco();

        Empresa empresa = banco.buscaEmpresaPeloId(id);

        RequestDispatcher rd = request.getRequestDispatcher("formAlteraEmpresa.jsp");

        request.setAttribute("empresa", empresa);

        rd.forward(request, response);
    }
}
