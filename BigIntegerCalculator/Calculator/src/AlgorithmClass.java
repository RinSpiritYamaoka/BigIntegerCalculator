import java.math.BigInteger;

public class AlgorithmClass 
{
	public static BigInteger makeTextToBigIntX()
	{
		try
		{
			String temp=PanelClass.textAreaX.getText();
			BigInteger temp2=new BigInteger(temp);
			return temp2;
		}
		catch(Exception e)
		{
			BigInteger temp3=new BigInteger("-3");
			return temp3;
		}
	}
	public static BigInteger makeTextToBigIntY()
	{
		try
		{
			String temp=PanelClass.textAreaY.getText();
			BigInteger temp2=new BigInteger(temp);
			return temp2;
		}
		catch(Exception e)
		{
			BigInteger temp3=new BigInteger("-3");
			return temp3;
		}
	}
	
	public static BigInteger modMethod(BigInteger x,BigInteger y)
	{
		BigInteger temp=x.mod(y);
		return temp;
	}
	
	public static BigInteger inverseModMethod(BigInteger x,BigInteger y)
	{
		BigInteger temp=x.modInverse(y);
		return temp;
	}
	
	public static BigInteger nextPrimeMethod(BigInteger x)
	{
		BigInteger temp=x.nextProbablePrime();
		return temp;
	}
	
	
	

}
