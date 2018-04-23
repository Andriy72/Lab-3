public class Sweet extends  Product {



    private double sugarContent;

    public Sweet(double price, String adress, String name, double sugarContent, double weight) {
        super(adress,name,weight);
        this.sugarContent = sugarContent;
    }

    @Override
    public String toString() {
        return "Sweet{" + "sugarContent=" + sugarContent + "}" +  "price=" + getPrice()  +   " name='" + getName()  + ", adress='" + getAdress() + "weight="+ getWeight() +'}';
    }
}
