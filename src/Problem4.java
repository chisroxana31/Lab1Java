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

}
