package taskB;

public class bread {
    public static void main(String[] args) {
        FirstBread bread = new FirstBread();
        bread.setName("Bolko");
        bread.setWeight("100g");
        bread.setPrice(24);


        System.out.println("Name of the bread: " + bread.getName() + " " + bread.getWeight() + "\nIt costs: " + bread.getPrice() + " som");
        System.out.println(bread.ispech() + " " + bread.upakovat());

        separate();

        Lepeshka lepeha = new Lepeshka();
        lepeha.setName("Lepeha");
        lepeha.setWeight("70g");
        lepeha.setPrice(15);


        System.out.println("Name of the bread: " + lepeha.getName() + " " + lepeha.getWeight() + "\nIt costs: " + lepeha.getPrice() + " som");
        System.out.println(lepeha.nanestiUzory() + " "+ lepeha.ispech() + " "+ lepeha.lakirovat()+ " " + lepeha.upakovat());

        separate();

        Lavash lavash = new Lavash();
        lavash.setName("Lavash");
        lavash.setWeight("10g");
        lavash.setPrice(55);
        lavash.setBrandName("Элитный лаваш из Дилижана");

        System.out.println("Name of the bread: " + lavash.getName() + " " + lavash.getWeight() + "\nIt costs: " + lavash.getPrice() + " som" + "\nLavash brand name: " + lavash.getBrandName());
        System.out.println(lavash.ispech() + " "+ lavash.zavernut()+ " " + lavash.upakovat());

        separate();

        Baget baget = new Baget();
        baget.setName("Baget");
        baget.setWeight("150g");
        baget.setPrice(30);
        baget.setBrandName("Провансальский багет");
        baget.setLength(30);
        baget.setAmountOfRubcy(8);

        System.out.println("Name of the bread: " + baget.getName() + " " + baget.getWeight() + "\nIt costs: " + baget.getPrice() + " som" + "\nLavash brand name: " + baget.getBrandName());
        System.out.println("The length of the " + baget.getName() + " is " + baget.getLength() + " cm. \nAmount of rubcy is: " + baget.getAmountOfRubcy());
        System.out.println(baget.ispech() + " "+ baget.rubcevat() + " " + baget.upakovat());

    }
    public static void separate(){
        System.out.println("===================");
    }
}
