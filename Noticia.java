package RecuperacionJava;

import java.util.Calendar;

public class Noticia {
    private Calendar fecha;
    private String texto;
    public Noticia(){
        this.fecha = fecha;
        this.texto = texto;
    }

    public void publica(){
        System.out.println("La noticia");
        System.out.println(texto);
        System.out.println();
    }
}
