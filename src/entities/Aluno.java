package entities;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Aluno{" +
                "name='" + name + '\'' +
                ", nota=" + nota +
                ", comportamento=" + comportamento +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return name.equals(aluno.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
