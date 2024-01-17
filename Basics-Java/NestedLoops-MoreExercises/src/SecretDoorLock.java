import java.util.Scanner;

public class SecretDoorLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxPos1 = Integer.parseInt(scanner.nextLine());
        int maxPos2 = Integer.parseInt(scanner.nextLine());
        int maxPos3 = Integer.parseInt(scanner.nextLine());

        for (int pos1 = 1; pos1<=maxPos1; pos1++) {
            if( !(pos1%2==0) ) continue;
            for (int pos2 =2; pos2<=maxPos2; pos2++) {
                if (pos2!=2 && pos2!=3 && pos2!=5 && pos2!=7) continue;
                for (int pos3 =1; pos3<=maxPos3; pos3++) {
                    if( !(pos3%2==0) ) continue;
                    System.out.printf("%d %d %d \n", pos1, pos2, pos3);
                }
            }
        }
    }
}
