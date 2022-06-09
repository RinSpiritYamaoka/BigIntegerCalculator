import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;




public class PanelClass extends JPanel 
{
	static JPanel panel1,panel2,panel3;
	static JLabel labelx,labely,labelAns;
	static JTextArea textAreaX,textAreaY,textAreaAns;
	myActionListener mal=new myActionListener();
	
	static JButton buttonxADDy,buttonxSUBy,buttonMultiply,buttonQuotient,buttonXPowY,buttonMod,buttonInverseMod,buttonProbPrime,buttonNextPrime,button10,buttonMrTest,buttonBaileyPSW,button13,button14,button15,button16,buttonXtoAns,buttonYtoAns,buttonChangeXY,buttonClear;
	
	public PanelClass()
	{
		this.setBackground(Color.DARK_GRAY);
		this.setSize(700,500);
		this.setLocation(0, 0);
		this.setLayout(null);
		
		
		
		
		//top panel
		panel1=new JPanel();
		panel1.setBackground(Color.DARK_GRAY);
		panel1.setSize(700,100);
		panel1.setLocation(15,0);
		panel1.setLayout(new FlowLayout(FlowLayout.LEADING));
		this.add(panel1);
		
		panel2=new JPanel();
		panel2.setBackground(Color.DARK_GRAY);
		panel2.setSize(700,80);
		panel2.setLocation(0,100);
		panel2.setLayout(new FlowLayout(FlowLayout.LEADING));
		this.add(panel2);
		
		panel3=new JPanel();
		panel3.setBackground(Color.DARK_GRAY);
		panel3.setSize(680,270);
		panel3.setLocation(2,180);
		panel3.setLayout(new GridLayout(5,4,10,10));
		this.add(panel3);
		
		//jlabelsssssssss
		
		labelx=new JLabel();
		labelx.setText("x :");
		labelx.setForeground(Color.WHITE);
		labelx.setBounds(10,15, 30, 30);
		
		
		
		labely=new JLabel();
		labely.setText("y :");
		labely.setForeground(Color.WHITE);
		labely.setBounds(300,15, 30, 30);
		
		
		labelAns=new JLabel();
		labelAns.setText("Ans :");
		labelAns.setBounds(500,15, 30, 30);
		labelAns.setForeground(Color.GREEN);
		panel2.add(labelAns);
		
		
		
		//jtextArea
		
		textAreaX= new JTextArea();
		textAreaX.setLineWrap(true);
		textAreaX.setPreferredSize(new Dimension(310,90));		
		
		textAreaY= new JTextArea();
		
		textAreaY.setLineWrap(true);
		textAreaY.setPreferredSize(new Dimension(310,90));
		
		
		textAreaAns= new JTextArea("\n"+"whats up doc?");
		textAreaAns.setPreferredSize(new Dimension(642,70));
		textAreaAns.setLineWrap(true);
		panel2.add(textAreaAns);
		
		
		
		//jbuttons
		buttonxADDy=new JButton("x+y");
		buttonxSUBy=new JButton("x-y");
		buttonMultiply=new JButton("x*y");
		buttonQuotient=new JButton("quotent of x/y");
		buttonXPowY=new JButton("x pow y");
		
		buttonMod=new JButton("x Mod of y");
		buttonInverseMod=new JButton("x Mod Inverse y");
		buttonProbPrime=new JButton("Probable prime");
		
		buttonNextPrime=new JButton("next p");
		button10=new JButton("WIP");
		buttonMrTest=new JButton("WIP");
		buttonBaileyPSW=new JButton("WIP");
		button13=new JButton("WIP");
		button14=new JButton("WIP");
		button15=new JButton("WIP");
		button16=new JButton("WIP");
		buttonXtoAns=new JButton("Ans -> x");
		buttonXtoAns.setBackground(Color.GRAY);
		buttonXtoAns.setForeground(Color.white);
		
		buttonYtoAns=new JButton("Ans -> y");
		buttonYtoAns.setBackground(Color.GRAY);
		buttonYtoAns.setForeground(Color.white);
		
		buttonChangeXY=new JButton("x <-> y");
		buttonChangeXY.setBackground(Color.GRAY);
		buttonChangeXY.setForeground(Color.white);
		
		buttonClear=new JButton("CLEAR");
		buttonClear.setBackground(Color.RED);
		buttonClear.setForeground(Color.WHITE);
		
		
		
		
		
		
		
		
		
		panel3.add(buttonxADDy);
		panel3.add(buttonxSUBy);
		panel3.add(buttonMultiply);
		panel3.add(buttonQuotient);
		panel3.add(buttonXPowY);
		panel3.add(buttonMod);
		panel3.add(buttonInverseMod);
		panel3.add(buttonProbPrime);
		panel3.add(buttonNextPrime);
		panel3.add(buttonMrTest);
		panel3.add(buttonBaileyPSW);
		panel3.add(button10);
		
		panel3.add(button13);
		panel3.add(button14);
		panel3.add(button15);
		panel3.add(button16);
		panel3.add(buttonXtoAns);
		panel3.add(buttonYtoAns);
		panel3.add(buttonChangeXY);
		panel3.add(buttonClear);
		
		
		
		
		panel1.add(labelx);
		panel1.add(textAreaX);
		panel1.add(labely);
		panel1.add(textAreaY);
		
		buttonxADDy.addActionListener(mal);
		buttonxSUBy.addActionListener(mal);
		buttonClear.addActionListener(mal);
		buttonXPowY.addActionListener(mal);
		buttonMultiply.addActionListener(mal);
		buttonQuotient.addActionListener(mal);
		buttonMod.addActionListener(mal);
		buttonInverseMod.addActionListener(mal);
		buttonProbPrime.addActionListener(mal);
		buttonNextPrime.addActionListener(mal);
		buttonXtoAns.addActionListener(mal);
		buttonYtoAns.addActionListener(mal);
		buttonChangeXY.addActionListener(mal);
		
		
		button10.setEnabled(false);
		buttonBaileyPSW.setEnabled(false);
		buttonMrTest.setEnabled(false);
		button13.setEnabled(false);
		button14.setEnabled(false);
		button15.setEnabled(false);
		button16.setEnabled(false);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
