import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer customer;
    Artist artist1;
    Artwork artwork1;
    Artist artist2;
    Artwork artwork2;

    @BeforeEach
    public void setUp(){
        customer = new Customer("Mike", 1000);

        artist1 = new Artist("John");
        artwork1 = new Artwork("Glass", artist1, 100);

        artist2 = new Artist("James");
        artwork2 = new Artwork("Cup", artist2, 2000);
    }

    //Testing methods
    //Look at the first two test, we wrote __true || __false, this convention makes it easier to read code.
    @Test
    public void canAffordArtwork__true(){
        //When && Then
        assertThat(customer.canBuy(artwork1)).isEqualTo(true);

    }

    @Test
    public void canAffordArtwork__false(){
        //When && Then
        assertThat(customer.canBuy(artwork2)).isEqualTo(false);
    }

    @Test
    public void customerArtworkCountStartsNothing(){
        assertThat(customer.getArtworkCount()).isEqualTo(0);
    }

    @Test
    public void canBuyArtwork(){
        customer.buyArtwork(artwork1);
        assertThat(customer.getWallet()).isEqualTo(900);
        assertThat(customer.getArtworkCount()).isEqualTo(1);
    }

    //Testing Getters and Setters

    @Test
    public void hasName(){
        assertThat(customer.getName()).isEqualTo("Mike");
    }

    @Test
    public  void hasWallet(){
        assertThat(customer.getWallet()).isEqualTo(1000);
    }



} // last curly bracket
