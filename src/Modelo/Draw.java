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
		int x = 20;
		int y = 30;
		int q = 50;
		int w = 50;
                
                
                for (int j = 0; j < automatas.size(); j++) {
                    int k = 0;
                    for (int i = 0; i < automatas.get(j).getEstados().length; i++) {
                        System.out.print(automatas.get(j).getEstados()[i]);
                        
                        if(i > 5){
				break;
			}else{
                            // text render
                            g.setColor(Color.BLACK); 
                            // String[] estado = atr.getEstados(); // automatas.get(0).getEstados()[k]
                            g.drawString((String)automatas.get(0).getEstados()[i], (x+5), (q));
                            g.drawString((String)automatas.get(1).getEstados()[i], (x+5), (q));
                            //code to render each circle
                            g.setColor(Color.RED);  
                            g.drawOval(x, y, q, w);
                            x = x+100;
                        }
                    
                    }
                }
    }
}

