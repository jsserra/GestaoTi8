/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pavani.gestaoti8.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author jsf
 */
@Entity
@Table(name = "fabricante")

public class Fabricante extends Empresa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Size(max = 54)
    @Column(name = "contato")
    private String contato;
    @Size(max = 11)
    @Column(name = "contato_fone")
    private String contatoFone;
    @Size(max = 8)
    @Column(name = "contato_ramal")
    private String contatoRamal;
    @Size(max = 11)
    @Column(name = "contato_email")
    private String contatoEmail;
    @Size(max = 11)
    @Column(name = "suporte_fone")
    private String suporteFone;
    @Size(max = 11)
    @Column(name = "suporte_email")
    private String suporteEmail;
    @Size(max = 11)
    @Column(name = "sac_fone")
    private String sacFone;
    @Size(max = 32)
    @Column(name = "sac_email")
    private String sacEmail;
    @Lob
    @Column(name = "logotipo")
    private byte[] logotipo;


    public Fabricante() {
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getContatoFone() {
        return contatoFone;
    }

    public void setContatoFone(String contatoFone) {
        this.contatoFone = contatoFone;
    }

    public String getContatoRamal() {
        return contatoRamal;
    }

    public void setContatoRamal(String contatoRamal) {
        this.contatoRamal = contatoRamal;
    }

    public String getContatoEmail() {
        return contatoEmail;
    }

    public void setContatoEmail(String contatoEmail) {
        this.contatoEmail = contatoEmail;
    }

    public String getSuporteFone() {
        return suporteFone;
    }

    public void setSuporteFone(String suporteFone) {
        this.suporteFone = suporteFone;
    }

    public String getSuporteEmail() {
        return suporteEmail;
    }

    public void setSuporteEmail(String suporteEmail) {
        this.suporteEmail = suporteEmail;
    }

    public String getSacFone() {
        return sacFone;
    }

    public void setSacFone(String sacFone) {
        this.sacFone = sacFone;
    }

    public String getSacEmail() {
        return sacEmail;
    }

    public void setSacEmail(String sacEmail) {
        this.sacEmail = sacEmail;
    }

    public byte[] getLogotipo() {
        return logotipo;
    }

    public void setLogotipo(byte[] logotipo) {
        this.logotipo = logotipo;
    }

    
}
