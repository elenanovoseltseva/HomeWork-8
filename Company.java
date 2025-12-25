import taxes.TaxIncome;
import taxes.TaxIncomeMinusExpenses;
import taxes.TaxSystem;

public class Company {
    String title;
    int debit;
    int credit;
    TaxSystem taxSystem;

    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.debit = 0;
        this.credit = 0;
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        } else if (amount < 0) {
            credit += Math.abs(amount);
        }
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void setDebitCredit(int debit, int credit) {
        this.debit = debit;
        this.credit = credit;
    }

    public void payTaxes() {
        int tax = taxSystem.calcTaxFor(debit, credit);
        System.out.println("Компания " + title + " уплатила налог в размере: " + tax + " руб.");
        debit = 0;
        credit = 0;
    }

    public int applyDeals(Deal[] deals) {
        int debitT = 0;
        int creditT = 0;

        for (Deal deal : deals) {
            debitT += deal.getDebitChange();
            creditT += deal.getCreditChange();
        }

        int profitBeforeTax = debitT - creditT;

        setDebitCredit(debitT, creditT);
        setTaxSystem(new TaxIncome());
        payTaxes();

        setDebitCredit(debitT, creditT);
        setTaxSystem(new TaxIncomeMinusExpenses());
        payTaxes();

        return profitBeforeTax;
    }
}

