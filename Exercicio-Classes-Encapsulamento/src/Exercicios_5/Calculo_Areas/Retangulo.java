package Exercicios_5.Calculo_Areas;

public class Retangulo implements FormasGeometricas {

    private double base, altura, area;




    
    /*Construtores */
    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
        
    }

    @Override
    public double calcularAreas() {

        area = base * altura;

        return area;
        


    }
    

    
}
