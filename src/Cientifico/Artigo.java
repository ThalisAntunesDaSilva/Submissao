package Cientifico;

import Situacao.Situacao;
import Submissoes.Submissao;
import TipoSubmissao.SubmissaoCientifica;

/**
 *
 * @author Thalis Antunes
 */
public class Artigo extends SubmissaoCientifica {

    private String instituicao;
    private String palavraChave;
    private String titulo;
    private String situacao;
    private String autor;
    private String resumo;
    private String abstracT;

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getPalavraChave() {
        return palavraChave;
    }

    public void setPalavraChave(String palavraChave) {
        this.palavraChave = palavraChave;
    }

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

}
