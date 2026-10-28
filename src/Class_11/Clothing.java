package Class_11;

public class Clothing extends Item{
    private String size;

    Clothing(String id, String name, double price, int quantity, String size){
        super(id, name, price, quantity);
        this.size = size;
    }

    public void setSize(String size){
        this.size = size;
    }

    public String getSize(){
        return size;
    }
}
