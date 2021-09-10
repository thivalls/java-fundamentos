package main.entities;

public class Aluno {
    final String name;
    final double nota;
    final boolean comportamento;

    public Aluno(String name, double nota) {
        this(name, nota, true);
    }

    public Aluno(String name, double nota, boolean comportamento) {
        this.name = name;
        this.nota = nota;
        this.comportamento = comportamento;
    }

    public String getName() {
        return name;
    }

    public double getNota() {
        return nota;
    }

    public boolean isComportamento() {
        return comportamento;
    }
}
