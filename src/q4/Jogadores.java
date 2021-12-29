package q4;

import java.util.Date;

public class Jogadores {

    private String nome;
    private Date nascimento;
    private String genero;
    private float altura;

    public Jogadores(String nome, Date nascimento, String genero, float altura) {
        this.nome = nome;
        this.genero = genero;
        this.altura = altura;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

}