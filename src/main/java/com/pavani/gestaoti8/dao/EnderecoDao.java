/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pavani.gestaoti8.dao;

import com.pavani.gestaoti8.model.Endereco;
import com.pavani.gestaoti8.util.gestaoException;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author jsf
 */
public class EnderecoDao implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Inject
    EntityManager em;
    
    private GeneralDao<Endereco> dao;
    
    @PostConstruct
    void start(){
        dao = new GeneralDao<>(this.em, Endereco.class);
    }
    
    public void salvar(Endereco end) throws gestaoException{
        dao.salvar(end);
    }

    public void excluir(Endereco end) throws gestaoException{
        dao.excluir(end);
    }
    
    public void atualizar(Endereco end) throws gestaoException{
        dao.atualizar(end);
    }
    
    public Endereco buscarEnderecoId(Integer id) throws gestaoException{
        return dao.buscarId(id);
    }
    
    public List<Endereco> listarEnderecos() throws gestaoException{
        return dao.listar();
    }

}
