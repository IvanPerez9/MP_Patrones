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
import uhotdrawfigures.IFigure;
import uhotdrawfigures.uAbstractFigure;
import uhotdrawfigures.uRectangleFigure;

/**
 *
 * @author Iván
 */
public class uCreationTool extends uAbstractTool {
    
    public uAbstractFigure prototype ;
    
    public IFigure creationFigure(){
        return prototype.clone();
    }
    
    public uCreationTool (uDrawingView drawingView , uAbstractFigure abstracFigure){
        prototype = abstracFigure;
        view = drawingView;
        
        
    }

    @Override
    public void mouseDown(MouseEvent e) {
       // System.out.println("MouseDown");
    }

    @Override
    public void mouseUp(MouseEvent e) {
        IFigure f= creationFigure();     // Cambiar esto para que coja cualquiera de las figuras
        Rectangle r=f.displayBox();
        Point p=new Point(e.getX()-r.x,e.getY()-r.y);
        f.moveBy(p.getX(),p.getY());
        view.getDrawing().addFigure(f);
    }

    @Override
    public void mouseMove(MouseEvent e) {
        
    }

    @Override
    public void mouseDrag(MouseEvent e) {
        
    }
    
    
    
}
