import java.util.Scanner;

public class App {
    public static String avaliarsenha(String senha) {
        if (senha.length() < 8) {
        return "DICA: senha de ter minimamente 8 digitos";
        }
        boolean temnumero = false;
        for (int i = 0; i < senha.length(); i++) {
            if (Character.isDigit(senha.charAt(i))) {
temnumero = true;
break;

            }
        }
        if (!temnumero) {
            return  "DICA: senha deve conter pelo menos um num.";
        }
        return  "Em analise...";
    
    }

    public static void main (String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello world");
        System.out.println("Digite senha:");
        String senha = scan.nextLine();
        scan.close();
        System.out.println(avaliarsenha(senha));
    }

}


    


