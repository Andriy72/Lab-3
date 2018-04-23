public class Bread extends  Product{
    private boolean quality;

    Bread(double price, String adress, String name, boolean quality,double weight){
        super(adress,name,weight);
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Bread{"  +  "quality="+ quality + "price=" + getPrice()  +   " name='" + getName()  + ", adress='" + getAdress() + "weight="+ getWeight() +'}';
    }
}
