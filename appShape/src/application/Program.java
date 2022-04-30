package application;

import java.util.Scanner;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectangle;
import model.enums.Color;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escolha a cor do circulo(BLACK, RED, BLUE): ");
		String color = sc.next();
		System.out.print("Digite o raio do circulo: ");
		double radius = sc.nextDouble();
		System.out.print("Escolha a cor do retangulo(BLACK, RED, BLUE): ");
		String colorRect = sc.next();
		System.out.print("Digite a largura do retangulo: ");
		double width = sc.nextDouble();
		System.out.print("Digite a altura do retangulo: ");
		double height = sc.nextDouble();
		
		
		AbstractShape circle = new Circle(Color.valueOf(color), radius);
		AbstractShape rect = new Rectangle(Color.valueOf(colorRect), width, height);
		
		System.out.println(circle.area());
		System.out.println(circle.getColor());
		System.out.println(rect.area());
		System.out.println(rect.getColor());
		
		sc.close();
	}

}
