package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		File path = new File("C:\\Users\\Alex\\Desktop\\in.txt");
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String name = br.readLine();
			while(name != null) {
				list.add(name);
				name = br.readLine();
			}
			
			Collections.sort(list);
			
			for(String s: list) {
				System.out.println(s);
			}
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
