public class Dairy extends Product {
    private double fatContent;


    Dairy(double fatContent, double price, String adress, String name,double weight) {
        super(adress, name, weight);
        this.fatContent = fatContent;
    }
    @Override
    public String toString() {
        return "Dairy{" + "fatContent=" + fatContent + ", name='" + getName() + ", adress='" + getAdress() +  ", price=" + getPrice() + "weight="+ getWeight() +"} " ;
    }

}

