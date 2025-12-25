import taxes.TaxSystem;

public class Deal {
    String comment;
    int creditChange;
    int debitChange;

    public Deal(String comment, int debitChange, int creditChange) {
        this.comment = comment;
        this.creditChange = creditChange;
        this.debitChange = debitChange;
    }

    public int getDebitChange() {
        return debitChange;
    }

    public int getCreditChange() {
        return creditChange;
    }
}
