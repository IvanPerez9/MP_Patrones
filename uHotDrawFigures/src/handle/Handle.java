/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handle;

import java.awt.Point;
import tools.ITools;
import uhotdrawfigures.IFigure;

/**
 *
 * @author Iván
 */
public interface Handle extends ITools, IFigure {
    
    IFigure owner(); // Se accede al metodo propietario
    Point locate(); // localizacion de los handles en el propietario
    
}
