public class Main
{
    public static void main(String[] args)
    {
        double purchasePrice = 100.00;
        double salesTaxRate = 0.05;
        double salesTax = purchasePrice * salesTaxRate;

        System.out.println("Purchase price: $" + purchasePrice);
        System.out.println("Sales tax rate: " + (salesTaxRate * 100) + "%");
        System.out.println("Sales tax amount: $" + salesTax);
        System.out.println("Total cost: $" + (purchasePrice + salesTax));

    }
}