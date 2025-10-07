
import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código de referência: ");
        String cod = scanner.nextLine();

	Pattern pattern = Pattern.compile("^[A-Z]{3}-\\d{4}$");
        Matcher matcher = pattern.matcher(cod);

        if(matcher.find()){
            System.out.println("O código de referência esta válido!");
        }else{
            System.out.println("O código de referência não está válido!");
        }
        scanner.close();
    }
}
