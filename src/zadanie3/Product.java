package zadanie3;

public class Product {
    String name;
    String opis;
    double priceNetto;
    String category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public double getPriceNetto() {
        return priceNetto;
    }

    public void setPriceNetto(double priceNetto) {
        this.priceNetto = priceNetto;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", opis='" + opis + '\'' +
                ", priceNetto=" + priceNetto +
                ", category=" + category +
                '}';
    }
}
