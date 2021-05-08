package taskB;

public class Lavash extends FirstBread {
    String brandName;

    public String zavernut(){
        return "Zavernuli!";
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String ispech() {
        super.ispech();
        return "Я лаваш, меня испекли";
    }
}
