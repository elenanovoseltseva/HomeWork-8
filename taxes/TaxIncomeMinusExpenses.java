package taxes;

public class TaxIncomeMinusExpenses extends TaxSystem {

    @Override
    public int calcTaxFor(int debit, int credit) {
        int profit = debit - credit;
        if (profit <= 0) {
            return 0;
        }
        return profit * 15 / 100;
    }
}

