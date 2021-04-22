package br.com.kaiorr.javaoo.javacore.domain.NewInterface.domain;

public class DatabaseLoader implements DataLoader{
    @Override
    public void loader() {
        System.out.println("Imprimindo dados do banco de dados!");
    }
}
