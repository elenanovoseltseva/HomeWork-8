public class Sale extends Deal {

    public Sale(String namePr, int pricePr) {
        String txt = String.format("Продажа %s  на %d  руб.", namePr, pricePr);
        super(txt, pricePr, 0);
    }
}
