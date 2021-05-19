package com.company;

public class Main {

    public static void main(String[] args) {
        Credit credit1 = new Credit();
        credit1.setId("001");
        credit1.setSum(10000);
        credit1.setPeriod("19.5.21-19.5.22");
        credit1.setPercent(2);

        Credit credit2 = new Credit();
        credit2.setId("002");
        credit2.setSum(5000);
        credit2.setPeriod("1.01.21-1.01.23");
        credit2.setPercent(3);

        Credit credit3 = new Credit();
        credit3.setId("003");
        credit3.setSum(1000);
        credit3.setPeriod("2.02.20-2.10.20");
        credit3.setPercent(5);

        Credit credit4 = new Credit();
        credit4.setId("004");
        credit4.setSum(50000);
        credit4.setPeriod("23.12.21-23.12.31");
        credit4.setPercent(6);

        Credit credit5 = new Credit();
        credit5.setId("005");
        credit5.setSum(100000);
        credit5.setPeriod("23.12.21-23.12.31");
        credit5.setPercent(10);

        Credit[] array = {credit1, credit2, credit3, credit4, credit5};
        System.out.println("Credit count: " + array.length);
        System.out.println("All credits sum: " + (credit1.getSum() + credit2.getSum() + credit3.getSum() + credit4.getSum() + credit5.getSum()));
        System.out.println("Credits average sum: " + (credit1.getSum() + credit2.getSum() + credit3.getSum() + credit4.getSum() + credit5.getSum()) / array.length);
    }
}
