public class Book extends Product {
    private String author;

    public Book() {

    }

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public double getDiscount() {
        super.setPrice(super.getPrice() - 10.5);
        return super.getPrice() - 10.5;
    }


}
