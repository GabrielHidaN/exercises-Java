package entities;

public class Products {

    public String name;
    public double price;
    public int quantity;

    public double TotalValueInStock(){
        double valueStock;
        valueStock = price * quantity;
        return valueStock;
    }
    public void AddedProduct(int quantityAdded){
        int valueAdded = quantityAdded;
        quantity += valueAdded;
        price *= quantity;

    }

    public void RemovedProduct(int quantityRemoved){
        int valueRemoved = quantityRemoved;
        price -= ((valueRemoved * price )/ quantity) ;
        quantity -= valueRemoved;
    }

}
