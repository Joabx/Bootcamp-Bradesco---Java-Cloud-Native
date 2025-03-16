import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        
        int p1,p2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        p1 = scanner.nextInt();
      //  System.out.println(p1);

        System.out.println("Digite o segundo parâmetro: ");
        p2 = scanner.nextInt();  
      //  System.out.println(p2);


        try {
            contar(p1, p2);
            
        } catch (ParametrosInvalidosException e) {
            System.out.println("O SEGUNDO parâmetro deve ser maior que o PRIMEIRO parâmetro!!!");
        }

        scanner.close();

    }

    static void contar(int p1, int p2) throws ParametrosInvalidosException {
        int contagem = p2 - p1;
        

        if (p1 > p2) {
            throw new ParametrosInvalidosException();
        }
       
        for (int i = 0; i <= contagem; i++) {
            System.out.println("Imprimindo numero "+ i);
        }
    }
}
