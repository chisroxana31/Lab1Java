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

    public static int teuersteGegenstand(int[] tastaturen, int[] usbLaufwerke) {
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

    public static int teuersteUSBLaufwerk(int[] usbLaufwerke, int budget) {
        int teuerste = -1;
        for (int preis : usbLaufwerke) {
            if (preis <= budget && preis > teuerste) {
                teuerste = preis;
            }
        }
        return teuerste;
    }
    public static int geldbetragMarkus(int budget, int[] tastaturen, int[] usbLaufwerke) {
        int maxTotalCost = -1; // Set to -1 initially, indicating that it's not possible to buy both items.

        for (int tastaturPreis : tastaturen) {
            for (int usbPreis : usbLaufwerke) {
                int totalCost = tastaturPreis + usbPreis;
                if (totalCost <= budget && totalCost > maxTotalCost) {
                    maxTotalCost = totalCost;
                }
            }
        }

        return maxTotalCost;
    }
}
