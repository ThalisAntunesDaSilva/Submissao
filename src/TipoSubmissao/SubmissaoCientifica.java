package TipoSubmissao;

import Submissoes.Submissao;


public class SubmissaoCientifica extends Submissao {
    
    protected String instituicao;
    protected String palavraChave;


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
    

}
