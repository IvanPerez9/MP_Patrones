/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uHotDrawFramework;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import tools.ITools;
import tools.uCreationTool;
import tools.uPolylineCreationTool;
import tools.uPolylinePointCreationTool;
import tools.uSelectionTool;
import uhotdrawfigures.uAbstractFigure;
import uhotdrawfigures.uEllipseFigure;
import uhotdrawfigures.uPolylineFigure;
import uhotdrawfigures.uRectangleFigure;

/**
 *
 * @author Iván
 */
public class uDrawingEditor extends JFrame implements ActionListener {
    
    private uDrawingView view;
    private List <uAbstractFigure> tools;
    private ITools currentTool;
    private ITools rT,eT,pL,pLP,sE;
    public  JButton b4,b5,b6,b7,b8;
    // private editor 
    
    
    public void setDrawingView (uDrawingView v){
        this.view = v ;
        this.setContentPane(v);                     // Asigna el JPanel de v , al Frame this.
    }

    public uDrawingView getDrawingView() {
        return view;
    }

    public List<uAbstractFigure> getTools() {
        return tools;
    }

    public void setTools(List<uAbstractFigure> tools) {
        this.tools = tools;
    }

    public ITools getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(ITools currentTool) {
        this.currentTool = currentTool;
    }
    
    // Ej 34 
    
    public uDrawingEditor(){
        super();
        JPanel barraHerramientas = new JPanel();
        b4 = new JButton("Rectangle");
        b4.setActionCommand("r");
        b4.addActionListener(this);
        barraHerramientas.add(b4);
        b5 = new JButton("Ellipse");
        b5.setActionCommand("e");
        b5.addActionListener(this);
        barraHerramientas.add(b5);
        b6 = new JButton("PolyLinePoint");
        b6.setActionCommand("p");
        b6.addActionListener(this);
        barraHerramientas.add(b6);
        b7 = new JButton("PolyLine");
        b7.setActionCommand("l");
        b7.addActionListener(this);
        barraHerramientas.add(b7);
        b8 = new JButton("Selecion");
        b8.setActionCommand("s");
        b8.addActionListener(this);
        barraHerramientas.add(b8);
        

        barraHerramientas.setVisible(true);
        
        view=new uDrawingView();
        view.setEditor(this);

        this.getContentPane().setLayout(new BorderLayout());        
        this.getContentPane().add(barraHerramientas, BorderLayout.NORTH);
        this.getContentPane().add((uDrawingView)view, BorderLayout.CENTER);

        this.setVisible(true);
        this.pack();
        
        // Estos antes de hacerlo de forma general
        
        //rT = new uRectangleCreationTool(this.getView());
        //eT = new uElipseCreationTool(this.getView());
        // pL = new 
        
        // quitarlo para que pinte el rectangulo de primeras.
        rT=new uCreationTool(this.getDrawingView(),new uRectangleFigure(0,0,50,50));
        eT=new uCreationTool(this.getDrawingView(),new uEllipseFigure(0,0,50,50));
        pL=new uPolylinePointCreationTool(this.getDrawingView(),new uPolylineFigure());     // Como es una linea no necesita valores.
        pLP = new uPolylineCreationTool(this.getDrawingView(),new uPolylineFigure());
        sE = new uSelectionTool(this.getDrawingView());
        
        currentTool=rT;                                                         // Herramienta seleccionada por defecto.

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if ("e".equals(e.getActionCommand())) {
            setCurrentTool(eT);
        }
        if ("r".equals(e.getActionCommand())) {
            setCurrentTool(rT);
        }
        if ("p".equals(e.getActionCommand())) {
            setCurrentTool(pL);
        }
        if ("l".equals(e.getActionCommand())) {
            setCurrentTool(pLP);
        }
        if ("s".equals(e.getActionCommand())) {
            setCurrentTool(sE);
        }
    }

    
    
    
}
