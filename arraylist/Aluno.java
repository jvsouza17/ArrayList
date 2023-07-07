package arraylist;

import java.util.List;

public class Aluno extends Pessoa {
    private Curso curso;
    private List<Double> notas;

    public Aluno() {
    } 
 
    public Aluno(Curso curso, List<Double> notas, String nome, String cpf, String email, List<Telefone> telefones, Endereco endereco) {
        super(nome, cpf, email, telefones, endereco);
        this.curso = curso;
        this.notas = notas;
    }
    
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public double calcularMedia() {
        double soma = 0;
        for (Double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Curso: " + curso.getNome());
        System.out.println("Notas: " + notas);
        System.out.println("Média: " + calcularMedia());
    }
}
