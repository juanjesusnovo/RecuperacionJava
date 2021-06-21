package RecuperacionJava;

import java.util.Calendar;

public class Mensual implements Suscripcion {
    private int duracion, dia;
    public Mensual(int duracion, int dia){
        this.duracion = duracion;
        this.dia = dia;
    }

    @Override
    public boolean activa(Calendar fecha) {
        boolean activa = false;
        if (dia == fecha.get(Calendar.DAY_OF_MONTH)) {
            duracion -= 1;
            if (duracion > 0){activa = true;}
        }
        return activa;
    }

}
