package javacore.heranca.test;

import javacore.heranca.dominio.Endereco;
import javacore.heranca.dominio.Funcionario;
import javacore.heranca.dominio.Pessoa;

import java.math.BigDecimal;

public class PessoaTest01 {
    public static void main(String[] args) {
        var endereco = new Endereco();

        endereco.setRua("Rua 1");
        endereco.setCep("14100-678");

        var pessoa = new Pessoa();

        pessoa.setNome("Victoria");
        pessoa.setCpf("222.098.777/70");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        System.out.println("------------");

        var funcionario = new Funcionario();

        funcionario.setNome("Julia");
        funcionario.setCpf("333.398.222/60");
        funcionario.setEndereco(endereco);

        var salario = BigDecimal.valueOf(2938.9);

        funcionario.setSalario(salario);

        funcionario.imprime();
    }
}
