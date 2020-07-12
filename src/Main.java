import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float Remains = 100.25f; //остаток на счёте
         //Payment =0.00f;
        Scanner in = new Scanner(System.in);
        System.out.println("Ваш остаток на счёте "+Remains + " рублей, Внесите платёж");
        float Payment = in.nextFloat();
        //float Payment = 125f; //платёж
        int Bonus = 0; //Бонус
        float Balanse = 0; //итого на счету
        if (Payment >= 1000) {
            Bonus = (int) Payment / 100;
            Balanse = Remains + Payment + Bonus;
        } else {
            Balanse = Remains + Payment;
        }
        System.out.println("Ваш бонус " + Bonus + " рублей");
        System.out.println("Итого на вашем счету " + Balanse + " рублей");
    }
}
