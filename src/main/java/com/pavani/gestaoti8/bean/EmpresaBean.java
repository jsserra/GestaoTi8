/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pavani.gestaoti8.bean;

import com.pavani.gestaoti8.dao.EmpresaDao;
import com.pavani.gestaoti8.model.Empresa;
import com.pavani.gestaoti8.util.gestaoException;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author jsf
 */
@Named
public class EmpresaBean implements Serializable{
    
    @Inject
    EmpresaDao daoEmpresa;
    
    public List<Empresa> getListaEmpresas() throws gestaoException{
        return daoEmpresa.listaEmpresas();
    }
    
}
