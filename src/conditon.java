import java.util.Scanner;

public class conditon {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter x :");
        int x = n.nextInt();
        System.out.println("Enter y :");
        int y = n.nextInt();
        System.out.println("Enter choice :");
        int z = n.nextInt();
        if(z==1){
            System.out.println("Sum = "+(x+y));
        }
        else if (z == 2){
            System.out.println("Sub = "+(x-y));
        }
        else if (z == 3) {
            System.out.println("Multi = "+(x*y));
        }
        else{
            System.out.println("ivalid");
        }

    }
}
