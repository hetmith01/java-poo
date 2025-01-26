package com.hht.sesion2;

public class HerenciaApp {
    public static void main(String[] args) {
        FiguraPlana figuraPlana = new FiguraPlana();
        Cuadrado cuadrado = new Cuadrado();
        Triangulo triangulo = new Triangulo();
        System.out.println(figuraPlana);
        System.out.println(cuadrado);
        System.out.println(triangulo);

        cuadrado = new Cuadrado(4.0, 8.0, 4.0);
        System.out.println(cuadrado);

    }}
