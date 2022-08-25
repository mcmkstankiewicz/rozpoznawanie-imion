import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> imiona = new ArrayList<>();
        File fileObj = new File("src/imiona.txt");
        try (Scanner fReader = new Scanner(fileObj)) {
            while (fReader.hasNextLine()) {
                imiona.add(fReader.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(imiona);
        System.out.println("Podaj swoje imię: ");
        Scanner scanner = new Scanner(System.in);
        String imie = scanner.nextLine();
        Boolean kobieta = false;
        if (imie.isEmpty()){
            System.out.println("Nic nie zostało wpisane. Ponów próbę.");
        }else {
            System.out.println("Witaj " + imie + ".");
            if (!imie.endsWith("a") || imiona.contains(imie.toLowerCase())) {
                System.out.println("Posiadasz imię męskie.");
            } else {
                System.out.println("Posiadasz imię żeńskie.");
                kobieta = true;
            }
        }
        String odp = "Jesteś pełnoletni";
        if (kobieta){
            odp=odp+"a";
        }
        System.out.println("Podaj swoj wiek: ");
        int wiek = scanner.nextInt();
        if (wiek >= 18){
            System.out.println(odp);
        } else {
            System.out.println("Nie masz ukończonych 18 lat.");
        }
        scanner.close();
    }

}