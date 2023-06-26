/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.pavani.gestaoti8.util;

import com.pavani.gestaoti8.model.Empresa;
import com.pavani.gestaoti8.model.Endereco;
import com.pavani.gestaoti8.model.Fabricante;
import com.pavani.gestaoti8.model.enums.Logradouro;
import com.pavani.gestaoti8.model.enums.TipoEmpresa;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author jsf
 */
public class TesteUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestaoTi8PU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        /*  Endereco end = em.find(Endereco.class, 1);
        System.out.println(end); */
        List<Empresa> end1 = new ArrayList<>();

        /*  Endereço
            -------- 
        Endereco end = new Endereco();
        end.setLogradouro(Logradouro.Avenida);
        end.setNome("Evaldo Costa");
        end.setNumero(10);
        end.setBairro("Jd Sol y Mar");
        end.setCidade("Macaé");
        end.setCep("27940410");

        end1 = em.createQuery("select e from Endereco e").getResultList();// em.find(Empresa.class, 1);
        System.out.println(end1);
        System.out.println(end);
        
        Fabricante f = new Fabricante();
        f.setNome("TRAMONTINA");
        f.setRazao("TRAMONTINA GARIBALDI S.A IND. MET.");
        f.setCnpj("90049792000181");
        f.setContato("Luiz Tramon");
        f.setContatoEmail("luiz.silva@tramontina.com");
        f.setContatoFone("3125365252");
        f.setContatoRamal("458");
        f.setSacFone("0800325236");
        */

        Empresa emp = new Empresa();
        emp.setNome("JPavani Matriz");
        emp.setRazao("Campos Pavani de Macae Com Alim Ltda");
        emp.setCnpj("08472686000201");
        emp.setTipoEmpresa(TipoEmpresa.Filial);
        emp.setAtivo(Boolean.TRUE);

        em.persist(emp);
        em.getTransaction().commit();
        em.close();
    }

}
