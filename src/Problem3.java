public class Problem3 {


    public static int fromArrayToInt(int array[]){
        int finalZahl = 0;
        for(int i=0;i<array.length;i++) {
            finalZahl = finalZahl*10 + array[i];
        }
        return finalZahl;
    }
    public static int[] summeZahlen(int array1[], int array2[])
    {
        int n = array1.length;
        int[] result = new int[n];
        int carry = 0;

        for (int i = n - 1; i >= 0; i--) {
            int sum = array1[i] + array2[i] + carry;
            result[i] = sum % 10;
            carry = sum / 10;
        }

        // If there is a carry left after adding all digits, extend the result.
        if (carry > 0) {
            int[] newResult = new int[n + 1];
            newResult[0] = carry;
            System.arraycopy(result, 0, newResult, 1, n);
            result = newResult;
        }

        return result;

    }
    public static int[] differenzZahlen(int[] zahl1, int[] zahl2) {
        int n = zahl1.length;
        int[] result = new int[n];
        int borrow = 0;

        for (int i = n - 1; i >= 0; i--) {
            int diff = zahl1[i] - zahl2[i] - borrow;

            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }

            result[i] = diff;
        }

        return result;
    }

}
