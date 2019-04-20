package br.com.caicosoft.cardview.activity.model;

public class Postagem {

    String nome;
    String descricao;
    int foto;

    public Postagem() {
    }

    public Postagem(String nome, String descricao, int foto) {
        this.nome = nome;
        this.descricao = descricao;
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
