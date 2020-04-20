package zadanie3;

public class VatCalculation {

    public double priceBrutto(Product product) {
        String category = product.getCategory();
        switch (category) {
            case ("7%"):
                return product.getPriceNetto() * 1.07;
            case ("22%"):
                return product.getPriceNetto() * 1.22;
            default:
                System.out.println("Nieznana kategoria produktu");
                return 0.0;
        }
    }
}


