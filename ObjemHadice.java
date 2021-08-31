import java.util.Scanner;

public class ObjemHadice {

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);

        System.out.println("Priemery hadic:\n1'' = 3,2cm\n1/2'' = 1,6cm\n3/4'' = 2,5cm\n5/4'' = 4,0cm");
        System.out.println("Zadaj priemer hadice v cm:");
        double r = s.nextDouble();
        System.out.println("Zadaj dlzku hadice v cm:");
        double h = s.nextDouble();

        double volume = ((22 * (r / 2) * (r / 2) * h) / 7);
        double liter = volume / 1000;

        double volume2 = (double) (Math.round(volume * 100.0) / 100.0);
        double liter2 = (double) (Math.round(liter * 100.0) / 100.0);

        System.out.println("Objem hadice je: " + volume2 + " cm'3\n" + "Do hadice sa zmesti: " + liter2 + " L vody.");

        s.close();
    }

}