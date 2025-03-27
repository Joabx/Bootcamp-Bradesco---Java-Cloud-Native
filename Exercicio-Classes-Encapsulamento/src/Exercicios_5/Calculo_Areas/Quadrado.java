package Exercicios_5.Calculo_Areas;

public class Quadrado implements FormasGeometricas{

    private double lado, area;



    /*Construtores */
    public Quadrado(double lado){
        this.lado = lado;
        
    }

    @Override
    public double calcularAreas() {
       
        area = lado * lado;
        return area;
    }


    
}
