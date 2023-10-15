import java.sql.Array;
import java.util.ArrayList;

public class Gallery {

    //Instance fields | properties
    private String name;
    private int till;
    private ArrayList<Artwork> stock;

    //Constructors
    public Gallery(String inputName){
        this.name = inputName;
        this.till = 0;
        this.stock = new ArrayList<>();
    }

    public void sellArtwork(Customer customer, Artwork artwork){
        if(customer.canBuy(artwork) == true){
            customer.buyArtwork(artwork);
            this.stock.remove(artwork);
            setTill(this.till + artwork.getPrice());
        }
    }

    public int calculateArtworkCost(){
        int total = 0;
        for(Artwork artwork : this.stock){
            total += artwork.getPrice();
        }
        return total;
    }

    public int artworkCount(){
        return this.stock.size();
    }

    public void addArtwork(Artwork artwork){
        this.stock.add(artwork);
    }

    //    GETTERS and SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTill() {
        return till;
    }

    public void setTill(int till) {
        this.till = till;
    }

    public ArrayList<Artwork> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Artwork> artworks) {
        this.stock = artworks;
    }



} // last curly bracket
