import java.util.Scanner;
public class clase2 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();

        System.out.println("Ingrese el numero con el que quiere saber si es multiplo:  ");
        int num_divisor = sc.nextInt();

        int len_of_number = Integer.toString(num).length();
        int sum = 0;

        String num_str = Integer.toString(num);

        for(int i = 0; i<len_of_number; i++) {
            char digit_str = num_str.charAt(i);
            System.out.print(digit_str + " - ");

            int digit = Character.getNumericValue(digit_str);
            sum += digit;
        }
        System.out.println("");
        if (num % num_divisor == 0){
            System.out.println("Es multiplo de " + num_divisor);
        }else{
            System.out.println("No es multiplo de " + num_divisor);
        }
        System.out.println("Y su suma es: " + sum);
    }
}
