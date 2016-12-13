package code;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class RWTxtFile {
	
	//@Test
	public void writeTxt() throws IOException{
		//create file
		File file = new File("F:\\junk\\test.txt");
		file.createNewFile();
		
		//crating writer
		FileWriter fw = new FileWriter("F:\\junk\\test.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("First line in the notepad");
		bw.newLine();
		bw.write("2nd line in the file");
		bw.flush();  //to close file
		
	}
	
	@Test
	public void readTxt() throws IOException{
		//create reader
		FileReader fr = new FileReader("F:\\junk\\test.txt");
		BufferedReader br = new BufferedReader(fr);
		
//		System.out.println(br.readLine());	//prints 1st line
//		System.out.println(br.readLine());	//printes 2nd line
//		System.out.println(br.readLine());	//printes 3rd line
//		System.out.println(br.readLine());	//printes 4th line
		
		String i = "";
		while((i=br.readLine())!=null)
			System.out.println(i);
	}
}