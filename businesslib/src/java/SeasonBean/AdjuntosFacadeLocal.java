/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SeasonBean;

import entityes.Adjuntos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author cabjr_000
 */
@Local
public interface AdjuntosFacadeLocal {

    void create(Adjuntos adjuntos);

    void edit(Adjuntos adjuntos);

    void remove(Adjuntos adjuntos);

    Adjuntos find(Object id);

    List<Adjuntos> findAll();

    List<Adjuntos> findRange(int[] range);

    int count();
    
}
