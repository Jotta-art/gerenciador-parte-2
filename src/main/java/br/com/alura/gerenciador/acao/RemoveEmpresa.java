package br.com.alura.gerenciador.acao;

import br.com.alura.gerenciador.modelo.Banco;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RemoveEmpresa implements Acao {

    public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException {

        System.out.println("acao removendo empresa");

        String paramId = request.getParameter("id");
        Integer id = Integer.valueOf(paramId);

        Banco banco = new Banco();
        banco.removeEmpresa(id);

        return "redirect:entrada?acao=ListaEmpresas";
    }
}
