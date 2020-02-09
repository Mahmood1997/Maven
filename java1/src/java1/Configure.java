package java1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Configure {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	@Test
	public void readConFigFile()
	{
		try
		{
			Properties pros = new Properties();
			
			pros.load(new FileInputStream(new File(System.getProperty("user.dir")+"./Configs/envs.properties")));
			
			System.out.println(pros.get("username"));
			System.out.println(pros.get("password"));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Couldnt find the file "+e.getMessage());
		}
		catch(IOException e)
		{
			System.out.println("File Exception "+e.getMessage());
		}
	}
	
	
	
	}


