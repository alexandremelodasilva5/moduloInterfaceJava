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
		List<Employee> list = new ArrayList<>();
		File path = new File("C:\\Users\\Alex\\Desktop\\in.txt");
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String emp = br.readLine();
			while(emp != null) {
				String[] empFields = emp.split(",");
				list.add(new Employee(empFields[0], Double.parseDouble(empFields[1])));
				emp = br.readLine();
			}
			
			Collections.sort(list);
			
			for(Employee e: list) {
				System.out.println(e);
			}
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
