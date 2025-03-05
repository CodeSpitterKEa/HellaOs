public class ProductMain {

    public static void main(String[] args) {
        Product product = new Product();
        product.setProductName("MacBook");
        product.setProductCode("yurr");
        product.setPrice(9159);
        product.applyDiscount(10);


        System.out.println(product.getPrice());
        System.out.println(product.getPercentage());
        System.out.println(product.getProductCode());
        System.out.println(product.getProductName());
    }
}