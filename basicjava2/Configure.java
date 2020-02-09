package basicjava2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Configure {

	
@Test
public void readConFigFile(){
	File srcf=new File(System.getProperty("user.dir")+"./Configs/envs.properties");
	try{
	FileInputStream srcg = new FileInputStream(srcf);
	Properties pros= new Properties();
	
	pros.load(srcg);
	
	System.out.println(pros.get("username"));
	System.out.println(pros.get("password"));
	System.out.println(pros.get("key"));
	
	}
	catch(FileNotFoundException e){
		System.out.println("Couldn't find the file "+e.getMessage());
	} catch (IOException e) {
		System.out.println("File Exception "+e.getMessage());
	}
}

}
