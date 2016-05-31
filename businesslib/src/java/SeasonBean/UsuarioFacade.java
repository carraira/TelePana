/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SeasonBean;

import entityes.Usuario;
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
public class UsuarioFacade extends AbstractFacade<Usuario> implements UsuarioFacadeLocal {
    @PersistenceContext(unitName = "businesslibPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }
//    @Override
//    public Usuario iniciarSesion(Usuario us){
//       Usuario usuario = null;
//       String consulta;
//        try {
//            consulta = "FROM Usuario u WHERE u.login = ?1 and u.contrasena = ?2 ";
//            Query query = em.createQuery(consulta);
//            query.setParameter(1, us.getLogin() );
//             query.setParameter(2, us.getContrasena() );
//            
//            
//            List<Usuario> lista = query.getResultList();
//            if (!lista.isEmpty()){
//                usuario = lista.get(0);
//            }
//        } catch (Exception e) {
//        }finally{
//            //em.close();
//        }
//        return usuario;
//    }
}
