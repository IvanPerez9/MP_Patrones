/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uHotDrawFramework;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;
import tools.ITools;

/**
 *
 * @author Iván
 */
public class uDrawingView extends JPanel implements MouseListener,MouseMotionListener{
    
    private uDrawing drawing;
    public uDrawingEditor editor ;
    
    public void setDrawing(uDrawing v){
        drawing = v;
    }
    
    public uDrawing getDrawing(){
        return drawing;
    }
    
    public void paint(Graphics g){
        drawing.draw(g);
    }

    public uDrawingEditor getEditor() {
        return editor;
    }

    public void setEditor(uDrawingEditor editor) {
        this.editor = editor;
    }
    
    
    
    // ------------------------------ 30 ---------------------- // 
   
    
    public ITools tool(){
    return editor.getCurrentTool();
    }


    @Override
    public void mouseClicked(MouseEvent aEvent) {
        
    }

    @Override
    public void mousePressed(MouseEvent aEvent) {
        tool().mouseDown(aEvent);
        editor.repaint();
    }

    @Override
    public void mouseReleased(MouseEvent aEvent) {
       tool().mouseUp(aEvent);
       editor.repaint();
    }

    @Override
    public void mouseEntered(MouseEvent aEvent) {
        
    }

    @Override
    public void mouseExited(MouseEvent aEvent) {
        
    }

    @Override
    public void mouseDragged(MouseEvent aEvent) {
        tool().mouseDrag(aEvent);
        editor.repaint();
    }

    @Override
    public void mouseMoved(MouseEvent aEvent) {
        tool().mouseMove(aEvent);
        editor.repaint();
    }

    
    
    
}
