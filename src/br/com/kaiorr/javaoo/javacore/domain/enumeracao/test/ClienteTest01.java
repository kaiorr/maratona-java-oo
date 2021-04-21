package br.com.kaiorr.javaoo.javacore.domain.enumeracao.test;

import br.com.kaiorr.javaoo.javacore.domain.enumeracao.domain.Cliente;
import br.com.kaiorr.javaoo.javacore.domain.enumeracao.domain.TipoCliente;
import br.com.kaiorr.javaoo.javacore.domain.enumeracao.domain.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Kaio", 55, TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Kaio", 55, TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente3 = new Cliente("Kaio", 55, TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente1 + " " + "Valor Desconto: R$" + TipoPagamento.DEBITO.calcularDesconto(2859));
        System.out.println(cliente2 + " " + "Valor Desconto: R$" + TipoPagamento.CREDITO.calcularDesconto(100));
        System.out.println(cliente3 + " " + "Valor Desconto: R$" + TipoPagamento.DEBITO.calcularDesconto(250));

        System.out.println(TipoCliente.tipoClienteNomeRelatorio("Pessoa Jurídica"));
    }
}
