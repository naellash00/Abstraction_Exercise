//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //(1). Test Book:
        Book book1 = new Book("power", 75.8, "tom");
        System.out.println("Book price before discount: " + book1.getPrice());
        book1.getDiscount();
        System.out.println("Book price after discount: " + book1.getPrice());
        Book book2 = new Book();
        book2.setName("woods");
        book2.setPrice(50.6);
        book2.setAuthor("sylvia");
        System.out.println("Book2 name: " + book2.getName() + "\nAnd author: " + book2.getAuthor());
        System.out.println("Book2 Before discount: " + book2.getPrice());
        book2.getDiscount();
        System.out.println("Book2 after discount: " + book2.getPrice());

        System.out.println("*****************************************");
        // (2). Test Movie:
        Movie movie1 = new Movie();
        movie1.setPrice(120);
        System.out.println("Movie1 price before discount: " + movie1.getPrice());
        movie1.getDiscount();
        System.out.println("Movie1 price after discount: " + movie1.getPrice());
        Movie movie2 = new Movie("dreams", 95, "lily");
        System.out.println("Movie2 name: " + movie2.getName() + "\nAnd director: " + movie2.getDirector());
        

    }
}