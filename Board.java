import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;

public class Board extends JFrame implements MouseListener{
    public Container pane;
    private Pieces[][] Locations;
    private JButton endTurn;
    
    public Board(){
	pane = this.getContentPane();
	Locations = new Pieces[8][8];
	pane.setLayout(new GridLayout(9,9));
	
	for (int i = 0;i < Locations.length;i ++){
	    for (int c = 0; c < Locations[i].length;c ++){
            Locations[i][c] = new Pieces(i,c);
            Locations[i][c].addMouseListener(this);
		if (i == 3 && c == 3){
		    ImageIcon temp = new ImageIcon ("black.png");
		    Image image = temp.getImage();
		    Image newImage = image.getScaledInstance(60,60, java.awt.Image.SCALE_SMOOTH);
		    ImageIcon icon = new ImageIcon (newImage);
		    Locations[i][c].setFocusPainted(false);
		    Locations[i][c].setEnabled(false);
		    Locations[i][c].setDisabledIcon(icon);
		    Locations[i][c].setIcon(icon);
		}
		else if (i == 4 && c == 3){
		    ImageIcon temp = new ImageIcon ("white.png");
		    Image image = temp.getImage();
		    Image newImage = image.getScaledInstance(60,60, java.awt.Image.SCALE_SMOOTH);
		    ImageIcon icon = new ImageIcon (newImage);
		    Locations[i][c].setFocusPainted(false);
		    Locations[i][c].setEnabled(false);
		    Locations[i][c].setDisabledIcon(icon);
		    Locations[i][c].setIcon(icon);
		}
		else if (i == 3 && c == 4){
		    ImageIcon temp = new ImageIcon ("white.png");
		    Image image = temp.getImage();
		    Image newImage = image.getScaledInstance(60,60, java.awt.Image.SCALE_SMOOTH);
		    ImageIcon icon = new ImageIcon (newImage);
		    Locations[i][c].setFocusPainted(false);
		    Locations[i][c].setEnabled(false);
		    Locations[i][c].setDisabledIcon(icon);
		    Locations[i][c].setIcon(icon);
		}
		else if (i == 4 && c == 4){
		    ImageIcon temp = new ImageIcon ("black.png");
		    Image image = temp.getImage();
		    Image newImage = image.getScaledInstance(60,60, java.awt.Image.SCALE_SMOOTH);
		    ImageIcon icon = new ImageIcon (newImage);
		    Locations[i][c].setFocusPainted(false);
		    Locations[i][c].setEnabled(false);
		    Locations[i][c].setDisabledIcon(icon);
		    Locations[i][c].setIcon(icon);
		}
		Locations[i][c].setBackground(new Color(0,153,76));
		Locations[i][c].setBorder(new LineBorder(Color.BLACK));
		pane.add(Locations[i][c]);
	    }
	}
	endTurn = new JButton("End Turn");
	pane.add(endTurn);
    }
    
    public void clearColor(JButton[][] a){
        for (int i = 0;i < a.length; i++){
            for (int c = 0;c < a[i].length; c++){
                a[i][c].setBorder(new LineBorder(Color.BLACK));
            }
        }
    }
    
    public void actionPerformed(ActionEvent e){
	
    }
    
    public void mousePressed(MouseEvent e){
	
    }
    
    public void mouseReleased(MouseEvent e){
	
    }
    
    public void mouseEntered(MouseEvent e){
	
    }
    
    public void mouseExited(MouseEvent e){
	
    }
    
    public void mouseClicked(MouseEvent e){
        ImageIcon temp = new ImageIcon ("black.png");
        Image image = temp.getImage();
        Image newImage = image.getScaledInstance(60,60, java.awt.Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon (newImage);
        Pieces m = (Pieces) e.getSource();
        m.setFocusPainted(false);
        m.setEnabled(false);
		m.setDisabledIcon(icon);
		m.setIcon(icon);
    }
    
    public static void main(String[] args){
        Board g = new Board();
        g.setSize(new Dimension(800,800));
        g.setVisible(true);
        g.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
