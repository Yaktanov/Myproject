import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите имя: ");
            String name = scanner.nextLine();

            System.out.println("Введите фамилию: ");
            String surname = scanner.nextLine();

            System.out.println("Введите возраст: ");
            int age = scanner.nextInt();

            System.out.println("Пол: ");
            char c = scanner.next(".").charAt(0);

            String s = scanner.nextLine();
            if (s == "stop") {
                break;
            }
            System.out.println(name + " " + surname + ", " + age + " лет" + ", " + "Пол: " + c + ", ");


        }
    }
}
