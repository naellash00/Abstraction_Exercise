public class Movie extends Product{

    private String director;
    public Movie(){

    }
    public Movie(String name, double price, String director){
        super(name, price);
        this.director = director;
    }
    public String getDirector(){
        return director;
    }
    public void setDirector(String director){
        this.director = director;
    }
    @Override
    public double getDiscount() {
        setPrice(super.getPrice()-12.5);
        return super.getPrice()-12.5;
    }
}
