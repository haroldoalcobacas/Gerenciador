package com.plix.gerenciador.enuns;

public enum Origem {
    FMDS ("fmds"),
    GEMBA ("gemba"),
    OUTROS ("Outros");

    private String origem;

    private Origem(String origem){
        this.origem = origem;
    }
}
