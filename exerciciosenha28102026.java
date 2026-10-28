import java.util.Scanner;

public class App {
    
    public static String avaliarsenha(String senha) {
        if (senha.length() <8) {
        return "DICA: senha deve ter, no minimo 8 caracteres";
        }

        boolean numero = false;
        for (int i = 0; i < senha.length(); i++) {
            if (Character.isDigit(senha.charAt(i))) {
                numero= true;
                break;

            }
        }

    if (!numero) {
        return "DICA: senha deve conter ao menos um numero";
    }

        boolean letra = false;
        for (int i = 0; i < senha.length(); i++) {
            if(Character.isUpperCase(senha.charAt(i))){
                letra = true;
                break;
            }
        }
        if (!letra) {
            return "DICA: senha deve ter letras maiusculas";
        }

        String [] obvia = {"12345678,senha123,password"};
        for (int i = 0; i < senha.length(); i++ ) {
          if(senha.equals(obvia[i])) {
                return "dica: senha obvia";
            }
        

     return "Analise";
        }
        }


        public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("senha: ");
            String senha = scan.nextLine();
            System.out.println("Resultado: " + avaliarsenha(senha));
            if (resultado.startsWith("sucesso")) {
                break;
            }

            System.out.println("tente novamente:");
        }
                scan.close();
            } 
        }
        