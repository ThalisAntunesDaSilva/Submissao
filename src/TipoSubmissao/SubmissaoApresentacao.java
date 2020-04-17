package TipoSubmissao;

import Submissoes.Submissao;


public class SubmissaoApresentacao extends Submissao {
    
    protected String resumo;
    protected String abstracT;
    protected String duracao;

    
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
    
    
    



}
