public class App {
    public static void main(String[] args) throws Exception {
        iPhone iphone1 = new iPhone();
        iphone1.color = "Hitam";
        iphone1.storage = "128GB";

        iPhone iphone2 = new iPhone();
        iphone2.color = "Putih";
        iphone2.storage = "256GB";

        iphone1.nyala();
        iphone1.berdering();
        iphone1.videoCall();
        iphone1.mati();

        System.out.println();

        iphone2.nyala();
        iphone2.berdering();
        iphone2.videoCall();
        iphone2.mati();
    }
}
