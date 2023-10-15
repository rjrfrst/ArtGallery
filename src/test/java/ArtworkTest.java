import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

    // After the class are the names we inserted.
    //They have no relation to the name.
    Artist artist;
    Artwork artwork;

    //Given
    @BeforeEach
    public void setUp(){
        // This has relation to the first class we created which was 'Artist'
        artist = new Artist("John");
        artwork = new Artwork("Glass", artist, 100);
    }

    @Test
    //When && Then
    public void getTitle(){
        assertThat(artwork.getTitle()).isEqualTo("Glass");
    }

    @Test
    //When && Then
    public void getArtist(){
        assertThat(artwork.getArtist()).isEqualTo(artist);
    }

    @Test
    //When && Then
    public void getPrice(){
        assertThat(artwork.getPrice()).isEqualTo(100);
    }

} // last curly bracket
