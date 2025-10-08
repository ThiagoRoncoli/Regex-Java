package RegexEx4;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();


        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{9}$");
        Matcher matcher = pattern.matcher(senha);

        if(matcher.matches()){
            System.out.println("Senha válida!");
        }else{
            System.out.println("Senha inválida!");
        }

        scanner.close();
    }
}
