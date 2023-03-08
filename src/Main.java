import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền bạn muốn vay : ");
        Double money = scanner.nextDouble();
        System.out.println("Nhập thời gian (tháng) bạn muốn vay : ");
        int month = scanner.nextInt();

        for (int i=1; i<= month; i++){
           money +=  money * 0.1 ;

      }
        System.out.println(money);
    }
}