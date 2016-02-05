import java.util.ArrayList;

/**
 * Write a description of class Juego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Juego
{
    // Objeto de la clase Mazo
    private Mazo mazo;
    // ArrayList que contiene los jugadores de la partida
    private ArrayList<Jugador> jugadores;
    /**
     * Constructor for objects of class Juego
     * Se crea el mazo con las 52 cartas de la baraja de poker
     * Se crean los jugadores que participan en la partida
     */
    public Juego(int numeroDeJugadores)
    {
        mazo = new Mazo();
        jugadores = new ArrayList<>();
        int id = 1;
        if (numeroDeJugadores < 2 || numeroDeJugadores > 8){
            jugadores.add(new Jugador(1));
            jugadores.add(new Jugador(2));
            jugadores.add(new Jugador(3));
            jugadores.add(new Jugador(4));
        }
        else {
            while (id <= numeroDeJugadores){
                jugadores.add(new Jugador(id));
                id = id + 1;
            }
        }
        mazo.barajar();
    }

    /**
     * Método para repartir cartas a los jugadores, se indicará por parámetro cuántas recibirá cada uno
     */
    public void repartir(){
        int cartasRepartidas = 0;
        int id = 0;
        int mazoEntero = 52;
        int cartasParaCadaJugador = mazoEntero / jugadores.size();
        if (mazoEntero % jugadores.size() != 0){
            System.out.println("No hay cartas suficientes en el mazo para repartir todas entre los jugadores");
        }
        while (cartasRepartidas < (cartasParaCadaJugador * jugadores.size())){
            jugadores.get(id).recibirCarta(mazo.tomarPrimera());
            id = id + 1;
            cartasRepartidas = cartasRepartidas + 1;
            if (id == jugadores.size()){
                id = 0;
            }
        }
    }

    /**
     * Método para mostrar el id de los jugadores junto a las cartas que tiene cada jugador en la mano
     */
    public void mostrarCartasJugadores(){
        int indice = 0;
        while (indice < jugadores.size()){
            System.out.println("Id de jugador--> " + jugadores.get(indice).getId() + "\nCartas en mano--> " + jugadores.get(indice).cartasQueTieneEnLaMano() + "\n");
            indice = indice + 1;
        }
    }
}
