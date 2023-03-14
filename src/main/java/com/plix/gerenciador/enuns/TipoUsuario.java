package com.plix.gerenciador.enuns;

public enum TipoUsuario {

    ADM ("administrador"),
    CLIENTE ("Cliente");


    private String tipoUsuario;

    private TipoUsuario (String tipoUsuario) {
        this.tipoUsuario = tipoUsuario; }
}
