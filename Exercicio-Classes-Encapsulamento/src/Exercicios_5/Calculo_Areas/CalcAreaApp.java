package Exercicios_5.Calculo_Areas;

import java.util.Scanner;

public class CalcAreaApp {

    public static void main(String[] args) {

        int selecao;
        FormasGeometricas formasGeometricas;
        double areaQuadrado, areaRetangulo, areaCirculo;


        Scanner scanner = new Scanner(System.in);

        do{

            Utils.menu();
            selecao = scanner.nextInt();

            switch (selecao) {
                case 0:
                    Utils.simularEspera(400);
                    break;

                case 1:
                    
                    System.out.println("Digite o valor de 1 lado do quadrado...");
                    double lado = scanner.nextDouble();
                    formasGeometricas = new Quadrado(lado);
                    areaQuadrado = formasGeometricas.calcularAreas();
                    System.out.println("Área do quadrado é " +areaQuadrado);
                    Utils.simularEspera(200);
                    break;
                
                case 2:

                    System.out.println("Digite o valor da base do retângulo...");
                    double base = scanner.nextDouble();
                    System.out.println("Digite o valor da altura do retângulo...");
                    double altura = scanner.nextDouble();
                    formasGeometricas = new Retangulo(base, altura);
                    areaRetangulo = formasGeometricas.calcularAreas();
                    System.out.println("Área do retângulo é " +areaRetangulo);
                    Utils.simularEspera(200);
                    break;

                case 3:
                    
                    System.out.println("Digite o valor do raio do circulo...");
                    double raio = scanner.nextDouble();
                    formasGeometricas = new Circulo(raio);
                    areaCirculo = formasGeometricas.calcularAreas();
                    System.out.println("Área do circulo é " +areaCirculo);
                    Utils.simularEspera(200);
                    break;

                default:

                    System.out.println("Valor inválido...");
                    Utils.simularEspera(200);
                    break;

            }
            



        }while(selecao > 0 );

        

        scanner.close();
    }
    
}
