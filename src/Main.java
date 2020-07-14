import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float remains = 100.25f; //остаток на счёте
        Scanner in = new Scanner(System.in);
        System.out.println("Ваш остаток на счёте " + remains + " рублей, Внесите платёж");
        float payment = in.nextFloat();
        //float Payment = 125f; //платёж
        int bonus = 0; //Бонус
        float balanse = 0; //итого на счету
        if (payment >= 1000) {
            bonus = (int) payment / 100;
            balanse = remains + payment + bonus;
        } else {
            balanse = remains + payment;
        }
        System.out.println("Ваш бонус " + bonus + " рублей");
        System.out.println("Итого на вашем счету " + balanse + " рублей");
    }
}
