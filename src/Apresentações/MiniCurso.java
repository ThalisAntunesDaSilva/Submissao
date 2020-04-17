package Apresentações;

import TipoSubmissao.SubmissaoApresentacao;

public class MiniCurso extends SubmissaoApresentacao {

    private String titulo;
    private String situacao;
    private String autor;
    private String resumo;
    private String abstracT;
    private String duracao;
    private String curriculo;
    private String recursos;
    private String metodologia;

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

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getAbstracT() {
        return abstracT;
    }

    public void setAbstracT(String abstracT) {
        this.abstracT = abstracT;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }

    public String getRecursos() {
        return recursos;
    }

    public void setRecursos(String recursos) {
        this.recursos = recursos;
    }

    public String getMetodologia() {
        return metodologia;
    }

    public void setMetodologia(String metodologia) {
        this.metodologia = metodologia;
    }

}
