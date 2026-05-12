package com.example.usuarios;

import java.time.LocalDateTime;

public class ErrorResponse {

    private  int status;
    private String erro;
    private LocalDateTime data;

    public ErrorResponse(int status, String erro, LocalDateTime data) {

        this.status = status;
        this.erro = erro;
        this.data = data;

    }

    public int getStatus() {
        return status;
    }

    public String getErro() {
        return erro;
    }

    public LocalDateTime getData() {
        return data;
    }
}
