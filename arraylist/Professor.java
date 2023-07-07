package arraylist;

import java.util.List;

public class Professor extends Pessoa {
    private String titulacao;
    private double salario;
    private List<Curso> cursos;

    public Professor() {
    }

    
    public Professor(String titulacao, double salario, List<Curso> cursos, String nome, String cpf, String email, List<Telefone> telefones, Endereco endereco) {
        super(nome, cpf, email, telefones, endereco);
        this.titulacao = titulacao;
        this.salario = salario;
        this.cursos = cursos;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Titulação: " + titulacao);
        System.out.println("Salário: " + salario);
        System.out.println("Cursos: " + cursos);
    }
}
