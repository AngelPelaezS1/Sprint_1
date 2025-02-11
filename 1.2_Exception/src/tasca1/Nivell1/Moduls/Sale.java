package tasca1.Nivell1.Moduls;

import java.util.ArrayList;

public class Sale {

    private ArrayList<Product> products = new ArrayList<Product>();
    private double totalPrice;

    public Sale(ArrayList<Product> products, double totalPrice) {
        this.products = products;
        this.totalPrice = totalPrice;
    }

    public Sale() {

    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }


    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void calculateTotal() throws EmptySaleExceptions {
        double price = 0;
        double totalPrice;

        if (products.isEmpty()) {
            throw new EmptySaleExceptions();
        } else {
            for (Product p : products) {
                price += p.getPrice();
                this.totalPrice = price;
            }
        }
    }
}


