package zadanie3;

public class VatCalculation {

    public double priceBrutto(Product product) {
        int category = product.getCategory();
        switch (category) {
            case (1):
                return product.getPriceNetto() * 1.07;
            default:
                return product.getPriceNetto() * 1.22;
        }
    }
}
