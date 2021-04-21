package br.com.kaiorr.javaoo.javacore.domain.enumeracao.test;

import br.com.kaiorr.javaoo.javacore.domain.enumeracao.domain.Cliente;
import br.com.kaiorr.javaoo.javacore.domain.enumeracao.domain.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Kaio", 55, TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Kaio", 55, TipoCliente.PESSOA_FISICA);
        Cliente cliente3 = new Cliente("Kaio", 55, TipoCliente.PESSOA_JURIDICA);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
    }
}
