package TableroConfigurableV2;
import javax.swing.JFrame;
import java.util.Timer;
    /**
     *
     * @author Fr4m <francisco.munoz1901@alumnos.ubiobio.cl>
     */
    public class VentanaPrincipal extends JFrame implements tableroConstantes{
        //Declaramos el mundo virtual que instanciaremos
        public MundoVirtual mv;
        public Timer lanzador_tareas;
        public VentanaPrincipal(){
            //Configuraciones de ventana
            super("LABORATORIO 7 OCTUBRE");
            //Lo creamos y lo agregamos
            mv = new MundoVirtual();
            lanzador_tareas = new Timer();
            lanzador_tareas.scheduleAtFixedRate(mv.Jugador,0,5000);
            this.getContentPane().add(mv);


            //Configuraciones escenciales
            this.setSize(ANCHO_ESCENARIO,LARGO_ESCENARIO);
            this.setVisible(true);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
    }
