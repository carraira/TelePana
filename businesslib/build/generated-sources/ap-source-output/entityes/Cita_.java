package entityes;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2016-05-01T22:42:00")
@StaticMetamodel(Cita.class)
public class Cita_ { 

    public static volatile SingularAttribute<Cita, Date> fechaSolCita;
    public static volatile SingularAttribute<Cita, Long> consCita;
    public static volatile SingularAttribute<Cita, Long> codMedico;
    public static volatile SingularAttribute<Cita, Long> idUsuario;
    public static volatile SingularAttribute<Cita, String> tipoCita;
    public static volatile SingularAttribute<Cita, Date> fechaProgCita;
    public static volatile SingularAttribute<Cita, String> descripCita;
    public static volatile SingularAttribute<Cita, String> estadoCita;
    public static volatile SingularAttribute<Cita, Integer> codCiudad;
    public static volatile SingularAttribute<Cita, String> centroAtencion;

}