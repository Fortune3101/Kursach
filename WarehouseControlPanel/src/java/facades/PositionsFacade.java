/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entitys.Positions;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author 
 */
@Stateless
public class PositionsFacade extends AbstractFacade<Positions> {

    @PersistenceContext(unitName = "WarehouseControlPanelPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PositionsFacade() {
        super(Positions.class);
    }
    
}
