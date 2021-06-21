package RecuperacionJava;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class Agregador implements Suscripcion{
    Suscripcion sub;
    @Override
    public boolean activa(Calendar fecha) {
        return false;
    }
    public void enviaSub(){
        if(sub.activa(fecha)==true){
            System.out.println(sub);
        }
    }
    public void noticias(){
        List<Noticia> noticias;
        noticias(){noticias = new ArrayList<>();}
    }
}
