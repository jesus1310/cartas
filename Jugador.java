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
    // ArrayList que almacena las cartas que tiene el jugador en la mano
    private ArrayList<String> cartasEnMano;
    
    /**
     * Constructor for objects of class Jugador
     */
    public Jugador(int id)
    {
        this.id = id;
        cartasEnMano = new ArrayList<>();
    }
    
    /**
     * Método que devuelve el identificador del jugador
     */
    public int getId(){
        return id;
    }
    
    /**
     * Metodo que agrega una carta a las que posee el jugador
     */
    public void recibirCarta(Carta unaCarta){
        cartasEnMano.add(unaCarta.getNombre());
    }
    
    /**
     * Método que devuelve un ArrayList con los nombres de las cartas
     */
    public ArrayList cartasQueTieneEnLaMano(){
        return cartasEnMano;
    }
}
