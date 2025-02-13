
public class IpCozumle {

    public static int get(String ip) {
        String[] sayilar = ip.split("\\.");
        if (sayilar.length > 3) {
            return Integer.parseInt(sayilar[0]);
        }
        return 300;
    }
}
