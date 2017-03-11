/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.awt.event.MouseEvent;
import uHotDrawFramework.uDrawingView;
import uhotdrawfigures.IFigure;
import uhotdrawfigures.uAbstractFigure;

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
        
    }

    @Override
    public void mouseUp(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMove(MouseEvent e) {
        
    }

    @Override
    public void mouseDrag(MouseEvent e) {
        
    }
    
    
    
}
