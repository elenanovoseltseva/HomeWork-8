public class Expenditure extends Deal {

    public Expenditure(String namePr, int pricePr) {
        String txt = String.format(" Покупка %s  на %d  руб.", namePr, pricePr);
        super(txt, 0, pricePr);
    }
}
