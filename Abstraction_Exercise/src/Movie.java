public class Movie extends Product {

    private String director;

    public Movie() {

    }

    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public double getDiscount() {
        double discountValue = 12.5;
        if (super.getPrice() > discountValue) {
            setPrice(super.getPrice() - 12.5);
            System.out.println("Discount Successful");

        } else {
            System.out.println("Discount Unsuccessful");
        }
        // setPrice(super.getPrice()-12.5);
        return -1;
    }
}
