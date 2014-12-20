package View;

import java.awt.Color;

import javax.swing.JFrame;

public class BaseFrame extends JFrame{
	
	public BaseFrame (){

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.getContentPane().setBackground(Color.WHITE);
       // this.setLocationRelativeTo(null);
        
	}
}
