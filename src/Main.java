import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ola Ironhackers !");

        Book book = new Book("java 101", new BigDecimal("101.01"));

        System.out.println(book);

        Electronics electronics = new Electronics("laptop" , new BigDecimal("999.99"));

        System.out.println(electronics);

        ArrayList<AbstractProduct> products = new ArrayList<AbstractProduct>();
        products.add(book);
        products.add(electronics);

        BigDecimal total = new BigDecimal(0);
        for( AbstractProduct product : products) {
            total = total.add(product.getPrice());
        }
        System.out.println(total);
    }
}
