public class ConsoleSales extends Console{
    public ConsoleSales(String consoleType, String store, int totalSales){
        super(consoleType, store, totalSales);
    }
    public void printReport(){
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("Console Type: " + getConsoleType());
        System.out.println("Store: " + getStore*());
        System.out.println()
    }
}
