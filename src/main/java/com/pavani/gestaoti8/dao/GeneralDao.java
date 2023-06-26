/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pavani.gestaoti8.dao;

import com.pavani.gestaoti8.util.gestaoException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.HibernateException;

/**
 *
 * @author jsf
 */
public class GeneralDao<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private final EntityManager em;
    private final Class<T> classe;

    public GeneralDao(EntityManager entityManager, Class<T> classe) {
        this.em = entityManager;
        this.classe = classe;
    }

    public void salvar(T tipo) throws gestaoException {
        try {
            em.getTransaction().begin();
            em.persist(tipo);
            em.getTransaction().commit();
        } catch (HibernateException he) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw new gestaoException("Erro ao gravar no banco" + he.getMessage());
        }
    }

    public void excluir(T tipo) throws gestaoException {
        try {
            em.getTransaction().begin();
            em.remove(tipo);
            em.getTransaction().commit();
        } catch (HibernateException he) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw new gestaoException("Erro ao excluir no banco" + he.getMessage());
        }
    }

    public void atualizar(T tipo) throws gestaoException {
        try {
            em.getTransaction().begin();
            em.merge(tipo);
            em.getTransaction().commit();
        } catch (HibernateException he) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw new gestaoException("Erro ao atualizar no banco" + he.getMessage());
        }
    }

    public T buscarId(Integer id) throws gestaoException {
        T tipo = null;
        try {
            em.getTransaction().begin();
            tipo = em.find(classe, id);
            em.getTransaction().commit();
        } catch (HibernateException he) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw new gestaoException("Erro ao buscar no banco" + he.getMessage());
        }
        return tipo;
    }
    
        public List<T> listar() throws gestaoException {
        List<T> lista = null;
        try {
            em.getTransaction().begin();
            CriteriaQuery<T> query = em.getCriteriaBuilder().createQuery(classe);
            query.select(query.from(classe));
            lista = em.createQuery(query).getResultList();
            em.getTransaction().commit();
        } catch (HibernateException he) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw new gestaoException("Erro ao listar dados do banco gestaoti: " + he.getMessage());
        }
        return lista;
    }

}
