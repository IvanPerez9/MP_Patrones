/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhotdrawfigures;

import java.awt.Graphics;

/**
 *
 * @author Iván
 */
public class uBorderDecorateFigure extends uDecoratorFigure {
    
     @Override
     public void draw (Graphics g){
        super.draw(g);
        
        int x = innerFigure.displayBox().x;
        int y = innerFigure.displayBox().y;
        int width = innerFigure.displayBox().width;
        int height = innerFigure.displayBox().height;
        
        g.drawRect(x, y, width, height);
    }
    
}
