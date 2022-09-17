package array;

public class Main {

    public static void main(String[] args) {
        try {
            int[] array = {1,2,1,5,13,5,7};

            Sieve s = new Sieve();
            for (int item: s.simple(array)) {
                System.out.print(item);
            }
        }
        catch(java.util.InputMismatchException e) {
            System.out.print("Input error.");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
