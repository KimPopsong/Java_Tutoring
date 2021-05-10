package Array;

public class Array2 {
    int a = 3;
    int b = 4;
    int c = 5;
    int n = 0;

    public Array2(int i) {
        n = i;
    }

    public static void main(String[] args) {
        Array2[] arr1 = new Array2[3];

        for (int i = 0; i < 3; i++) {
            arr1[i] = new Array2(i);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("arr1[" + i + "]'s a : " + arr1[i].a);
            System.out.println("arr1[" + i + "]'s b : " + arr1[i].b);
            System.out.println("arr1[" + i + "]'s c : " + arr1[i].c);
            System.out.println(arr1[i].n);
        }
    }
}
