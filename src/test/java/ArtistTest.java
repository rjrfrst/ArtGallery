import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {

    Artist artist;

    @BeforeEach
    public void setup(){
        artist = new Artist("John");
    }

   @Test
    //When && Then
    //Call the methods that are in the class file.
    public void hasName(){
        assertThat(artist.getName()).isEqualTo("John");
   }



}
