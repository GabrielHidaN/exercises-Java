package course.entities;

public class Products {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        double valueStock;
        valueStock = price * quantity;
        return valueStock;
    }
    public void addedProduct(int quantityAdded){
        int valueAdded = quantityAdded;
        quantity += valueAdded;
        price *= quantity;

    }

    public void removedProduct(int quantityRemoved){
        int valueRemoved = quantityRemoved;
        price -= ((valueRemoved * price )/ quantity) ;
        quantity -= valueRemoved;
    }


    public String toString() {

        return name +
                " , $ " +
                String.format("%.2f" , price)
                + ", "
                + quantity
                + " Units , Total : $ "
                + totalValueInStock();
    }
}
