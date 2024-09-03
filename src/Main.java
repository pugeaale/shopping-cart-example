import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ola Ironhackers !");

        Book b = new Book("java 101", new BigDecimal("101.01"));

        System.out.println(b);

        Electronics e = new Electronics("laptop" , new BigDecimal("999.99"));

        System.out.println(e);
    }
}
