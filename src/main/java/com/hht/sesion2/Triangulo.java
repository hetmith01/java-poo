package com.hht.sesion2;

public class Triangulo extends FiguraPlana{
    private Double base;
    private Double altura;

    public Triangulo(){
        super();
        this.base = 0.0;
        this.altura = 0.0;
    }

    public Triangulo(Double area, Double perimetro, Double base, Double altura){
        super(area, perimetro);
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public Double calcularArea(){
        return base * altura/2;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
