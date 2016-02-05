
/**
 * Write a description of class Carta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carta
{
    // Almacena el valor de la carta
    private int valor;
    // Almacena el palo de la carta
    private String palo;
    
    /**
     * Constructor for objects of class Carta
     */
    public Carta(int valor, String palo)
    {
        this.valor = valor;
        this.palo = palo;
    }

    /**
     * Devuelve el nombre completo de la carta
     */
    public String getNombre()
    {
        String nombre = valor + " de " + palo;
        if (valor == 1) {
            nombre = "As de " + palo;
        }
        else if (valor == 11) {
            nombre = "J de " + palo;
        }
        else if (valor == 12) {
            nombre = "Q de " + palo;
        }
        else if (valor == 13) {
            nombre = "K de " + palo;
        }
        return nombre;
    }
}
