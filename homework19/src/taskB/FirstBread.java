package taskB;

public class FirstBread {
    String name;
    String weight;
    int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String ispech(){
        return "ispekli! ";
    }

    public String upakovat(){
        return "upakovali";
    }
}
