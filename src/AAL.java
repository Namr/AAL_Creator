import java.io.*;
import java.util.*;

public class AAL
{

	public static void main(String[] args) 
	{
		int AAL_Size = 500;
		Random rand = new Random();
		
		//node file
		try 
		{
			PrintWriter writer = new PrintWriter("Node_AAL" + AAL_Size + ".node", "UTF-8");
			writer.println("#aal " + AAL_Size);
			
			for(int i = 0; i < AAL_Size; i++)
			{
				String name = "Node" + i;
				double x = Math.floor(((rand.nextDouble() * 100) - 50) * 100) / 100;
				double y = Math.floor(((rand.nextDouble() * 100) - 50) * 100) / 100;
				double z = Math.floor(((rand.nextDouble() * 100) - 50) * 100) / 100;
				int color = rand.nextInt(6) + 1;
				double size = 4;
				
				writer.println(x + "\t" + y +   "\t" + z +   "\t" + color +   "\t" + size +   "\t" + name);
			}
			writer.close();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (UnsupportedEncodingException e) 
		{
			e.printStackTrace();
		}
		
		
		//edge file
		try 
		{
			PrintWriter writer = new PrintWriter("Node_AAL" + AAL_Size + ".edge", "UTF-8");
			writer.println("#aal " + AAL_Size);
			
			for(int i = 0; i < AAL_Size; i++)
			{
				for(int y = 0; y < AAL_Size - 1; y++)
				{
					int connected = rand.nextInt(2);
					writer.print(connected);
					writer.print("\t");
				}
				int connected = rand.nextInt(2);
				writer.print(connected);
				writer.println("");
			}
			writer.close();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (UnsupportedEncodingException e) 
		{
			e.printStackTrace();
		}
	}

}
