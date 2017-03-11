/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import uHotDrawFramework.uDrawingView;
import uhotdrawfigures.uPolylineFigure;
import uhotdrawfigures.IFigure;
import uhotdrawfigures.uAbstractFigure;


/**
 *
 * @author Iván
 */

public class uPolylineCreationTool extends uCreationTool {
    
    uPolylineFigure polyFig;
    
    public uPolylineCreationTool(uDrawingView drawingView, uAbstractFigure abstracFigure) {
        super(drawingView, abstracFigure);
    }
    
    @Override
    public IFigure creationFigure (){
        return new uPolylineFigure();
    }

     @Override
     public void mouseDown(MouseEvent e) {
        polyFig = new uPolylineFigure();
        Point p = new Point (e.getX(), e.getY());
        polyFig.getPuntos().add(new Point(p));
        view.getDrawing().addFigure(polyFig); 
        
     }
     
     @Override
    public void mouseDrag(MouseEvent e) {            // Esto en Drag y pinta libremente.
        Point p = new Point(e.getX(),e.getY());
        polyFig.getPuntos().add(new Point(p));
        
    }
     
     public IFigure clone() throws CloneNotSupportedException{
         uPolylineFigure figure = null;
         figure = (uPolylineFigure) super.clone();        // Clonas la figura que has creado para que te la devuelva.
         return figure;
     }
     
    
   
}

