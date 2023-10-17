public class Problem1 {
    /*
    Schreiben Sie eine Methode, die ein Array von Noten bekommen soll. Als die
    Rückgabewert soll die Methode ein Array mit nicht ausreichende Note liefern.
     */
    public static int[] ausreichend(int[] noten){
        int[] rez = new int[101];
        int j = 0;
        for(int i = 0; i< noten.length; i++)
        {
            if(noten[i] < 40)
            {
                rez[j++] = noten[i];
            }
        }
        return rez;
    }

    /*
    Schreiben Sie eine Methode, die ein Array von Noten bekommen soll. Als die
    Rückgabewert soll die Methode den Durchschnittswert liefern.
     */
    public static int durchsnittswert(int[] noten){
        int wert = 0;
        for(int i = 0; i< noten.length; i++)
        {
            wert += noten[i];
        }
        return wert/(noten.length);
    }

    /*
    Schreiben Sie eine Methode, die ein Array von Noten bekommen soll. Als die
    Rückgabewert soll die Methode eine Array mit die abgerundete Note liefern.
     */

    public static int roundedGrade(int note) {
        if (note >= 38) {
            int rounded = (note / 5 + 1) * 5;
            if (rounded - note < 3) {
                return rounded;
            }
        }
        return note;
    }

    public static int[] roundedGrades(int[] notenArr) {
        int length = notenArr.length;
        int[] temp = new int[length];

        int cnt = 0;
        for (int j : notenArr) {
            int rounded = roundedGrade(j);
            if (rounded != j) {
                temp[cnt++] = rounded;
            }
        }
        int[] arr = new int[cnt];
        System.arraycopy(temp, 0, arr, 0, cnt);
        return arr;
    }

    public static int maximaleNoten(int noten[]){

        int rez = Integer.MIN_VALUE;
        for(int i = 0; i< noten.length; i++ ){
            if(noten[i] > rez)
                rez = noten[i];
        }
        return roundedGrade(rez);
    }


}
