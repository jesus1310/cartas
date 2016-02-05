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
    // Almacena todas las cartas del mazo
    private ArrayList<Carta> baraja;

    /**
     * Constructor de la clase Mazo
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
     * Baraja el mazo de cartas.
     */
    public void barajar()
    {
        Collections.shuffle(baraja);
    }

    /**
     * Retorna la primera carta del mazo y modifica el estado del mazo para reflejar que esa carta ya no se encuentra en el mazo.
     * En caso de que no queden cartas en el mazo devuelve null.
     */
    public Carta tomarPrimera()
    {
        Carta cartaTomada = null;
        if (baraja.size() > 0) {
            cartaTomada = baraja.get(0);
            baraja.remove(0);
        }
        return cartaTomada;
    }        
}
