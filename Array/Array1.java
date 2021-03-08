package Array;

public class Array1 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2;
        arr2 = new int[5];
        int[] arr3 = {10, 11, 12, 13, 14};

        for(int i = 0; i < 5; i++)
        {
            arr1[i] = i;
            arr2[i] = i + 5;
        }

        for(int i = 0; i < 5; i++)
        {
            System.out.println("arr1[" + i + "] : " + arr1[i]);
            System.out.println("arr2[" + i + "] : " + arr2[i]);
            System.out.println("arr3[" + i + "] : " + arr3[i]);
        }
    }
}
