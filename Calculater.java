import java.awt.Color;
import java.awt.DisplayMode;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.text.PlainDocument;


/**
 * Calculater
 */
public class Calculater implements ActionListener {
	
	JFrame jf;
	JLabel displaylaJLabel;

	
	
	//to create a constarints
	public Calculater{
    
        
    } {
	    jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600,600);
		// is used to change thelocation of the frame
		jf.setLocation(300, 110);
		
		
	   
	     JLabel displaylabel=new JLabel(""); 
		displaylabel.setBounds(30, 50, 540, 40);
		displaylabel.setBackground(Color.gray);
		displaylabel.setOpaque(true);
		displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displaylabel.setForeground(Color.white);
		jf.add(displaylabel);
		
		JButton sevenButton=new JButton("7");
		sevenButton.setBounds(30,130,80,80);
		sevenButton.addActionListener(this);
		sevenButton.setFont(new Font("Arial",Font.PLAIN,40));
		
		jf.add(sevenButton);
		
		JButton EightButton=new JButton("8");
		EightButton.setBounds(130,130,80,80);
		sevenButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(EightButton);
		
		JButton NineButton=new JButton("9");
		NineButton.setBounds(230,130,80,80);
		sevenButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(NineButton);
		
		JButton FourButton=new JButton("4");
		FourButton.setBounds(30,230,80,80);
		sevenButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(FourButton);
		
		JButton FiveButton=new JButton("5");
		FiveButton.setBounds(130,230,80,80);
		sevenButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(FiveButton);
		
		JButton SixButton=new JButton("6");
		SixButton.setBounds(230,230,80,80);
		sevenButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(SixButton);
		
		JButton OneButton=new JButton("1");
		OneButton.setBounds(30,330,80,80);
		sevenButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(OneButton);
		
		JButton TwoButton=new JButton("2");
		TwoButton.setBounds(130,330,80,80);
		sevenButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(TwoButton);
		
		JButton ThreeButton=new JButton("3");
		ThreeButton.setBounds(230,330,80,80);
		sevenButton.setFont(new Font("Arial",Font.PLAIN,40));
		
		jf.add(ThreeButton);
		
		JButton DotteButton=new JButton(".");
		DotteButton.setBounds(30,430,80,80);
		sevenButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(DotteButton);
		
		JButton ZeroButton=new JButton("0");
		ZeroButton.setBounds(130,430,80,80);
		sevenButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(ZeroButton);
		
		JButton EqualButton=new JButton("=");
		EqualButton.setBounds(230,430,80,80);
		sevenButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(EqualButton);
		
		


		JButton DiveButton=new JButton("/");
		DiveButton.setBounds(330,130,80,80);
		sevenButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(DiveButton);
		
		
		JButton MullButton=new JButton("x");
		MullButton.setBounds(330,230,80,80);
		sevenButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(MullButton);
		
		
		JButton MinusButton=new JButton("-");
		MinusButton.setBounds(330,330,80,80);
		sevenButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(MinusButton);
		
		JButton PlusButton=new JButton("+");
		PlusButton.setBounds(330,430,80,80);
		sevenButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(PlusButton);
		
	
		
		
	    
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}
	
	public static void main(String[] args) {
		new Calculater();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	
		

	
		
	}

}
