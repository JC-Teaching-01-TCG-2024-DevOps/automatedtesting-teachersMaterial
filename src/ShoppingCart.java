import java.util.Arrays;

public class ShoppingCart {
    public static int arr[] = { 1, 2, 3, 4, 5, 6 };

    static int cartLength() {
        return arr.length;
    }

    static int[] cartAdd(int newNum) {
        int n = cartLength();
        int newArr[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            newArr[i] = arr[i];
        }
        newArr[n] = newNum;
        arr = newArr;
        return arr;
    }

    static int[] cartRemove(int removeIndex) {
        int n = cartLength();
        int newArr[] = new int[n - 1];
        for (int i = 0, k = 0; i < n; i++) {
            if (i != removeIndex) {
                newArr[k] = arr[i];
                k++;
            }
        }
        arr = newArr;
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(cartLength());
        System.out.println(Arrays.toString(cartAdd(8)));
        System.out.println(cartLength());
        System.out.println(Arrays.toString(cartRemove(2)));
        System.out.println(cartLength());
    }
}
