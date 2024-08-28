import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int x = n.nextInt();
        int y = n.nextInt();
        int z = n.nextInt();
        switch (z){
            case 1:
            System.out.println(x+y);
            break;
            case 2:
                System.out.println(x-y);
                break;
            case 3:
                System.out.println(x*y);
                break;
            default:
                System.out.println("Hello");

        }
    }
}
