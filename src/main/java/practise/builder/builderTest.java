package practise.builder;

public class builderTest {

    public static void main(String[] args) {
        Product product1 = new Product.ProductBuilder("laptop",23.99).build();
        System.out.println(product1);

        Product product2 = new Product.ProductBuilder("apple",34)
                .setDescription("healthy fruit")
                .setStock(2)
                .setShipping(true).build();
        System.out.println(product2);
    }
}
