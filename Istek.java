
public class Istek {

    enum Tip {
        GET,
        POST,
        DELETE
    }
    private Tip tip;
    private String ip;

    public Istek(Tip tip, String ip) {
        this.tip = tip;
        this.ip = ip;
    }

    public Tip getTip() {
        return tip;

    }

    public void setTip(Tip tip) {
        this.tip = tip;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
