/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pavani.gestaoti8.model;

import com.pavani.gestaoti8.model.enums.TipoEmpresa;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author jsf
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "empresa")
public class Empresa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
   
    @Size(max = 14)
    @Column(name = "cnpj")
    private String cnpj;
   
    @Size(max = 15)
    @Column(name = "ie")
    private String ie;
   
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "razao")   
    private String razao;

    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nome")
    private String nome;
  
    @Size(max = 11)
    @Column(name = "telefone")
    private String telefone;
  
    @Size(max = 11)
    @Column(name = "celular")
    private String celular;
 
    @Size(max = 11)
    @Column(name = "whatsapp")
    private String whatsapp;
  
    @Size(max = 32)
    @Column(name = "email")
    private String email;
   
    @Size(max = 54)
    @Column(name = "site")
    private String site;
  
    @Size(max = 32)
    @Column(name = "login")
    private String login;
   
    @Size(max = 24)
    @Column(name = "senha")
    private String senha;
   
    @Size(max = 24)
    @Column(name = "codigo_cliente")
    private String codigoCliente;
  
    @Size(max = 10)
    @Enumerated(EnumType.STRING)
    private TipoEmpresa tipoEmpresa;
  
    @Lob
    @Size(max = 65535)
    @Column(name = "info")
    private String info;
   
    @Column(name = "ativo")
    private Boolean ativo;
  
    @JoinColumn(name = "id_end", referencedColumnName = "id")
    @OneToOne
    private Endereco idEnd;

    public Empresa() {
    }

    public Empresa(Integer id) {
        this.id = id;
    }

    public Empresa(Integer id, String razao, String nome) {
        this.id = id;
        this.razao = razao;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getRazao() {
        return razao;
    }

    public void setRazao(String razao) {
        this.razao = razao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public TipoEmpresa getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(TipoEmpresa tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Endereco getIdEnd() {
        return idEnd;
    }

    public void setIdEnd(Endereco idEnd) {
        this.idEnd = idEnd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresa)) {
            return false;
        }
        Empresa other = (Empresa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pavani.gestaoti8.model.Empresa[ id=" + id + " ]";
    }

    
}
