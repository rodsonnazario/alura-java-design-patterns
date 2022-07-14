package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

public class LogDePedidos implements AcaoAposGerarPedido {

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Pedido foi gerado: " + pedido);
    }
}
