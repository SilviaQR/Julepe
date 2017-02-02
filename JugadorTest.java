

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class JugadorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class JugadorTest
{
    private Jugador jugador1;
    private Carta carta1;
    private Carta carta2;
    private Carta carta3;
    private Carta carta4;
    private Carta carta5;

    /**
     * Default constructor for test class JugadorTest
     */
    public JugadorTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        
        jugador1 = new Jugador("Silvia");
        carta1 = new Carta(1, 0);
        carta2 = new Carta(2, 1);
        carta3 = new Carta(3, 2);
        carta4 = new Carta(4, 3);
        carta5 = new Carta(5, 0);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}