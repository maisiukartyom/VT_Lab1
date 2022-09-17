package shell;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            float[] array = {2,7,5,1,54,7};

            Shell s = new Shell();
            s.sort(array);

            for(int i = 0; i < 6; i++){
                System.out.print(array[i]+" ");
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
