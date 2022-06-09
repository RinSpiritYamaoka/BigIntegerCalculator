import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

public class myActionListener implements ActionListener
{
	static BigInteger checker=new BigInteger("-3");

	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource()==PanelClass.buttonClear)
		{
			PanelClass.textAreaX.setText("");
			PanelClass.textAreaY.setText("");
			PanelClass.textAreaAns.setText("");
			
		}
		
		if(ae.getSource()==PanelClass.buttonxADDy)
		{
			
			BigInteger tempx=AlgorithmClass.makeTextToBigIntX();
			BigInteger tempy=AlgorithmClass.makeTextToBigIntY();
			if(tempx.compareTo(checker)==0|tempy.compareTo(checker)==0)
			{
				PanelClass.textAreaAns.setText("MUST be a NUMBER");
			}
			else
			{
				BigInteger tempfinal=tempx.add(tempy);
				String tempfinal2=tempfinal.toString();
				PanelClass.textAreaAns.setText(tempfinal2);
			}
		}
		
		if(ae.getSource()==PanelClass.buttonxSUBy)
		{
			BigInteger tempx=AlgorithmClass.makeTextToBigIntX();
			BigInteger tempy=AlgorithmClass.makeTextToBigIntY();
			if(tempx.compareTo(checker)==0|tempy.compareTo(checker)==0)
			{
				PanelClass.textAreaAns.setText("MUST be a NUMBER");
			}
			else
			{
				BigInteger tempfinal=tempx.subtract(tempy);
				String tempfinal2=tempfinal.toString();
				PanelClass.textAreaAns.setText(tempfinal2);
			}
		}
		
		if(ae.getSource()==PanelClass.buttonXPowY)
		{
			BigInteger tempx=AlgorithmClass.makeTextToBigIntX();
			BigInteger tempy=AlgorithmClass.makeTextToBigIntY();
			int tempyIntY=tempy.intValue();
			System.out.println("hi");
			
			if(tempx.compareTo(checker)==0|tempy.compareTo(checker)==0)
			{
				PanelClass.textAreaAns.setText("MUST be a NUMBER");
			}
			else
			{
				BigInteger tempfinal=tempx.pow(tempyIntY);
				
				String tempfinal2=tempfinal.toString();
				PanelClass.textAreaAns.setText(tempfinal2);
			}
		}
		
		if(ae.getSource()==PanelClass.buttonMultiply)
		{
			BigInteger tempx=AlgorithmClass.makeTextToBigIntX();
			BigInteger tempy=AlgorithmClass.makeTextToBigIntY();
			int tempyIntY=tempy.intValue();
			
			if(tempx.compareTo(checker)==0|tempy.compareTo(checker)==0)
			{
				PanelClass.textAreaAns.setText("MUST be a NUMBER");
			}
			else
			{
				BigInteger tempfinal=tempx.multiply(tempy);
				
				String tempfinal2=tempfinal.toString();
				PanelClass.textAreaAns.setText(tempfinal2);
			}
		}
		
		if(ae.getSource()==PanelClass.buttonQuotient)
		{
			BigInteger tempx=AlgorithmClass.makeTextToBigIntX();
			BigInteger tempy=AlgorithmClass.makeTextToBigIntY();
			
			if(tempx.compareTo(checker)==0|tempy.compareTo(checker)==0)
			{
				PanelClass.textAreaAns.setText("MUST be a NUMBER");
			}
			else
			{
				BigInteger tempfinal=tempx.divide(tempy);
				
				String tempfinal2=tempfinal.toString();
				PanelClass.textAreaAns.setText(tempfinal2);
			}
		}
		if(ae.getSource()==PanelClass.buttonMod)
		{
			BigInteger tempx=AlgorithmClass.makeTextToBigIntX();
			BigInteger tempy=AlgorithmClass.makeTextToBigIntY();
			
			if(tempx.compareTo(checker)==0|tempy.compareTo(checker)==0)
			{
				PanelClass.textAreaAns.setText("MUST be a NUMBER");
			}
			else
			{
				BigInteger tempfinal=AlgorithmClass.modMethod(tempx, tempy);
				
				String tempfinal2=tempfinal.toString();
				PanelClass.textAreaAns.setText(tempfinal2);
			}
		}
		
		if(ae.getSource()==PanelClass.buttonInverseMod)
		{
			BigInteger tempx=AlgorithmClass.makeTextToBigIntX();
			BigInteger tempy=AlgorithmClass.makeTextToBigIntY();
			
			if(tempx.compareTo(checker)==0|tempy.compareTo(checker)==0)
			{
				PanelClass.textAreaAns.setText("MUST be a NUMBER");
			}
			else
			{
				try
				{
					BigInteger tempfinal=AlgorithmClass.inverseModMethod(tempx, tempy);
					
					String tempfinal2=tempfinal.toString();
					PanelClass.textAreaAns.setText(tempfinal2);
				}
				catch(Exception e)
				{
					String tempfinal3="there in no multiplication inverse for the given x";
					PanelClass.textAreaAns.setText(tempfinal3);
				}
				
			}
		}
		
		if(ae.getSource()==PanelClass.buttonProbPrime)
		{
			BigInteger tempx=AlgorithmClass.makeTextToBigIntX();
			BigInteger tempy=AlgorithmClass.makeTextToBigIntY();
			
			if(tempx.compareTo(checker)==0)
			{
				PanelClass.textAreaAns.setText("MUST be a NUMBER");
			}
			else
			{
				boolean tempfinal=tempx.isProbablePrime(4);		
				if(tempfinal==true)
				{
					String tempfinal2=tempx.toString();
					String tempfnal3="  is probably a prime with certainty of 93.75 precent.";
					String tempfinal4=tempfinal2.concat(tempfnal3);
					PanelClass.textAreaAns.setText(tempfinal4);
				}
				else
				{
					String tempfinal2=tempx.toString();
					String tempfnal3="  is probably NOT a prime with certainty of 93.75 precent.";
					String tempfinal4=tempfinal2.concat(tempfnal3);
					PanelClass.textAreaAns.setText(tempfinal4);
				}
				
				
			}
		}
		
		if(ae.getSource()==PanelClass.buttonNextPrime)
		{
			BigInteger tempx=AlgorithmClass.makeTextToBigIntX();
			
			if(tempx.compareTo(checker)==0)
			{
				PanelClass.textAreaAns.setText("MUST be a NUMBER");
			}
			else
			{
				System.out.println("hi");
				BigInteger tempfinal=AlgorithmClass.nextPrimeMethod(tempx);
				
				String tempfinal2=tempfinal.toString();
				PanelClass.textAreaAns.setText(tempfinal2);
				
			}
		}
		
		if(ae.getSource()==PanelClass.buttonXtoAns)
		{
			
			String temp=PanelClass.textAreaAns.getText();
			PanelClass.buttonClear.doClick();
			PanelClass.textAreaX.setText(temp);
			
			
		}
		
		if(ae.getSource()==PanelClass.buttonYtoAns)
		{
			
			String temp=PanelClass.textAreaAns.getText();
			PanelClass.buttonClear.doClick();
			PanelClass.textAreaY.setText(temp);
			
			
		}
		
		if(ae.getSource()==PanelClass.buttonChangeXY)
		{
			
			String temp=PanelClass.textAreaX.getText();
			String temp2=PanelClass.textAreaY.getText();
			PanelClass.buttonClear.doClick();
			PanelClass.textAreaY.setText(temp);
			PanelClass.textAreaX.setText(temp2);
			
			
			
		}
		
		
		
		
		
		
		
		
		
	}

}
