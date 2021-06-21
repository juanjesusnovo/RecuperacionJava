package RecuperacionJava;

import java.util.Calendar;

public class Semanal implements Suscripcion{
    private Calendar caducidad;
    private int dia;
    public Semanal(Calendar caducidad, int dia){
        this.caducidad = caducidad;
        this.dia = dia;
    }
    @Override
    public boolean activa(Calendar fecha) {
        boolean activa = false;
        if (caducidad.after(fecha)){
            if (dia == fecha.get(Calendar.DAY_OF_MONTH)){activa = true;}
        }
        return activa;
    }
}
