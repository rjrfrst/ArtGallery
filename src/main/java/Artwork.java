public class Artwork {
    //Instance fields | Properties
    private String title;
    private Artist artist;
    private int price;

    //Constructors
    public Artwork(String inputTitle, Artist artist, int inputPrice){
        this.title = inputTitle;
        this.artist = artist;
        this.price = inputPrice;
    }

    //Getters and Setters
    public String getTitle(){
        return this.title;
    }

    public Artist getArtist(){
        return  this.artist;
    }

    public int getPrice(){
        return  this.price;
    }

} // last curly bracket
