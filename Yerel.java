
public class Yerel extends Servis {

    @Override
    public void uygula(Istek istek) {
        if (IpCozumle.get(istek.getIp()) < 100) {
            System.out.println("Yerel agdaki : " + istek.getIp() + "makinesine" + istek.getTip() + "istegi uygulandi");
        } else {
            if (getSonraki() != null) {
                getSonraki().uygula(istek);
            }
        }

    }

}
