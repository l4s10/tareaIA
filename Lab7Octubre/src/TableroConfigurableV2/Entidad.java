package TableroConfigurableV2;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Timer;
import java.util.TimerTask;

public class Entidad extends TimerTask implements tableroConstantes{
    public int xMov, yMov;
    public int xAnt=1000,yAnt=1000;
    public MundoVirtual mv;
    public Boolean fin = false;

    public Entidad(int x, int y, MundoVirtual mv){
        xMov = x;
        yMov = y;
        this.mv = mv;
    }

    public void moverArriba(){
        //Revisando Limites
        if(yMov > 0){
            //Si la celda es tipo linea
            if((mv.Escenario.celdas[xMov][yMov-1].tipo == LINEA || mv.Escenario.celdas[xMov][yMov-1].tipo == META )&& (xMov!=xAnt && yMov-1!=yAnt)){
                xAnt = xMov;
                yAnt = yMov;
                yMov -= 1;
                System.out.println("ARRIBA ["+ xMov+"]"+"["+yMov+"]");
            }else{
                System.out.println("No puedo avanzar hacia arriba");
            }
        }
    }
    public void moverAbajo(){
        if(yMov < LARGO_CELDAS-1){
            if(yMov < LARGO_CELDAS-1){
                if((mv.Escenario.celdas[xMov][yMov+1].tipo == LINEA || mv.Escenario.celdas[xMov][yMov+1].tipo == META) && (yMov+1!=yAnt)){
                    xAnt = xMov;
                    yAnt = yMov;
                    yMov += 1;
                    System.out.println("ABAJO ["+ xMov+"]"+"["+yMov+"]");
                }else{
                    System.out.println("No puedo avanzar hacia abajo");
                }
            }
        }
    }
    public void moverIzquierda() {
        if ( xMov!=0) {
            if ( (mv.Escenario.celdas[xMov-1][yMov].tipo == LINEA || mv.Escenario.celdas[xMov-1][yMov].tipo == META) && (xMov-1!=xAnt)) {
                xAnt = xMov;
                yAnt = yMov;
                xMov-=1;
                System.out.println("IZQUIERDA ["+ xMov+"]"+"["+yMov+"]");
            }else{
                System.out.println("No pude avanzar hacia la izquierda");
            }
        }
    }
    public void moverDerecha(){
        if ( xMov < ANCHO_CELDAS-1 ) {
            if ((mv.Escenario.celdas[xMov + 1][yMov].tipo == LINEA || mv.Escenario.celdas[xMov + 1][yMov].tipo == META) && (xMov+1!=xAnt)){
                xAnt = xMov;
                yAnt = yMov;
                xMov += 1;
                System.out.println("DERECHA ["+ xMov+"]"+"["+yMov+"]");
            }else{
                System.out.println("No pude avanzar hacia la derecha");
            }
        }
    }
    public void paintCelda(Graphics g) {

        g.drawRect(xMov*PIXEL+DESPLAZAMIENTO,yMov*PIXEL+DESPLAZAMIENTO,PIXEL,PIXEL);
        g.setColor(Color.green);//cambiamos color
        g.fillRect(xMov*PIXEL+DESPLAZAMIENTO,yMov*PIXEL+DESPLAZAMIENTO,PIXEL,PIXEL);
        g.setColor(Color.BLACK);//volvemos a cambiar

    }

    @Override
    public void run(){
        while(fin() == false){
            moverDerecha();
            //mv.repaint(xMov*PIXEL+DESPLAZAMIENTO,yMov*PIXEL+DESPLAZAMIENTO,PIXEL,PIXEL);
            mv.repaint();
            sleeap();
            moverAbajo();
            //mv.repaint(xMov*PIXEL+DESPLAZAMIENTO,yMov*PIXEL+DESPLAZAMIENTO,PIXEL,PIXEL);
            mv.repaint();
            sleeap();
            moverIzquierda();
            //mv.repaint(xMov*PIXEL+DESPLAZAMIENTO,yMov*PIXEL+DESPLAZAMIENTO,PIXEL,PIXEL);
            mv.repaint();
            sleeap();
            moverArriba();
            //mv.repaint(xMov*PIXEL+DESPLAZAMIENTO,yMov*PIXEL+DESPLAZAMIENTO,PIXEL,PIXEL);
            mv.repaint();
            sleeap();
        }
    }
    public boolean fin(){
        if(mv.Escenario.celdas[xMov][yMov].tipo == META){
            System.out.println("---HE LLEGADO AL FINAL ---");

            return cancel();
        }else{
            return false;
        }
    }
    public void sleeap(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
