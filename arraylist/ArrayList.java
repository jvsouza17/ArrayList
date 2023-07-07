package arraylist;

import java.util.List;

public class ArrayList {

    public static void main(String[] args) {
        
        Professor professor = new Professor();
        professor.setNome("Carlos Santos");
        professor.setCpf("456.789.123-00");
        professor.setEmail("carlos@example.com");

        Telefone telefone = new Telefone();
        telefone.setTipo("Celular");
        telefone.setDdd("11");
        telefone.setNumero("99999-9999");

        professor.setTelefones(List.of(telefone));

        Endereco endereco = new Endereco();
        endereco.setRua("Rua das Flores");
        endereco.setCidade("São Paulo");
        endereco.setEstado("SP");

        professor.setEndereco(endereco);

        professor.setTitulacao("Mestre");
        professor.setSalario(5000.00);

        Curso curso1 = new Curso();
        curso1.setNome("Engenharia de Software");

        Curso curso2 = new Curso();
        curso2.setNome("Ciência da Computação");

        professor.setCursos(List.of(curso1, curso2));

        professor.imprimir();

        System.out.println("--------------------------------");


    }
}