public class LibraryInterfaceDemo {
    
    public static void main(String[] args) {
        KidUser kidUser1 = new KidUser(10, "Kids");
        KidUser kidUser2 = new KidUser(18, "Fiction");
        kidUser1.registerAccount();
        kidUser1.requestBook();
        kidUser2.registerAccount();
        kidUser2.requestBook();

        AdultUser adultUser1 = new AdultUser(5, "Kids");
        AdultUser adultUser2 = new AdultUser(23, "Fiction");
        adultUser1.registerAccount();
        adultUser1.requestBook();
        adultUser2.registerAccount();
        adultUser2.requestBook();
    }
}
