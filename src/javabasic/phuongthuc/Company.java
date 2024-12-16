package javabasic.phuongthuc;

public class Company {
    public static String COMPANY_NAME = "Axon";
    public static String ADDRESS = "Ho Chi Minh";
    public static String PHONE = "0764367289";
    public static String EMAIL = "huvo@axon.com";

    public static void getInfoCompany() {
        System.out.println("Company name: " + COMPANY_NAME);
        System.out.println("Address: " + ADDRESS);
        System.out.println("Phone: " + PHONE);
        System.out.println("Email: " + EMAIL);
    }

    public static String getCompanyName() {
        return COMPANY_NAME;
    }

    public static String getEmail() {
        return EMAIL;
    }
}
