package org.isp_refatoracao.services;

import org.isp_refatoracao.interfaces.CadastroClienteInterface;
import org.isp_refatoracao.interfaces.GerenciadorFidelidadeInterface;
import org.isp_refatoracao.interfaces.NotificadorInterface;

public class ClienteVIPService implements
        CadastroClienteInterface,
        NotificadorInterface,
        GerenciadorFidelidadeInterface {

    @Override
    public void cadastrarCliente(String nome, String email) {
        System.out.println("VIP: Cadastrando " + nome + " (" + email + ")");
    }

    @Override
    public String buscarClientePorEmail(String email) {
        return "VIP: Encontrado cliente com email " + email;
    }

    @Override
    public void enviarNotificacao(String email, String mensagem) {
        System.out.println("VIP: Enviando notificação para " + email +
                " com a mensagem: " + mensagem);
    }

    @Override
    public void aplicarDescontoVIP(String email, double percentual) {
        System.out.println("VIP: Aplicando " + percentual +
                "% de desconto para " + email);
    }
}
