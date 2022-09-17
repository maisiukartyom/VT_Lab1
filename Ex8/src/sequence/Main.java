package sequence;

public class Main {

    public static void main(String[] args) {
        try {
            int[] arrayA = {2,5,7,9,12,15};

            for(int i = 0; i < 6; i++){
                System.out.print(arrayA[i]+" ");
            }
            System.out.println();

            int[] arrayB = {1,2,5,7,8,9,11,12};

            Sequence seq = new Sequence();
            arrayA = seq.getMergingIndexes(arrayA, arrayB);

            for(int i = 0; i < 8; i++){
                System.out.print(arrayA[i]+" ");
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
