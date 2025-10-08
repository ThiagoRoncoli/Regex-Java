package RegexEx3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o texto: Olá ");
        String texto = scanner.nextLine();

        Pattern pattern = Pattern.compile("#\\w+");
        Matcher matcher = pattern.matcher(texto);

        if(matcher.find()){
            System.out.println("Hashtags encontradas: " + texto);
        }else{
            System.out.println("texto inválido!");
        }

        scanner.close();
    }
}