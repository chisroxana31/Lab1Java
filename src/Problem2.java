public class Problem2 {
    public static int maxim(int noten[]){
        int maxValue = Integer.MIN_VALUE;
        for(int i = 0; i< noten.length; i++)
        {
            if(noten[i] > maxValue)
                {
                    maxValue = noten[i];
                }
        }
        return maxValue;
    }
    public static int minim(int noten[]){
        int minValue = Integer.MAX_VALUE;
        for(int i = 0; i< noten.length; i++){
            if(noten[i] < minValue){
                minValue = noten[i];
            }
        }
        return minValue;
    }

    public static int minSumme(int noten[]){
        int maxValue = maxim(noten);
        int summe = 0;

        for(int i = 0; i< noten.length; i++)
        {
            if(noten[i] != maxValue)
            {
                summe += noten[i];
            }
        }
    return summe;

    }
    public static int maxSumme(int noten[]){
        int minValue = minim(noten);
        int summe = 0;

        for(int i = 0; i< noten.length; i++)
        {
            if(noten[i] != minValue)
            {
                summe += noten[i];
            }
        }
        return summe;

    }
}
