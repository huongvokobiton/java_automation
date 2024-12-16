package javabasic.bien;

public class BienInstance {
    // Biến toàn cục
    String name = "Phuong";
    int age = 25;
    String address = "Đà Nẵng";

    public void getInfo1() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public void getInfo2() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        BienInstance bienInstance = new BienInstance(); //new doi tuong dai dien cho mot classl
        System.out.println(bienInstance.address);
        System.out.println(bienInstance.age);
    }
}
