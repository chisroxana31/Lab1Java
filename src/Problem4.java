public class Problem4 {
    public static int billigsteTastatur(int[] tastaturen) {
        int billigste = Integer.MAX_VALUE;
        for (int preis : tastaturen) {
            if (preis < billigste) {
                billigste = preis;
            }
        }
        return billigste;
    }

    public static int teuersteGegenstand(int[] tastaturen, int[] usbLaufwerke]) {
        int teureste = Integer.MIN_VALUE;
        for (int preis : tastaturen) {
            if (preis > teureste) {
                teureste = preis;
            }
        }

        for (int preis : usbLaufwerke) {
            if (preis > teureste) {
                if (preis > teureste)
                    teureste = preis;
            }
        }
        return teureste;
    }
}
