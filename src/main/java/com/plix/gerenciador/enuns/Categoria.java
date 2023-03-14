package com.plix.gerenciador.enuns;

public enum Categoria {

    Novo("Novo"),
    REPLICACAO("Replicacao");

    private String categoria;

    private Categoria(String categoria) {
        this.categoria = categoria;
    }
}