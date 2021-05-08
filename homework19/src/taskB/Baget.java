package taskB;

public class Baget extends FirstBread {
    String brandName;
    int length;
    int amountOfRubcy;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getAmountOfRubcy() {
        return amountOfRubcy;
    }

    public void setAmountOfRubcy(int amountOfRubcy) {
        this.amountOfRubcy = amountOfRubcy;
    }


    public String rubcevat(){
        return "Zarubcevali!";
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String upakovat() {
        super.upakovat();
        return "Только в экологичный пакет";
    }

}
