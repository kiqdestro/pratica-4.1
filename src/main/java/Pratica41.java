import utfpr.ct.dainf.if62c.pratica.Circulo;
import utfpr.ct.dainf.if62c.pratica.Elipse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kiqdestro
 */
public class Pratica41 {
    public static void main (String[] args){
        double areaX;
        double areaY;
        double perimetroX;
        double perimetroY;
        
        Circulo x = new Circulo (12);
        Elipse y = new Elipse (5,7);
    
        areaX = x.getArea();
        perimetroX = x.getPerimetro();
        areaY = y.getArea();
        perimetroY = y.getPerimetro();       
        
        System.out.println("Área do circulo: " + areaX+"\n"+"Área da elipse: " + areaY 
        + "Perimetro do circulo: " + perimetroX + "Perimetro da elipse: " + perimetroY);
}
    
    
}
