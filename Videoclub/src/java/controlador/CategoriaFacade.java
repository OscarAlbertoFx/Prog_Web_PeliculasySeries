/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidad.Categoria;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

/**
 *
 * @author aaron
 */
@Stateless
public class CategoriaFacade{

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoclubPU");
    private UserTransaction utx;
    private CategoriaJpaController categoryJpa = new CategoriaJpaController(emf);

    public CategoriaFacade() {
        
    }
    
}
