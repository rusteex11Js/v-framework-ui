package practise.builder;

public class Product {

    private String name;
    private double prices;
    private String description;
    private int stock;
    private boolean shipping;

    public Product(ProductBuilder builder) {
        this.name = builder.name;
        this.prices = builder.prices;
        this.description = builder.description;
        this.stock = builder.stock;
        this.shipping = builder.shipping;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrices() {
        return prices;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isShipping() {
        return shipping;
    }

    public void setShipping(boolean shipping) {
        this.shipping = shipping;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", prices=" + prices +
                ", description='" + description + '\'' +
                ", stock=" + stock +
                ", shipping=" + shipping +
                '}';
    }

    public static class ProductBuilder{

        //mandatory field
        private String name;
        private double prices;


        //Optional field
        private String description;
        private int stock;
        private boolean shipping;

        //Constructor with Mandatory fields
        public ProductBuilder(String name, double prices) {
            this.name = name;
            this.prices = prices;
        }

        //Setters for optional fields
        public ProductBuilder setDescription(String description) {
            this.description = description;
            return this;
        }
        public ProductBuilder setStock(int stock) {
            this.stock = stock;
            return this;
        }
        public ProductBuilder setShipping(boolean shipping) {
            this.shipping = shipping;
            return this;
        }


        //build method to create the object of product class
        public Product build(){
            return new Product(this);
        }
    }

}
