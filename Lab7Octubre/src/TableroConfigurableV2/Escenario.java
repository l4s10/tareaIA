package TableroConfigurableV2;

import java.awt.Graphics;

/**
 *
 * @author Fr4m <francisco.munoz1901@alumnos.ubiobio.cl>
 */
public class Escenario implements tableroConstantes{
    //Declaramos un array de celdas
    public Celda[][] celdas;

    //Constructor
    public Escenario(){
        celdas = new Celda[ANCHO_CELDAS][LARGO_CELDAS];

        //Inicializamos el arreglo de celdas
        for(int i = 0; i < ANCHO_CELDAS; i++){
            for(int j = 0; j < LARGO_CELDAS; j++){
                celdas[i][j] = new Celda(i*PIXEL+DESPLAZAMIENTO,
                        j*PIXEL+DESPLAZAMIENTO,CAMINO);
            }
        }
    }

    //Método para pintar el escenario
    public void pintarEscenario(Graphics g) {

        for(int i=0; i < ANCHO_CELDAS ; i++)
            for ( int j=0 ; j < LARGO_CELDAS; j++)
                celdas[i][j].pintarCelda(g);

    }

}

