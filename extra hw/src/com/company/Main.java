package com.company;

public class Main {

    public static void main(String[] args) {
        Cook cook = new Cook();
        cook.setName("Mehmet");
        cook.setAge(25);
        cook.setAddress("Chuy123");
        cook.setMale(true);
        cook.setDishes("Turkish dishes");
        cook.setSpeciality("Su-chef");
        cook.setCertificates("don`t have");

        System.out.println("Cook`s name: " + cook.getName() + "\nCook age: " + cook.getAge() + "\nCook address: " + cook.getAddress() + "\nIs male? " +  cook.isMale());
        System.out.println("Dishes: " + cook.getDishes() + "\nSpeciality: " + cook.getSpeciality() + "\nCertificates: " + cook.getCertificates());
        System.out.println(cook.shopping() + cook.inventDishes() + cook.cookDishes());
        System.out.println(cook.toBeLate());

        separate();

        Waiter waiter1 = new Waiter();
        waiter1.setName("Guliza");
        waiter1.setAge(18);
        waiter1.setAddress("Chuy111");
        waiter1.setMale(false);


        System.out.println("Waiter`s name: " + waiter1.getName() + "\nWaiter`s age: " + waiter1.getAge() + "\nWaiter`s address: " + waiter1.getAddress() + "\nIs male? " + waiter1.isMale());
        System.out.println(waiter1.takeOrder() + waiter1.placeOrder() + waiter1.count());
        System.out.println(waiter1.toBeLate());

        separate();

        Waiter waiter2 = new Waiter();
        waiter2.setName("Aibek");
        waiter2.setAge(23);
        waiter2.setAddress("Moskovskaya122");
        waiter2.setMale(true);


        System.out.println("Waiter`s name: " + waiter2.getName() + "\nWaiter`s age: " + waiter2.getAge() + "\nWaiter`s address: " + waiter2.getAddress() + "\nIs male? " + waiter2.isMale());
        System.out.println(waiter2.takeOrder() + waiter2.placeOrder() + waiter2.count());

        separate();

        Waiter waiter3 = new Waiter();
        waiter3.setName("Aizhamal");
        waiter3.setAge(20);
        waiter3.setAddress("Ahunbaeva133");
        waiter3.setMale(false);


        System.out.println("Waiter`s name: " + waiter3.getName() + "\nWaiter`s age: " + waiter3.getAge() + "\nWaiter`s address: " + waiter3.getAddress() + "\nIs male? " + waiter3.isMale());
        System.out.println(waiter3.takeOrder() + waiter3.placeOrder() + waiter3.count());
        System.out.println(waiter3.toBeLate());

        separate();

        Security security = new Security();
        security.setName("Ermek");
        security.setAge(25);
        security.setAddress("Isanova/Toktogula");
        security.setMale(true);
        security.setArmed(true);
        security.setGunType("Avtomat Kalashnikova");

        System.out.println("Security`s name: " + security.getName() + "\nSecurity`s age: " + security.getAge() + "\nSecurity`s address: " + security.getAddress() + "\nIs male? " + security.isMale());
        System.out.println(security.faceControl() + security.driveOut());
        System.out.println(security.toBeLate());

        separate();

        Client client1 = new Client();
        client1.setName("Pink");
        client1.setAge(45);
        client1.setAddress("Bokonbaeva14");
        client1.setMale(false);
        client1.setIeRegular(true);
        client1.setFaceControl(true);
        client1.setAverageOrder(1000);

        System.out.println("Client`s name: " + client1.getName() + "\nClient`s age: " + client1.getAge() + "\nClient`s address: "+ client1.getAddress() + "\nIs male? " + client1.isMale() + "\nIs regular? " + client1.isIeRegular() + "\nPass face control? "+ client1.isFaceControl() + "\nAverage order: " + client1.getAverageOrder());
        System.out.println(client1.order() + client1.pay() + client1.callWaiter());

        separate();

        Client client2 = new Client();
        client2.setName("Blonde");
        client2.setAge(27);
        client2.setAddress("Naberejnaya64");
        client2.setMale(false);
        client2.setIeRegular(false);
        client2.setFaceControl(true);
        client2.setAverageOrder(700);

        System.out.println("Client`s name: " + client2.getName() + "\nClient`s age: " + client2.getAge() + "\nClient`s address: "+ client2.getAddress() + "\nIs male? " + client2.isMale() + "\nIs regular? " + client2.isIeRegular() + "\nPass face control? "+ client2.isFaceControl() + "\nAverage order: " + client2.getAverageOrder());
        System.out.println(client2.order() + client2.pay() + client2.callWaiter());

        separate();

        Client client3 = new Client();
        client3.setName("Orange");
        client3.setAge(13);
        client3.setAddress("Isanova45");
        client3.setMale(true);
        client3.setIeRegular(true);
        client3.setFaceControl(false);
        client3.setAverageOrder(0);

        System.out.println("Client`s name: " + client3.getName() + "\nClient`s age: " + client3.getAge() + "\nClient`s address: "+ client3.getAddress() + "\nIs male? " + client3.isMale() + "\nIs regular? " + client3.isIeRegular() + "\nPass face control? "+ client3.isFaceControl() + "\nAverage order: " + client3.getAverageOrder());
        System.out.println("Can`t order because of face control");
        // System.out.println(client3.order() + client3.pay() + client3.callWaiter());

        separate();

        Client client4 = new Client();
        client4.setName("White");
        client4.setAge(59);
        client4.setAddress("Kara-Balta");
        client4.setMale(true);
        client4.setIeRegular(false);
        client4.setFaceControl(true);
        client4.setAverageOrder(1400);

        System.out.println("Client`s name: " + client4.getName() + "\nClient`s age: " + client4.getAge() + "\nClient`s address: "+ client4.getAddress() + "\nIs male? " + client4.isMale() + "\nIs regular? " + client4.isIeRegular() + "\nPass face control? "+ client4.isFaceControl() + "\nAverage order: " + client4.getAverageOrder());
        System.out.println(client4.order() + client4.pay() + client4.callWaiter());

        separate();

        Client client5 = new Client();
        client5.setName("Blue");
        client5.setAge(33);
        client5.setAddress("USA");
        client5.setMale(true);
        client5.setIeRegular(false);
        client5.setFaceControl(true);
        client5.setAverageOrder(400);

        System.out.println("Client`s name: " + client5.getName() + "\nClient`s age: " + client5.getAge() + "\nClient`s address: "+ client5.getAddress() + "\nIs male? " + client5.isMale() + "\nIs regular? " + client5.isIeRegular() + "\nPass face control? "+ client5.isFaceControl() + "\nAverage order: " + client5.getAverageOrder());
        System.out.println(client5.order() + client5.pay() + client5.callWaiter());

        separate();

        Client client6 = new Client();
        client6.setName("Brown");
        client6.setAge(50);
        client6.setAddress("Vostok5");
        client6.setMale(false);
        client6.setIeRegular(false);
        client6.setFaceControl(false);
        client6.setAverageOrder(0);

        System.out.println("Client`s name: " + client6.getName() + "\nClient`s age: " + client6.getAge() + "\nClient`s address: "+ client6.getAddress() + "\nIs male? " + client6.isMale() + "\nIs regular? " + client6.isIeRegular() + "\nPass face control? "+ client6.isFaceControl() + "\nAverage order: " + client6.getAverageOrder());
        System.out.println("Can`t order because of face control");
        //  System.out.println(client6.order() + client6.pay() + client6.callWaiter());


    }
    public static void separate(){
        System.out.println("..................................");
    }
}
