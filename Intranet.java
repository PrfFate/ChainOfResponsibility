
public class Intranet extends Servis {

    public void uygula(Istek istek) {
        if (IpCozumle.get(istek.getIp()) < 200) {
            System.out.println("Intranet ortaminda " + istek.getIp() + " makinesine " + istek.getTip() + " istegi uygulandi");
        } else {
            if (getSonraki() != null) {
                getSonraki().uygula(istek);
            }
        }

    }

}
