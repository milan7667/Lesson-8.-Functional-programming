package functional_programming.task3_Movies;

public class Movies {
    private double price;
    private String genre;

    public Movies(double price, String genre) {
        this.price = price;
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
