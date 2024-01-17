import java.util.Scanner;

public class barcode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String start = scanner.nextLine();
        String end = scanner.nextLine();

        int pos1 = (start.charAt(0) - '0');
        int pos2 = (start.charAt(1) - '0');
        int pos3 = (start.charAt(2) - '0');
        int pos4 = (start.charAt(3) - '0');

        int pos1end = (end .charAt(0) - '0');
        int pos2end = (end .charAt(1) - '0');
        int pos3end = (end .charAt(2) - '0');
        int pos4end = (end .charAt(3) - '0');

        for (int i=pos1; i<=pos1end; i++) {
            for (int j=pos2; j<=pos2end; j++) {
                for (int k=pos3; k<=pos3end; k++) {
                    for (int l=pos4; l<=pos4end; l++) {
                        if (j %2 ==1 && k %2 ==1 && l %2 ==1 && i %2 ==1)
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                    }
                }
            }

        }
        //System.out.printf("start: %d%d%d%d\nend: %d%d%d%d\n", pos1,pos2,pos3,pos4,pos1end,pos2end,pos3end,pos4end);
    }
}
