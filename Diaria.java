package RecuperacionJava;

import java.util.Calendar;

public class Diaria implements Suscripcion{
    private Calendar caducidad;
    public Diaria(Calendar caducidad){
        this.caducidad = caducidad;
    }
    @Override
    public boolean activa(Calendar fecha) {
        boolean activa = false;
        if (caducidad.after(fecha)){activa = true;}
        return activa;
    }

}
