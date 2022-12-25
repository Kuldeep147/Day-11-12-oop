import com.bzl.buysell.StockAccount;

public class Main {
    public static void main(String[] args) {
        StockAccount account = new StockAccount();
        account.buyStock(34500,"BMW");
        account.buyStock(45000,"Apple");
        account.sellStock(34500,"BMW");
        account.printReport(account.getStockAccount());
    }

}