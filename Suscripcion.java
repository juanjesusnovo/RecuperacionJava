package RecuperacionJava;

import java.util.Calendar;

public interface Suscripcion{
    boolean activa(Calendar fecha);
    Usuario usuario = null;
}
