package org.isp_refatoracao.interfaces;

public interface CadastroClienteInterface {

    void cadastrarCliente(String nome, String email);
    String buscarClientePorEmail(String email);
}