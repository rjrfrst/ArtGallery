import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery gallery;
    Artist artist1;
    Artist artist2;
    Artwork artwork1;
    Artwork artwork2;
    Customer customer;

    @BeforeEach
    public void setUp(){
        gallery = new Gallery("Paris");
        //
        artist1 = new Artist("John");
        artwork1 = new Artwork("Glass", artist1, 100);
        //
        artist2 = new Artist("James");
        artwork2 = new Artwork("Cup", artist2, 2000);
        //
        customer = new Customer("Mike", 2000);
    }

    @Test
    public void galleryCanSellArt(){

        gallery.sellArtwork(customer, artwork1);
        // check no. of artwork has reduced by 1
        assertThat(gallery.artworkCount()).isEqualTo(0);

        // check gallery till has increase
        assertThat(gallery.getTill()).isEqualTo(100);

        // check customer wallet has reduced
        assertThat(customer.getWallet()).isEqualTo(1900);

        //check customer artwork count has increased by 1
        assertThat(customer.getArtworkCount()).isEqualTo(1);
    }

    @Test
    public void canCalculateArtValue(){
        double result = gallery.calculateArtworkCost();
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void hasName(){
        assertThat(gallery.getName()).isEqualTo("Paris");
    }

    @Test
    public void tillStartsAtZero(){
        assertThat(gallery.getTill()).isEqualTo(0);
    }


} // last curly bracket
