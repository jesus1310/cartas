import java.util.ArrayList;

/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador
{
    // Atributo que contiene el identificador del jugador
    private int id;
    // ArrayList que almacena el nombre completo de las cartas que tiene el jugador en la mano
    private ArrayList<String> cartasEnMano;
    
    /**
     * Constructor for objects of class Jugador
     */
    public Jugador(int id)
    {
        this.id = id;
        cartasEnMano = new ArrayList<>();
    }
}
