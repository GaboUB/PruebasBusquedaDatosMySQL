package com.example.gabriel.searchmysql;

public enum UsersTipe {

    Paciente("http://laravel.win/api/v1/patient/"),  //  Requerimientos de paciente
    Medico("http://laravel.win/api/v1/HCP/"),     //     Requerimientos de médico / personal
    Clinica("http://laravel.win/api/v1/clinic/");       //  Requerimientos de la clinica

    private String usuario;

    private UsersTipe(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Retorna el mensaje de la enumeración.
     * @return
     */
    public String getUsuario() {
        return this.usuario;
    }

}
