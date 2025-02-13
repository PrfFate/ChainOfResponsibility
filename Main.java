
public class Main {

    public static void main(String[] args) {

        Yerel yerel = new Yerel();
        Intranet intranet = new Intranet();
        Internet internet = new Internet();

        yerel.setSonraki(intranet);
        intranet.setSonraki(internet);

        yerel.uygula(new Istek(Istek.Tip.GET, "92.168"));

    }
}
