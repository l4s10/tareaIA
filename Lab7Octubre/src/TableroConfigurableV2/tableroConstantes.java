package TableroConfigurableV2;
/**
 *
 * @author Fr4m <francisco.munoz1901@alumnos.ubiobio.cl>
 */
public interface tableroConstantes {
    //Configuraciones del tablero...
    //Tamaño de las celdas, ancho y largo. (CAMBIAR AQUI CUANTAS CELDAS HAY)
    public final int PIXEL = 100;
    public final int ANCHO_CELDAS = 4;
    public final int LARGO_CELDAS = 4;

    //Desplazamiento
    public final int ANCHO_BORDE_VENTANA = 30;
    public final int LARGO_BORDE_VENTANA = 50;
    public final int DESPLAZAMIENTO = 10;

    //Dimensiones para la ventana donde se mostrará todo (NO TOCAR).
    public final int ANCHO_ESCENARIO = (PIXEL*ANCHO_CELDAS) + ANCHO_BORDE_VENTANA;
    public final int LARGO_ESCENARIO = (PIXEL*LARGO_CELDAS) + LARGO_BORDE_VENTANA;

    //para la interaccion (pintar celdas correspondientes)
    public final char OBSTACULO='O';
    public final char CAMINO='C';
    public final char META = 'M';
    public final char LINEA = 'L';
}
