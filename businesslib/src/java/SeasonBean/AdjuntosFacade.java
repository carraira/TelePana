/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SeasonBean;

import entityes.Adjuntos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author cabjr_000
 */
@Stateless
public class AdjuntosFacade extends AbstractFacade<Adjuntos> implements AdjuntosFacadeLocal {
    @PersistenceContext(unitName = "businesslibPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AdjuntosFacade() {
        super(Adjuntos.class);
    }
    
}
