package org.isp_refatoracao;

import org.isp_refatoracao.interfaces.CadastroClienteInterface;
import org.isp_refatoracao.interfaces.NotificadorInterface;
import org.isp_refatoracao.services.ClienteComumService;
import org.isp_refatoracao.services.ClienteVIPService;

public class Main {
    public static void main(String[] args) {

        CadastroClienteInterface clienteComum = new ClienteComumService();
        clienteComum.cadastrarCliente("Eduarda Ferrazza", "eduarda@gmailcomum.com");
        System.out.println(clienteComum.buscarClientePorEmail("eduarda@gmailcomum.com"));

        System.out.println();

        ClienteVIPService clienteVIP = new ClienteVIPService();
        clienteVIP.cadastrarCliente("Lucas Sousa", "lucas@gmailvip.com");
        System.out.println(clienteVIP.buscarClientePorEmail("lucas@gmailvip.com"));
        clienteVIP.enviarNotificacao("lucas@gmailvip.com", "Parabéns! Você recebeu um benefício VIP.");
        clienteVIP.aplicarDescontoVIP("lucas@gmailvip.com", 15.0);

        System.out.println();

        NotificadorInterface notificador = clienteVIP;
        notificador.enviarNotificacao("lucas@gmailvip.com",
                "Lembrete: sua assinatura vence em 3 dias.");
    }
}