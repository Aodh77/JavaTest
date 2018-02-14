package ie.dit;

import java.util.ArrayList;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class TuneBook
{
	ArrayList<Tune> tunes = new ArrayList<Tune>();

	public TuneBook(String n)
	{
		n = "abc.txt"
		BufferedReader inputStream = null;
		try {
				inputStream = new BufferedReader(new FileReader(n));
				String l;
				while ((l = inputStream.readLine()) != null) {
					tunes.add(l);
				}
			}
			catch (IOException e)
	        {
	        e.printStackTrace();
	        }
	        finally
	        {
	        	if (inputStream != null){
	        		try
	        		{
	        			inputStream.close();
	        		}
	        		catch(Exception e)
	        		{
	        			e.printStackTrace();
	        		}
	        	}
	        }

	}
	


}