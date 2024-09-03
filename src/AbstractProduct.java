import java.math.BigDecimal;

public abstract class AbstractProduct implements Product {

    private String name;
    private BigDecimal price;

    public AbstractProduct(String name, BigDecimal price) {
        setName(name);
        setPrice(price);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public BigDecimal getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "AbstractProduct{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}
