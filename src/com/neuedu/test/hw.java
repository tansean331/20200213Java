package com.neuedu.test;

import java.util.Scanner;

import javafx.scene.shape.Line;

public class hw {
	public static void main(String[] ages)
	{
		practice_1();
		int num = practice_2(2);
		System.out.println(num);		
		int num1 = practice_3(2);
		System.out.println(num1);
		int page = practice_page(10, 2);
		System.out.println(page);
		practice_5(101);
		practice_6();
		practice_7();
		practice_8();
	}
	
	public static void practice_1() {
		System.out.println(" -----------��ϰ1------------ ");
		char num = 48;
		System.out.println(num);
		
		char word = '��';
		System.out.println((int)word);
	}
	
	public static int practice_2(int x) {
		System.out.println(" -----------��ϰ2------------ ");
		return x * x - 2 * x + 4;
	}
	
	public static int practice_3(int x) {
		System.out.println(" -----------��ϰ3------------ ");
		return x++ % 3;
	}
	
	public static int practice_page(int line, int size) {
		System.out.println(" -----------��ϰ4------------ ");
		int page = line % 10 == 0 ? line / size : line /size + 1;
		return page;
	}
	
	public static void practice_5(int score) {
		System.out.println(" -----------��ϰ5------------ ");
		if((score > 100) || (score < 0))
		{
			System.out.println("super man");
		}
		else if(score >= 90 && score <= 100)
		{
			System.out.println("����");
		}
		else if(score >= 80 && score <= 90)
		{
			System.out.println("����");
		}
		else {
			System.out.println("������");
		}
	}
	
	public static void practice_6() {
		System.out.println(" -----------��ϰ6------------ ");
		int num = 0;
		while(num != -1)
		{
			Scanner scanner = new Scanner(System.in);
			String string = scanner.next();
			System.out.println("���������  " + string);
			num = Integer.parseInt(string); 
		}
	}
	
	public static void practice_7() {
		System.out.println(" -----------��ϰ7------------ ");
		int x1 = 1, x2 = 2, y1 = 3, y2 = 4;
		double num = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("1 �� 2 �ľ���Ϊ" + num);
		
		int i = 1;
		boolean b = (3 + 4 > 4) || (5 != 6) && (7 > (8 + ++i));
		System.out.println(b);
	}
	
	public static void practice_7_1(int money) {
		System.out.println("��ϰ7_1");
		
	}
	
	public static void practice_8() {
		System.out.println(" -----------��ϰ8------------ ");
		int[] borCodeStrings = {6,9,2,1,1,6,8,5,1,1,2,8,0};
		int c1 = 0;
		int c2 = 0;
		int cc = 0;
		
		for (int i = 0; i < 12; i++) {
			if(i % 2 == 0) {
				
				c1 += borCodeStrings[i];
			}else {
				c2 += borCodeStrings[i];
			}
			cc = c1 + c2 * 3;
		}
		if (((10-(cc % 10)) % 10) == borCodeStrings[12]) {
			System.out.println("У������ȷ!");
			System.out.println("У����Ϊ:" + (10-(cc % 10)) % 10);
		}
	}

}
