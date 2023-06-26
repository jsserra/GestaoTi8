/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pavani.gestaoti8.dao;

import com.pavani.gestaoti8.model.Empresa;
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
public class EmpresaDao implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Inject
    EntityManager em;
    
    private GeneralDao<Empresa> dao;
    
    @PostConstruct
    void start(){
        dao = new GeneralDao(em, Empresa.class); 
    }
    
    public void salvar(Empresa empresa) throws gestaoException{
        dao.salvar(empresa);
    }
    
    public void atualizar(Empresa empresa) throws gestaoException{
        dao.atualizar(empresa);
    }
    
    public void excluir(Empresa empresa) throws gestaoException{
        dao.excluir(empresa);
    }
    
    public Empresa buscarEmpresaId(Integer id) throws gestaoException{
        return dao.buscarId(id);
    }
    
    public List<Empresa> listaEmpresas() throws gestaoException{
        return dao.listar();
    }
    
    
    
}
