/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.Product;
import entity.Purchase;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Anton
 */
@Stateless
public class PurchaseFacade extends AbstractFacade<Purchase> {

    @PersistenceContext(unitName = "Ptvr16webshopPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PurchaseFacade() {
        super(Purchase.class);
    }


public List<Purchase> findBuyProducts(){

        return em.createQuery("SELECT p FROM Purchase p WHERE p.dateReturn=NULL").getResultList();
    }
    public List<Purchase> find (Product product){
        return em.createQuery("SELECT p FROM Purchase p WHERE p.product = :product").setParameter("product",product).getResultList();
    
    }
    

  

  
}
   
   

   

  
    
