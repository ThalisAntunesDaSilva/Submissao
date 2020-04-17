package Situacao;

public enum Situacao {
   Aprovado ("Aprovado"),
   Reprovado("Reprovado"),
   SobAvaliacao ("Sob Avaliação");
   
   private String descricao;

    private Situacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
   
   
    
}
