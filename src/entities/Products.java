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
}

/*
* Terminar o projeto
*
* */