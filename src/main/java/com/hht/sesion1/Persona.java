package com.hht.sesion1;

import java.util.Objects;

public class Persona {

    private String nombre;

    private String phone;

    private String address;

    private Integer age;

    Persona(){
        this.nombre = "";
        this.phone = "";
        this.address = "";
        this.age = 0;
    }

    Persona(String nombre, String phone, String address, Integer age){
        this.nombre = nombre;
        this.phone = phone;
        this.address = address;
        this.age = age;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre= " + nombre +
                ", phone= " + phone +
                ", address= " + address +
                ", age= " + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre) && Objects.equals(phone, persona.phone) && Objects.equals(address, persona.address) && Objects.equals(age, persona.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, phone, address, age);
    }
}
