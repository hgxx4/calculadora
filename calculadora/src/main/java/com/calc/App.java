package com.calc;


public class App 
{

    public static void main( String[] args )
    {
        Calculadora calc = new Calculadora(35, 5);
        System.out.println("--------El resultado de las operaciones es: --------");
        System.out.println("suma " + calc.suma());
        System.out.println("division: " + calc.division());
       
    }
}
