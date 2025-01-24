package com.hht.sesion1;

import com.hht.sesion1.Persona;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonaTest {

    @Test
    public void testConstructorSinParametros(){
        //GIVEN AND WHEN
        Persona persona = new Persona();
        //THEN
        assertEquals("", persona.getNombre());
        assertEquals("", persona.getAddress());
        assertEquals(0, persona.getAge());
        assertEquals("", persona.getPhone());
    }

    @Test
    public void testCostructorConParametros(){
        //GIVEN
        Persona persona;
        String nombre = "Juaquin";
        String phone = "+05498989898";
        String address = "Villa el Triunfo";
        Integer age = 32;
        //WHEN
        persona = new Persona(nombre, phone, address, age);
        //THEN
        assertEquals(nombre, persona.getNombre());
        assertEquals(phone, persona.getPhone());
        assertEquals(address, persona.getAddress());
        assertEquals(age, persona.getAge());
    }

    //test SetParametros
    @Test
    public void testMetodosSet(){
        //GIVEN
        Persona persona = new Persona();
        String nombre = "Juaquin";
        String phone = "+05498989898";
        String address = "Villa el Triunfo";
        Integer age = 32;
        //WHEN
        persona.setNombre(nombre);
        persona.setAddress(address);
        persona.setPhone(phone);
        persona.setAge(age);
        //THEN
        assertEquals(nombre, persona.getNombre());
        assertEquals(phone, persona.getPhone());
        assertEquals(address, persona.getAddress());
        assertEquals(age, persona.getAge());

    }



    //test GetParametros
    @Test
    public void testFuncionesGet(){
        //GIVEN
        String nombre = "Juaquin";
        String phone = "+05498989898";
        String address = "Villa el Triunfo";
        Integer age = 32;
        Persona persona;

        //WHEN
        persona =  new Persona(nombre, phone, address, age);
        //THEN
        assertEquals(nombre, persona.getNombre());
        assertEquals(phone, persona.getPhone());
        assertEquals(address, persona.getAddress());
        assertEquals(age, persona.getAge());
    }


    //test ToString}
    @Test
    public void testMetodoToString(){
        //GIVEN
        Persona persona;
        String cadena1 = "Persona{nombre= Juaquin, phone= +05498989898, address= Villa el Triunfo, age= 32}";
        String nombre = "Juaquin";
        String phone = "+05498989898";
        String address = "Villa el Triunfo";
        Integer age = 32;
        //WHEN
        persona = new Persona(nombre, phone, address, age);
        //THEN
        assertEquals(cadena1, persona.toString());
    }
}
























