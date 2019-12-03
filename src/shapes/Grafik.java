/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;
import java.awt.Canvas;
import java.awt.Graphics;
import stateMachine.StateMachine;

/**
 *
 * @author Aleksa
 */
public class Grafik extends Canvas {

    private stateMachine.StateMachine stateMachine;
    
    public Grafik(StateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public void paint(Graphics g) {
        
        //writing state:
        g.drawOval(30, 30, 100, 30);
        //cancel state:
        g.drawOval(30 + 120, 30, 100, 30);
        //review state:
        g.drawOval(30, 30 + 50, 100, 30);
        //reject state:
        g.drawOval(30, 30 + 100, 100, 30);
        //accept state:
        g.drawOval(30 + 120, 30 + 50, 100, 30);
    }

}
