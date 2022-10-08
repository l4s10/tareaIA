package TableroConfigurableV2;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Fr4m <francisco.munoz1901@alumnos.ubiobio.cl>
 */
public class MundoVirtual extends Canvas implements tableroConstantes{
    //Variables para el pintado del lienzo
    public Escenario Escenario;
    public Entidad Jugador;
    public MundoVirtual(){
        //Inicializamos el escenario
        Escenario = new Escenario();
        Jugador = new Entidad(0,0,this);
        //Aquí podemos indicar que celdas pueden ser OBSTACULOS Y AMOR
        //Escenario.celdas[ANCHO_CELDAS-1][LARGO_CELDAS-1].tipo = AMOR;
        SetScenario();
        //Fondos y demas
        this.setBackground(Color.orange);
        this.setFocusable(true);
    }

    //Aquí es donde se pinta todo (Escenario, entidades, etc).
    @Override
    public void paint(Graphics g){
        Escenario.pintarEscenario(g);
        Jugador.paintCelda(g);
    }

    public void SetScenario(){
        Escenario.celdas[0][0].tipo = LINEA;
        Escenario.celdas[1][0].tipo = LINEA;
        Escenario.celdas[1][1].tipo = LINEA;
        Escenario.celdas[1][2].tipo = LINEA;
        Escenario.celdas[2][2].tipo = LINEA;
        Escenario.celdas[2][3].tipo = LINEA;
        Escenario.celdas[3][3].tipo = LINEA;



    }

}

