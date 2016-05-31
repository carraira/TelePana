/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SeasonBean;

import entityes.Registro;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author cabjr_000
 */
@Stateless
public class RegistroFacade extends AbstractFacade<Registro> implements RegistroFacadeLocal {
    @PersistenceContext(unitName = "businesslibPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RegistroFacade() {
        super(Registro.class);
    }

    @Override
    public Registro iniciarSesion(Registro us) {
        Registro registro = null;
         String consulta;
         
         try {
            consulta= "FROM Registro r WHERE r.login = ?1 and r.contrasena = ?2 ";
            Query query = em.createQuery(consulta);
            query.setParameter(1, us.getLogin() );
             query.setParameter(2, us.getContrasena() );
            
            List<Registro> lista = query.getResultList();
            if (!lista.isEmpty()){
                registro = lista.get(0);
            }
        } catch (Exception e) {
        }finally{
            //em.close();
        }
        return registro;
    }
    
    
    
    
}
