import java.util.ArrayList;
import java.util.Collections;

/**
 * Write a description of class Mazo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mazo
{
    // Almacena todas las cartas de la baraja
    private ArrayList<Carta> baraja;

    /**
     * Constructor for objects of class Mazo
     */
    public Mazo()
    {
        baraja = new ArrayList<Carta>();
        int index = 0;
        int numero = 1;
        String paloDeCarta = "Picas";
        
        while (index < 52) {
            Carta cartaNueva = new Carta(numero, paloDeCarta);
            baraja.add(cartaNueva);
            if (index == 12) {
                paloDeCarta = "Corazones";
                numero = 0;
            }
            else if (index == 25) {
                paloDeCarta = "Diamantes";
                numero = 0;
            }
            else if (index == 38) {
                paloDeCarta = "Treboles";
                numero = 0;
            }
            index++;
            numero++;
        }
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void barajar()
    {
        Collections.shuffle(baraja);
    }
}
