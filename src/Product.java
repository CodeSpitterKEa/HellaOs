public class Product {

    private String productName;
    private String productCode;
    private double price;
    double percentage;


//gettere
    public String getProductName() {
      return productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public double getPrice() {
        return price;
    }

    public double getPercentage() {
        return percentage;
    }
    //Setter


    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void applyDiscount(double percentage) {
        this.percentage = price - (percentage * price) / 100;

    }
}
