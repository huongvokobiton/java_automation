package javabasic.phuongthuc;

public class TinhToan {
    public static int congHaiSoNguyen() {
        return 5 + 10;
    }

    public static void congBaSoNguyen() {
        System.out.println(5 + 10 + 5);
    }

    static void welcome(String name) {
        System.out.println("Xin chào " + name);
    }

    public static void main(String[] args) {
        System.out.println(congHaiSoNguyen() + 20);
        welcome("Huong");
    }
}
