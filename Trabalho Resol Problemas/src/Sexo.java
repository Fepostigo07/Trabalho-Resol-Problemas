public enum Sexo {
    MULHER("MULHER"),
    HOMEM("HOMEM"),
    OUTRO("OUTRO"),
    PREFIRO_NAO_DIZER("PREFIRO NÃO DIZER");

    private final String descricao;

    Sexo(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
