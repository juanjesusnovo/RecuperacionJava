package RecuperacionJava;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class TestDiaria {
    Diaria diaria;
    @BeforeEach
    void preparar(){
        Diaria diaria = new Diaria(Calendar.getInstance());
    }
    @Test
    void activa(){
        assert diaria.activa(Calendar.getInstance()) == true;
    }
}