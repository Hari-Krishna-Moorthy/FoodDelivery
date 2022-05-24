package Models;

public class Customers {
    private String CustomerName;
    private double TotalAmount;

    public Customers(String customerName, double totalAmount) {
        CustomerName = customerName;
        TotalAmount = totalAmount;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public double getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        TotalAmount = totalAmount;
    }
}
