package Cientifico  ;

import TipoSubmissao.SubmissaoCientifica;


public class Resumo extends SubmissaoCientifica {
    private String titulo;
    private String situacao;
    private String autor;

       public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
 
        }
