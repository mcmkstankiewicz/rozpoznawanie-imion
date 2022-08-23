import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj swoje imię: ");
        Scanner scanner = new Scanner(System.in);
        String imie = scanner.nextLine();

        if (imie.isEmpty()){
            System.out.println("Nic nie zostało wpisane. Ponów próbę.");
        }else {
            System.out.println("Witaj " + imie + ".");
            //TODO wiecej imion
            if (!imie.endsWith("a") || imie.equals("Barnaba") || imie.equals("Kuba")) {
                System.out.println("Posiadasz imię męskie.");
            } else {
                System.out.println("Posiadasz imię żeńskie.");
            }
        }

        System.out.println("Podaj swoj wiek: ");
        int wiek = scanner.nextInt();
        if (wiek >= 18){
            System.out.println("Jesteś pełnoletni/a.");
            //TODO gender recognition
        } else {
            System.out.println("Nie masz ukończonych 18 lat.");
        }
    }

}