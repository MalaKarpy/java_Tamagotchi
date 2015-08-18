import org.junit.*;
import static org.junit.Assert.*;


public class TamagotchiTest {

    @Test
    public void Tamagotchi_instantiatesCorrectly_true() {
      Tamagotchi myPet = new Tamagotchi("Lucky");
      assertEquals("Lucky", myPet.getName());
    }

    // @Test
    // public void newPlaces_instantiatesWithPlaceNameCorrectly_true() {
    //   Places newPlaces = new Places("Portland");
    //   assertEquals("Portland", newPlaces.getDescription());
    // }

  }
