package image;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        String filename = "abc.png";
        ProxyImage img = new ProxyImage(filename);
        img.display();
    }
}