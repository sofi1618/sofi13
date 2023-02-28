package stepik;

public class NextEven {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n+2-(n%2));
        sc.close();
    }
}
