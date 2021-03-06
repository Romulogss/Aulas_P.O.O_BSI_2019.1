package aula_24_04_2019;

public class Funcionario {

    private int matricula;
    private String nome;
    private double salarioBase;
    public static double imposto = 25.0;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getSalario() {
        return salarioBase - salarioBase * (imposto / 100);
    }

    public static double getImposto() {
        return imposto;
    }

    public static void setImposto(double imposto) {
        Funcionario.imposto = imposto;
    }

}
