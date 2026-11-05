package br.com.michele.interfaceamento.entity;

import jakarta.persistence.*;

@Entity
public class Amostra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String passagem;

    private String exame;

    @Enumerated(EnumType.STRING)
    private StatusAmostra status = StatusAmostra.COLETADO;

    private Double resultado;

    private String unidade;

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public Amostra(){

    }
    public String getPassagem() {
        return passagem;

    }
    public void setPassagem(String passagem) {
        this.passagem = passagem;
    }

    public String getExame() {
        return exame;
    }

    public void setExame(String exame) {
        this.exame = exame;
    }

    public StatusAmostra getStatus() {
        return status;
    }

    public void setStatus(StatusAmostra status) {
        this.status = status;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

    public Long getId() {
        return id;
    }
}
