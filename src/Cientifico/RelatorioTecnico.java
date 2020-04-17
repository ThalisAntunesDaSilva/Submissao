package Cientifico  ;

import TipoSubmissao.SubmissaoCientifica;


public class RelatorioTecnico extends SubmissaoCientifica {
 private String   titulo; 
  private String situacao;
 private String autor;
 private String instituicao;
 private String ano;
private String n_paginas;
private String p_chave;
private String resumo;
 private String abstracT;

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

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getN_paginas() {
        return n_paginas;
    }

    public void setN_paginas(String n_paginas) {
        this.n_paginas = n_paginas;
    }

    public String getP_chave() {
        return p_chave;
    }

    public void setP_chave(String p_chave) {
        this.p_chave = p_chave;
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
 
  
}
