public class ArrayReverser {
    public static int[] reverse(int[] origArr){
        int allArrayLength = origArr.length;
        int[] reverseArr = new int[allArrayLength];
        for (int i = 0, j = allArrayLength - 1; i < reverseArr.length; i++, j--){
            int el = origArr[i];
            int reverseArrInitialEl = reverseArr[i];
            reverseArr[j] = el;
        }
//        for (int el: reverseArr){
//            System.out.printf("%d\n", el);
//        }
        return reverseArr;
    }
}