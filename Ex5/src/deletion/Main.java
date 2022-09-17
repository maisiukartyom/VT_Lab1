package deletion;

public class Main {

    public static void main(String[] args) {
        int arr[] = {30, 40, 2, 5, 1, 7, 45, 50, 8};
        int n = arr.length;
        ThrowOut thr = new ThrowOut();
        System.out.println("Минимальное кол-во удалений = " + thr.minimumNumberOfDeletions(arr, n));
    }

}
