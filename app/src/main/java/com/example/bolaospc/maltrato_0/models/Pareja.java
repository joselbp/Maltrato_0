package com.example.bolaospc.maltrato_0.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pareja {

    @SerializedName("estado_civil")
    private String estadoCivil;
    @SerializedName("hombre")
    private String hombre;
    @SerializedName("hombre_casos")
    private String hombreCasos;
    @SerializedName("mujer")
    private String mujer;
    @SerializedName("mujer_casos")
    private String mujerCasos;
    @SerializedName("total")
    private String total;
    @SerializedName("total_casos")
    private String totalCasos;

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getHombre() {
        return hombre;
    }

    public void setHombre(String hombre) {
        this.hombre = hombre;
    }

    public String getHombreCasos() {
        return hombreCasos;
    }

    public void setHombreCasos(String hombreCasos) {
        this.hombreCasos = hombreCasos;
    }

    public String getMujer() {
        return mujer;
    }

    public void setMujer(String mujer) {
        this.mujer = mujer;
    }

    public String getMujerCasos() {
        return mujerCasos;
    }

    public void setMujerCasos(String mujerCasos) {
        this.mujerCasos = mujerCasos;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTotalCasos() {
        return totalCasos;
    }

    public void setTotalCasos(String totalCasos) {
        this.totalCasos = totalCasos;
    }

}