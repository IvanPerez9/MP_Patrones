/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhotdrawfigures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author Iván
 */
public class uEllipseFigure extends uAbstractFigure {
    
    @Override
    public void draw (Graphics elipse){
        
        elipse.setColor(Color.blue);
        Rectangle cajaLocal = getCaja();
        elipse.drawOval(cajaLocal.x , cajaLocal.y , cajaLocal.width , cajaLocal.height);
        
    }
    
    public uEllipseFigure(uAbstractFigure f){
        
        super();
        caja= new Rectangle(f.getCaja());
        
    }
    
    public uEllipseFigure(int x, int y, int w, int h){
        super();
        caja = new Rectangle(x, y, w, h); // Preguntar porque con caja !!!
    }
    
    public uEllipseFigure(){ super();}
    
    
    @Override
    public IFigure clone() {
        return new uEllipseFigure(this); // A la hora de hacer la elipse porque los 4 int y no nada.
        // Hace las elipse traidas desde la interfaz
    }
    
}
