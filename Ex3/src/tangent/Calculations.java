package tangent;

public class Calculations {

        public void printTable(int[] values, double[] tanValues) {
            System.out.println("arg     tan");
            for (int i = 0; i < values.length; i++) {
                System.out.println(values[i] + "      " + tanValues[i]);
            }
        }
        public double[] getTanValues(int[] values) {
            double[] tanValues = new double[values.length];
            for (int i = 0; i < values.length; i++) {
                tanValues[i] = tanget(values[i]);
            }
            return tanValues;
        }

        public void isCorrectInput(int begin, int end, int step) throws Exception {
            if (begin > end) {
                throw new Exception("Wrong parameters");
            }
            if (step <= 0) {
                throw new Exception("Wrong step value");
            }
        }

        public int[] getStepsOnTheLine(int begin, int end, int step) {
            int[] values = new int[Math.abs((end - begin) / step + 1)];
            int value = begin;
            int index = 0;
            while (value <= end) {
                values[index] = value;
                value += step;
                index++;
            }
            return values;
        }

        public double tanget(int value) {
            return Math.tan(value);
        }
}
