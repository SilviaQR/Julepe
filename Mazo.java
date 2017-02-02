import java.util.ArrayList;
import java.util.Random;
/**
 * Write a description of class Mazo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mazo
{
    // instance variables - replace the example below with your own
    private ArrayList<Carta> mazoDeCartas;

    /**
     * Constructor for objects of class Mazo
     */
    public Mazo()
    {
        // initialise instance variables
        mazoDeCartas = new ArrayList<Carta>(40);
        for(int contadorPalo = 0; contadorPalo < 4; contadorPalo++){
            int contadorValor = 1;
            while(contadorValor < 13){
                if(contadorValor < 8 || contadorValor > 9){
                    mazoDeCartas.add(new Carta(contadorValor, contadorPalo));
                }
                contadorValor++;
            }
            contadorValor = 1;
        }
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void verCartasDelMazo()
    {
        for(Carta carta : mazoDeCartas){
            System.out.println(carta.toString());
        }
    }
    
    public void barajar()
    {
        for(int posicionActual = 0; posicionActual < mazoDeCartas.size(); posicionActual++){
            Carta primeraCarta = mazoDeCartas.get(posicionActual);
            Random aleatorio = new Random();
            int posicionAleatoria = aleatorio.nextInt(mazoDeCartas.size());
            mazoDeCartas.set(posicionActual, mazoDeCartas.get(posicionAleatoria));
            mazoDeCartas.set(posicionAleatoria, primeraCarta);
        }
    }
    
    public Carta sacarCarta()
    {
        Carta primeraPosicion = null;
        if(mazoDeCartas.size() > 0){
            primeraPosicion = mazoDeCartas.remove(0);
        }
        return primeraPosicion;
    }
}
