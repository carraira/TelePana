/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SeasonBean;

import entityes.Medico;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author cabjr_000
 */
@Local
public interface MedicoFacadeLocal {

    void create(Medico medico);

    void edit(Medico medico);

    void remove(Medico medico);

    Medico find(Object id);

    List<Medico> findAll();

    List<Medico> findRange(int[] range);

    int count();
    
}
