package entities;

public class CurrencyConverter {

    public static double converter(double priceOfDollar , double valueInDollar){
        final double iof = ((valueInDollar *priceOfDollar) /100) * 6;
        return (priceOfDollar * valueInDollar) + iof;
    }
}
