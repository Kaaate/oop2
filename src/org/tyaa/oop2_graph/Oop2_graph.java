/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.oop2_graph;

import org.tyaa.oop2_graph.entity.*;

/**
 *
 * @author student
 */
public class Oop2_graph {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception{ //throws Exception {
        
        //int x = 10;
        Point p = new Point();
        //Point p = new Point(10, 20);
        //p.x = 10;
        //p.y = 20;
        
        System.out.printf("x = %d; y = %d\n", p.getX(), p.getY());
        
        p.setX(50);
        p.setY(100);
        
        System.out.printf("x = %d; y = %d\n", p.getX(), p.getY());
        
        Rectangle rect1 = new Rectangle();
        rect1.start = new Point(30, 40);
        rect1.height = 100;
        rect1.width = 150;
        
        //System.out.println(rect1.getS());
        //int result = rect1.getS();
        //System.out.println(result);
        
        System.out.printf("x = %d; y = %d\n", rect1.start.getX(), rect1.start.getY());
        
        rect1.moveX(100);
        
        System.out.printf("x = %d; y = %d\n", rect1.start.getX(), rect1.start.getY());
        
        //System.out.println(rect1.toString());
        
        System.out.println(Math.PI);
    
           
        Cirk Name = new Cirk();
        Name.start = new Point(10, 10);
        Name.R = 10;
        System.out.println(Name.getS());          
   }    
}
