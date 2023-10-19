public class Problem1 {
    /*
    Schreiben Sie eine Methode, die ein Array von Noten bekommen soll. Als die
    Rückgabewert soll die Methode ein Array mit nicht ausreichende Note liefern.
     */
    public static int[] ausreichend(int[] noten){
        int[] nichtAusreichende= new int[noten.length];
        int j = 0;
        for(int i : noten)
        {
            if(i < 40)
            {
                nichtAusreichende[j] = i;
                j += 1;
            }
        }
        int[] result = new int[j];
        System.arraycopy(nichtAusreichende, 0, result, 0, j);

        return result;
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

    public static int abgerundetenNote(int note) {
        if (note >= 38) {
            int rounded = (note / 5 + 1) * 5;
            if (rounded - note < 3) {
                return rounded;
            }
        }
        return note;
    }

    public static int[] abgerundetenNoten(int[] notenArr) {
        int length = notenArr.length;
        int[] temp = new int[length];

        int cnt = 0;
        for (int i = 0; i < length; i++) {
            temp[i] = abgerundetenNote(notenArr[i]);
        }

        return temp;

    }

    public static int maximaleNoten(int noten[]){

        int rez = Integer.MIN_VALUE;
        for(int i = 0; i< noten.length; i++ ){
            if(noten[i] > rez)
                rez = noten[i];
        }
        return abgerundetenNote(rez);
    }


}
