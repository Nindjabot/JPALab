/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOComponents;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import models.First;
import models.Second;

/**
 *
 * @author User
 */
@Stateless
public class DAOComponents implements DAOComponentsLocal {
@PersistenceContext(unitName = "JPA-ejbPU")
    private EntityManager em;

    @Override
    public List<First> getAllAuthors() throws Exception {
        TypedQuery<First> namedQuery = em.createNamedQuery("First.findAll", First.class);
        return namedQuery.getResultList();
    }

    @Override
    public First addAuthor(First author) throws Exception {
        em.persist(author); //добавить
        em.flush(); //заканчивает транзакцию
        return author;
    }

    @Override
    public boolean deleteAuthor(int idd) throws Exception {
        em.remove(em.getReference(First.class, idd));
        return true;
    }

    @Override
    public List<Second> getAllBooks() throws Exception {
        TypedQuery<Second> namedQuery = em.createNamedQuery("Second.findAll", Second.class);
        return namedQuery.getResultList();
    }

}
