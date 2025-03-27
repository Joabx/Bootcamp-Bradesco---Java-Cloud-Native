package Exercicios_5.Calculo_Areas;

public class Circulo implements FormasGeometricas{

    private double raio, area;

    /*Construtores */
    public Circulo(double raio){
        this.raio = raio;
        
    }


    @Override
    public double calcularAreas() {


        area = Math.PI * Math.pow(raio, 2);
        return area;
    
    
    }
        

    
}
