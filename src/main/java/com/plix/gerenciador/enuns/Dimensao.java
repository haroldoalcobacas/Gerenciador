package com.plix.gerenciador.enuns;

public enum Dimensao {
    QUALIDADE("Qualidade"),
    SEGURANCA("Seguranca"),
    PRODUTIVIDADE("Produtividade");

    private String dimensao;
    private Dimensao(String dimensao){
        this.dimensao = dimensao;
    }
}

