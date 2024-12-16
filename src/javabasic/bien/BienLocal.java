package javabasic.bien;

public class BienLocal {

    public void sayHello() {
        int n = 10;                     // Đây là biến local
        System.out.println("Gia tri cua n la: " + n);
    }

    public static void main(String[] args) {
        BienLocal bienLocal = new BienLocal();
        bienLocal.sayHello();
    }

}
