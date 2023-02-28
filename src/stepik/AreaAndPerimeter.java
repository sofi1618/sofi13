package stepik;

public class AreaAndPerimeter {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.print((a*b) + "\n" + (2*(a+b)));
        sc.close();
    }
}
