package com.hht.sesion2;

public class FiguraPlana {
    private Double area;
    private Double perimetro;

    FiguraPlana(){
        this.area = 0.0;
        this.perimetro = 0.0;
    }

    FiguraPlana(Double area, Double perimetro){
        this.area = area;
        this.perimetro = perimetro;
    }


    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = this.calcularArea();
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = this.calcularPerimetro();
    }

    @Override
    public String toString() {
        return "FiguraPlana{" +
                "area=" + area +
                ", perimetro=" + perimetro +
                '}';
    }

    public Double calcularArea(){
        return area;
    }

    public Double calcularPerimetro(){
        return perimetro;
    }

}













