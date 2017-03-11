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
import tools.uRectangleCreationTool;
import uhotdrawfigures.uAbstractFigure;
import uhotdrawfigures.uEllipseFigure;
import uhotdrawfigures.uRectangleFigure;

/**
 *
 * @author Iván
 */
public class uDrawingEditor extends JFrame implements ActionListener {
    
    private uDrawingView view;
    private List <uAbstractFigure> tools;
    private ITools currentTool;
    private ITools rT,eT;
    public  JButton b4,b5;
    // private editor 
    
    
    public void setDrawingView (uDrawingView v){
        this.view = v ;
        this.setContentPane(v);                     // Asigna el JPanel de v , al Frame this.
    }

    public uDrawingView getView() {
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

        view=new uDrawingView();
        view.setEditor(this);
        
        this.getContentPane().setLayout(new BorderLayout());        
        this.getContentPane().add(barraHerramientas, BorderLayout.NORTH);
        this.getContentPane().add((uDrawingView)view, BorderLayout.CENTER);

        this.setVisible(true);
        this.pack();
        
        rT = new uRectangleCreationTool(this.getView());
        
        // quitarlo para que pinte el rectangulo de primeras.
        // rT=new uCreationTool(this.getView(),new uRectangleFigure(0,0,10,10));
       // eT=new uCreationTool(this.getView(),new uEllipseFigure(0,0,10,10));
        currentTool=rT;

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if ("e".equals(e.getActionCommand())) {
            setCurrentTool(eT);
        }
        if ("r".equals(e.getActionCommand())) {
            setCurrentTool(rT);
        }
    }

    
    
    
}
