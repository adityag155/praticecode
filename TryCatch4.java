class TryCatch4 {
    public static void main(String args[]) {
        try {
            System.out.println("Start of inner try");
            int m = 100;
            int n = Integer.parseInt(args[0]);
            int k = m / n;
            System.out.println("K=" + k);
            System.out.println("End of inner try");
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero");
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("Outer catch");
        } finally {
            System.out.println("End of outer try");
        }
    }
}