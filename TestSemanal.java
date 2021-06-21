package RecuperacionJava;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class TestSemanal {
    Semanal semanal;
    @BeforeEach
    void preparar() {
        Semanal semanal = new Semanal(Calendar.getInstance(), 32);
    }
    @Test
    void activa() {
        assert semanal.activa(Calendar.getInstance());
    }
}