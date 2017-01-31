/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.bmorante.t01.p2;
import java.util.Scanner;
/**
 *
 * @author Benito Mv
 */
public class SPP2BMoranteT01P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double base, altu, P, S ;
    Scanner sc= new Scanner(System.in);
    
    //pedir base
    System.out.println("Ingresa la base del rectangulo");
    base= sc.nextDouble();
    //pedir altura
    System.out.println("Ingrea la altura del rectangulo");
    altu= sc.nextDouble();
    //perimetro
    P= ((2*base)+(2*altu));
    System.out.println(" El perimetro del rectangulo es "+ P);
    //superficie
    S= (base*altu);
    System.out.println(" La superificie del rectangulo es " + S);
   
            
    }
    
}
