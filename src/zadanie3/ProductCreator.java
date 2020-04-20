package zadanie3;

public class ProductCreator {

    public Product newProduct(String name, String description, Double price, int category) {
        Product product = new Product();
        product.setName(name);
        product.setOpis(description);
        product.setPriceNetto(price);
        product.setCategory(category);
        return product;
    }

}
