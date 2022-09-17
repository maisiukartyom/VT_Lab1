package matrix;

public class Main {

    public static void main(String[] args) {
        try {
            int[] array = {2,5,8,3,1,5};

            Matrix m = new Matrix();
            int[][] mm = m.create(array);

            for(int i = 0; i < 6; i++){
                for (int j = 0; j < 6; j++){
                    System.out.print(mm[i][j]+" ");
                }
                System.out.print("\r\n");
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
