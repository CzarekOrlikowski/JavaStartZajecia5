package zadanie3;

public class Test {
    public static void main(String[] args) {

        ProductCreator products = new ProductCreator();
        Product[] listOfProducts = new Product[2];
        listOfProducts[0] = products.newProduct("a", "a", 1.0, "9%");
        listOfProducts[1] = products.newProduct("b", "b", 2.0, "22%");

        VatCalculation calculation = new VatCalculation();
        System.out.println("Cena brutto " + listOfProducts[0].getName() + " to " +
                calculation.priceBrutto(listOfProducts[0]));
        System.out.println("Cena brutto " + listOfProducts[1].getName() + " to " +
                calculation.priceBrutto(listOfProducts[1]));

    }
}
