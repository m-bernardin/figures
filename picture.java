
/**
 * Write a description of class picture here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class picture
{
    private Square house;
    private Circle globe;
    private Triangle roof;
    private Person person;
    private Circle2 sun;

    public void picture()
    {
        Square house = new Square();
        Circle globe = new Circle();
        Triangle roof = new Triangle();
        Person person = new Person();
        Circle2 sun = new Circle2();
        house.makeVisible();
        globe.makeVisible();
        roof.makeVisible();
        person.makeVisible();
        sun.makeVisible();
    }
}
