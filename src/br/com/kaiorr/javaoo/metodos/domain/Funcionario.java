package br.com.kaiorr.javaoo.metodos.domain;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

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

    public void mediaSalario() {
        if(salarios == null) {
            System.out.println("É obrigatório informar valor de salário");
            return;
        }
        double media = 0;
        for(double salario: salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMedia Salarial R$" + media);
    }
}

