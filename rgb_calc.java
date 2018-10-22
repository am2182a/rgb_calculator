package rgb_average;
import java.io.*;
import java.util.*;
public class rgb_calc {
	
	
	
	public static int color_num() {
		Scanner input = new Scanner(System.in);
		System.out.println("How many colors will you average? ");
		return input.nextInt();
	}
	
	public static int[] rgb_calculate() {
		Scanner input = new Scanner(System.in);
		int color_n = color_num();
		int red = 0;
		int green = 0;
		int blue = 0; 
		for(int i = 0; i<color_n; i++) {
			System.out.print("Enter the colors rgb in the format 'r g b': ");
			red += (int)Math.pow(input.nextInt(), 2);
			green += (int)Math.pow(input.nextInt(), 2);
			blue += (int)Math.pow(input.nextInt(), 2);
		}
		red /= color_n;
		red = (int)Math.pow(red, 0.5); 
		green /= color_n;
		green = (int)Math.pow(green, 0.5); 
		blue /= color_n; 
		blue = (int)Math.pow(blue, 0.5); 
		
		System.out.println("Your color average is: " + red + " " + green + " " + blue);
		int[] rgb = new int[] {red,green,blue}; 
		return rgb;
	}
	
	public static void main(String[] args) {
			 rgb_calculate();
	}

}
