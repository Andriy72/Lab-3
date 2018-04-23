public abstract class Product {
    private String name;
    private String adress;
    private double price;
    private double weight;

    public Product() {
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }




    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    Product(String name, String adress, double price, double weight) {
        this.name = name;
        this.adress = adress;
        this.price = price;
        this.weight = weight;
    }

    Product(String adress, String name, double weight) {
        this.adress = "Pushkina";
        this.name = "product";
        this.price = 0;
        this.weight = 0;
    }
}
