import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String email;
        String fullName;
        String phoneNumber;
        Manager manager = new Manager();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Создать пользователя 1 \n " +
                "Удалить 2 \n" +
                "проверить 2 ");
        int menuSelect = scanner.nextInt();

        switch (menuSelect){

            case 1:
                System.out.println("Введите email");
                email = scanner.nextLine();
                System.out.println("Введите ФИО пользователя латиницей");
                fullName = scanner.nextLine();
                System.out.println("Введите телефонный номер");
                phoneNumber = scanner.nextLine();

                manager.create(email,fullName,phoneNumber);
                break;

            case  2:
                System.out.println("Введите email пользователя которого нужно удалить ");
               String emailDel =  scanner.nextLine().toString();
               manager.delete(emailDel);
                break;

            case 3:


                break;

        }


    }
}
