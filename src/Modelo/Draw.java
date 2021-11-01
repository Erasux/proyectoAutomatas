package Modelo;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;



public class Draw extends JPanel{
	JSON json = new JSON();
	ArrayList<Automata> automatas = json.readJSONFile();
        Automata atr = new Automata();
        
	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
		this.setBackground(Color.WHITE);
		int x = 90;
		int y = 30;
		int q = 50;
		int w = 50;
                
                g.setColor(Color.RED); 
                // arrow 1 
                g.drawLine(x-40, 55, x-10, 55);
                g.drawLine(x-25, 45, x-10, 55);
                g.drawLine(x-25, 65, x-10, 55);
                
                // arrow 2
                g.drawLine(x-40, 155, x-10, 155);
                g.drawLine(x-25, 145, x-10, 155);
                g.drawLine(x-25, 165, x-10, 155);
                
                // final state
                g.drawOval(x+105, y+5, q-10, w-10);
                g.drawOval(x+305, y+105, q-10, w-10);
                
                
                for (int j = 1; j < automatas.size(); j++) {
                    for (int i = 0; i < automatas.get(j).getEstados().length; i++) {
                        // System.out.print(automatas.get(j).getEstados()[i]);
                        
                        if(i > 5){
				break;
			}else{
                            // text render
                            g.setColor(Color.BLACK); 
                            g.drawString((String)automatas.get(0).getEstados()[i], (x+20), (q+10));
                            g.drawString((String)automatas.get(1).getEstados()[i], (x+20), (q+110));
                            //code to render each circle
                            g.setColor(Color.RED);  
                            g.drawOval(x, y, q, w);
                            g.drawOval(x, y+100, q, w);
                            x = x+100;
                        }
                    
                    }
                }
    }
}

