
import org.example.Caminhao;
import org.example.Onibus;
import org.junit.Before;

import java.util.ArrayList;
import java.util.*;

import org.junit.*;
import org.junit.Assert.*;
public class CaminhaoTeste {

    private ArrayList<Caminhao> caminhao;

    @Before
    public void setUp(){
        caminhao = new ArrayList<Caminhao>();
        caminhao.add(new Caminhao("CDE-0341", 2010, 2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testeEixoInvalidoQuandoValorMaiorQueDois(){
        caminhao.get(0).setEixos(4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testeCaminhaoComAnoAbaixoDe1998(){
        caminhao.get(0).setAno(1992);
    }
}
