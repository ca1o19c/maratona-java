package javacore.modificadorfinal.test;

import javacore.modificadorfinal.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        var carro = new Carro();

        carro.setNome("Fiat Mobi");

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro);
    }
}
