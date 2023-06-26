/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pavani.gestaoti8.bean;

import com.pavani.gestaoti8.dao.EnderecoDao;
import com.pavani.gestaoti8.model.Endereco;
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
//@RequestScoped
public class EnderecoBean implements Serializable{
    
    @Inject
    EnderecoDao daoEndereco;
    
    public List<Endereco> getListaEnderecos() throws gestaoException{
        return daoEndereco.listarEnderecos();
    }
    
}
