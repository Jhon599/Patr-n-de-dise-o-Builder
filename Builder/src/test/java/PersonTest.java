import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void testInputData(){
        Persona persona = new Persona.PersonaBuilder()
                .setNombre("Juan")
                .setEdad(30)
                .build();
        System.out.println(persona.toString());
        Assert.assertTrue(persona != null);
    }

}
