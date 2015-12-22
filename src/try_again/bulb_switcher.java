package try_again;

/**
 * Created by Administrator on 2015/12/22.
 */
public class bulb_switcher {
    public int bulbSwitch(int n) {
        int res = 0;

        Boolean[] bs = new Boolean[n];
        for (int i = 0; i < bs.length; i++) {
            bs[i] = true;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < bs.length; j++) {
                if ((j + 1) % i == 0) {
                    bs[j] = !bs[j];
                }
            }
        }

        for (Boolean b : bs) {
            if (b) {
                res++;
            }
        }

        return res;
    }
}
