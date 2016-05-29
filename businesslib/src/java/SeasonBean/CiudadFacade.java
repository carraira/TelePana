/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SeasonBean;

import entityes.Ciudad;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author cabjr_000
 */
@Stateless
public class CiudadFacade extends AbstractFacade<Ciudad> implements CiudadFacadeLocal {
    @PersistenceContext(unitName = "businesslibPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CiudadFacade() {
        super(Ciudad.class);
    }
    
    public Ciudad consultarCiudadPorCodPostal(int codigoPostal){
        
        Ciudad retorno;
        
        retorno = (Ciudad) em.createNamedQuery("Ciudad.findByCodPostal").setParameter(1, codigoPostal).getSingleResult();
        
        return retorno;
    }
    
}
