/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import secure.*;

/**
 *
 * @author Anton
 */
@Stateless
public class RoleFacade  extends AbstractFacade <Role>{
    @PersistenceContext(unitName = "Ptvr16webshopPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RoleFacade() {
        super(Role.class);
    }
   


    public Role findRoleByName(String name) {
        return (Role)em.createQuery("SELECT r FROM Role r WHERE r.name=:name")
        .setParameter("name",name)
        .getSingleResult();

 }}
      
    

