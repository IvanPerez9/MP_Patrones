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
    
    public uEllipseFigure(int x, int y, int w, int h){
        super();
        caja = new Rectangle(x, y, w, h); // PReguntar porque con caja !!!
    }
    
    public uEllipseFigure(){ super();}
    
}
