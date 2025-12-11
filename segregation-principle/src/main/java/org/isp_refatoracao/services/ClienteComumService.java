package org.isp_refatoracao.services;


import org.isp_refatoracao.interfaces.CadastroClienteInterface;

public class ClienteComumService implements CadastroClienteInterface {

    @Override
    public void cadastrarCliente(String nome, String email) {
        System.out.println("COMUM: Cadastrando " + nome + " (" + email + ")");
    }

    @Override
    public String buscarClientePorEmail(String email) {
        return "COMUM: Encontrado cliente com email " + email;
    }
}
