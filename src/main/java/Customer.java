import java.lang.reflect.Array;
import java.util.ArrayList;

public class Customer {

    //instance fields | properties
    private String name;
    private int wallet;

    //This Array list has the value of 0 therefore not needed to add in the constructor.
    private ArrayList<Artwork> artCollection;

    //Constructors
    public Customer(String inputName, int inputWallet){
        this.name = inputName;
        this.wallet = inputWallet;
        this.artCollection = new ArrayList<>();
    }

    //Methods
    //Look at how we use the artwork.getPrice() from the Artwork class
    public boolean canBuy(Artwork artwork){
        if (artwork.getPrice() <= this.wallet){
            return true;
        }
        return false;
    }

    public void buyArtwork(Artwork artwork){
        this.wallet -= artwork.getPrice();
        this.artCollection.add(artwork);
    }
    public int getArtworkCount(){
        return this.artCollection.size();
    }


    //Getters and Setters
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getWallet(){
        return  this.wallet;
    }

    public void setWallet(int wallet){
        this.wallet = wallet;
    }

    public ArrayList<Artwork> getCustomerArtwork(){
        return artCollection;
    }

    public void setCustomerArtwork(ArrayList<Artwork> customerArtwork){
        this.artCollection = customerArtwork;
    }


} // last curly bracket
