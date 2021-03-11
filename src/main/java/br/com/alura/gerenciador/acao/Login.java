package br.com.alura.gerenciador.acao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Login implements Acao {
    @Override
    public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String login = request.getParameter("login");
        String senha = request.getParameter("senha");

        System.out.println("Logando" + login);

        return "redirect:entrada?acao=ListaEmpresas";
    }
}
