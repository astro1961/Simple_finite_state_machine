import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Machine machine = new Machine();
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        System.out.println("Введите число от 1 до 6");
        while(true) {

            a = scanner.nextInt();

            if(machine.theTest(a)){
                System.out.println("Вы угадали! ");
                break;}
                else {
                System.out.println("Nope!");
            }


        }
    }
}
