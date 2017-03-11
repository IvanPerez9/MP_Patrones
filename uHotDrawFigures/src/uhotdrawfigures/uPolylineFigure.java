/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhotdrawfigures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import uhotdrawfigures.IFigure;
import uhotdrawfigures.uAbstractFigure;


/**
 *
 * @author Iván
 */

public class uPolylineFigure extends uAbstractFigure implements IFigure {
    List<Point> puntos;

    public uPolylineFigure(){
        super();
        puntos = new ArrayList<Point>();
    }

/*  public uPolylineFigure(int x, int y, int w, int h){
        super(x,y,w,h);
        
    }
*/

    public void setPuntos(List<Point> puntos) {
        this.puntos = puntos;
    }

    public List<Point> getPuntos() {
        return puntos;
    }
    
    public boolean add(Point p){
        return puntos.add(p);
    }
    
    @Override
    public void draw(Graphics g){  
     g.setColor(Color.RED); 
     for(int i = 0; i < puntos.size() - 1; i++){
         g.drawLine(puntos.get(i).x,puntos.get(i).y, puntos.get(i+1).x,puntos.get(i+1).y);
     
      }
    }
    /*
    private Point[] hacerArray(List<Point> lista){
        Point [] p = new Point[lista.size()];
        int i = 0;
        for(Point punto : lista){
            p[i] = punto;
            i++;
        }
            
     return p;
    }
*/
    
    @Override
    public IFigure clone() {
        return new uPolylineFigure(); // NO HAY QUE PASARLE THIS ? ADEMAS SI LE PONGO IMPLEMENTS IFIGURE NO ME AHORRO EL CLONE ?
    }
    
    @Override
    public void moveBy(double moverX , double moverY){
        super.moveBy(moverX, moverY);
        for(Point p : this.puntos){
            p.translate((int)moverX, (int)moverY);
        }
    }
    
    @Override
    public boolean containstPoint (double x , double y){
        return false;
    }
    
    public Rectangle displayBox(){
        return null;
    }
    
    
}
