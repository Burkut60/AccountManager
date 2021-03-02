import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        scan();
    }

    public static void scan() {
        String email;
        String fullName;
        String phoneNumber;
        Manager manager = new Manager();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println(" Создать пользователя 1 \n " + "Удалить 2 \n" + " Список пользоателей 3\n" + " Выйти 4 ");
        int menuSelect = scanner1.nextInt();

        switch (menuSelect) {

            case 1:
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите email");
                email = scanner.nextLine();
                System.out.println("Введите ФИО пользователя латиницей");
                fullName = scanner.nextLine();
                System.out.println("Введите телефонный номер");
                phoneNumber = scanner.nextLine();

                manager.create(email, fullName, phoneNumber);
                scan();


            case 2:
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Введите email пользователя которого нужно удалить ");
                String emailDel = scanner2.nextLine();
                manager.delete(emailDel);
                scan();
                break;

            case 3:
                System.out.println(UserProvider.baseUser.size());
                System.out.println(UserProvider.baseUser.keySet());
                scan();
                break;

            case 4:
                System.exit(1);
        }
    }
}