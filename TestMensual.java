package RecuperacionJava;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class TestMensual {
    Mensual mensual;
    @BeforeEach
    void preparar(){
        Mensual mensual = new Mensual(12,32);
    }
    @Test
    void activa() {
        assert mensual.activa(Calendar.getInstance()) == true;
    }
}