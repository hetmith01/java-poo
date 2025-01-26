package com.hht.sesion2;

public class Cuadrado extends FiguraPlana{
    private Double lado;



    Cuadrado(){
        super();
        lado = 0.0;
    }

    public Cuadrado(Double area, Double perimetro, Double lado) {
        super(area, perimetro);
        this.lado = lado;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public Double calcularArea(){
        return lado * lado;
    }

    @Override
    public Double calcularPerimetro(){
        return 4*lado;
    }


    @Override
    public String toString() {
        return "Cuadrado{" +
                "area: " + getArea() +
                "perimetro: " + getPerimetro() +
                "lado=" + lado +
                '}';
    }
}
