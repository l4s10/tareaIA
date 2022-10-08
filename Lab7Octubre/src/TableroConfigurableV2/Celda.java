package TableroConfigurableV2;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Fr4m <francisco.munoz1901@alumnos.ubiobio.cl>
 */
public class Celda implements tableroConstantes{
    //Variables de la celda
    public int xPixel;
    public int yPixel;
    public char tipo;

    //Constructor de la clase
    public Celda(int x, int y, char t){
        this.xPixel = x;
        this.yPixel = y;
        this.tipo = t;
    }

    //Para pintar las celdas
    public void pintarCelda(Graphics g) {
        switch(tipo) {
            case CAMINO:
                g.drawRect(xPixel,yPixel,PIXEL,PIXEL);
                break;
            case OBSTACULO:
                g.fillRect(xPixel,yPixel,PIXEL,PIXEL);
                break;
            case AMOR:
                g.setColor(Color.PINK);
                g.fillRect(xPixel,yPixel,PIXEL,PIXEL);
                g.setColor(Color.black);
                g.drawRect(xPixel,yPixel,PIXEL,PIXEL);
                break;
            case LINEA:
                g.setColor(Color.black);
                g.fillRect(xPixel,yPixel,PIXEL,PIXEL);
                g.setColor(Color.black);
                g.drawRect(xPixel,yPixel,PIXEL,PIXEL);
                break;
        }
    }
}

