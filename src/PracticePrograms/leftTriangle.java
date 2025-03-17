package PracticePrograms;

public class leftTriangle {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i <= n; i++) {
            for (int j = 10; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
