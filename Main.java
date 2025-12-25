import taxes.*;

public class Main {

    public static void main(String[] args) {

        Company company = new Company("Design", new TaxIncome());

        company.shiftMoney(2800000);
        company.shiftMoney(-310000);
        company.payTaxes();

        System.out.println();

        company.setTaxSystem(new TaxIncomeMinusExpenses());
        company.shiftMoney(89000);
        company.shiftMoney(-16000);
        company.payTaxes();

        System.out.println();

        Deal[] deals = {
                new Sale("Брюки", 1100),
                new Expenditure("Хранение", 300),
                new Sale("Рубашка", 2000),
                new Expenditure("Доставка", 500)
        };

        int profit = company.applyDeals(deals);
        System.out.println("Прибыль до уплаты налогов: " + profit + " руб.");
    }
}
