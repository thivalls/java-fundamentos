package generics;

import entities.Caixa;

public class Exemplo1 {
    public static void main(String[] args) {
        System.out.println("Iniciando estudos de generics");
        System.out.println("----------------------------------------------");

        Caixa<String> objeto1 = new Caixa<>();
        System.out.println("Guardando objeto");
        objeto1.add("Mouse");
        System.out.println("Abrindo a caixa");
        System.out.println("Encontrado um " +objeto1.abrir());

        System.out.println("----------------------------------------------");

        Caixa<Integer> objeto2 = new Caixa<>();
        System.out.println("Guardando um valor");
        objeto2.add(7);
        System.out.println("Abrindo a caixa");
        System.out.println("Encontrado o valor " +objeto2.abrir());
    }
}
