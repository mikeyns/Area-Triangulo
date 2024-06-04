/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areatriangulo;

/**
 *
 * @author Aluno
 */
public class AreaTriangulo {
    public static void main(String[] args) {
        double base = 1; // Valor predefinido para a base
        double altura = 2; // Valor predefinido para a altura
        
        double area = calcularAreaTriangulo(base, altura);
        
        System.out.println("A area do triangulo e: " + area);
    }
    
    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
}


