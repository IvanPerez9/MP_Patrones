/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uHotDrawFramework;

import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.JFrame;
import uhotdrawfigures.*;
import uhotdrawfigures.uRectangleFigure;

/**
 *
 * @author Iván
 */
public class principal {
    
    public uDrawing d ;
    public uDrawingEditor e ;

    public uDrawing getD() {
        return d;
    }

    public void setD(uDrawing d) {
        this.d = d;
    }

    public uDrawingEditor getE() {
        return e;
    }

    public void setE(uDrawingEditor e) {
        this.e = e;
    }
    
    
    public static void main (String[] args){
         
        uDrawingView v = new uDrawingView();
        
        uDrawing d = new uDrawing();
        uRectangleFigure f1 = new uRectangleFigure();
        uEllipseFigure f2 = new uEllipseFigure();
         
        Rectangle cajaf2 = new Rectangle(50, 50, 60, 60);
        f2.setCaja(cajaf2);
        
        Rectangle cajaf1 = new Rectangle(10, 10, 30, 30);
        f1.setCaja(cajaf1);
        
        d.addFigure(f1);
        d.addFigure(f2);
        
        v.setDrawing(d);
        
        
        v.setPreferredSize(new Dimension(320, 240));
        
        uDrawingEditor e = new uDrawingEditor();
        //e.setDrawingView(v);
        // Esta ultima linea se carga la e, por eso no la ponemos más. La v es nueva.
        
        // 29
        
        uEllipseFigure f3 = new uEllipseFigure();
        Rectangle cajaf3 = new Rectangle(100, 100, 80, 80);
        f3.setCaja(cajaf3);
        
        // decorator
        uBorderDecorateFigure borde = new uBorderDecorateFigure();
        borde.setInnerFigure(f3);
        d.addFigure(borde);
        
        // 37 OJO
        
        e.getView().setDrawing(d); 
        
        //e.getView().setDrawing(d);
        
        e.setVisible(true);
        e.pack();
        
        e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
    }
    
}
