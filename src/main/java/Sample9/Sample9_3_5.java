public class Sample9_3_5 {
    public static void main(String[] args) {
        int i = 0, j = 0;
        String st = null;
        try {
            st = args[0];
            i = Integer.parseInt(st);
            j = 10 / i;
        } catch (NumberFormatException |
                 ArrayIndexOutOfBoundsException |
                 ArithmeticException e) {
            System.out.println("例外が発生しました:" + e);
        }
        System.out.print("整数値:" + i);
    }
}
