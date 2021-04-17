package br.com.kaiorr.javaoo.metodos.domain;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprimeFuncionario() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
            System.out.println("É obrigatório informar valor de salário");
            return;
        }
        for(double salario: salarios) {
            System.out.print(salario + "");
        }
        mediaSalario();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

    public void mediaSalario() {
        if(salarios == null) {
            System.out.println("É obrigatório informar valor de salário");
            return;
        }
        for(double salario: salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMedia Salarial R$" + media);
    }
}

