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
		System.out.println(" -----------练习1------------ ");
		char num = 48;
		System.out.println(num);
		
		char word = '中';
		System.out.println((int)word);
	}
	
	public static int practice_2(int x) {
		System.out.println(" -----------练习2------------ ");
		return x * x - 2 * x + 4;
	}
	
	public static int practice_3(int x) {
		System.out.println(" -----------练习3------------ ");
		return x++ % 3;
	}
	
	public static int practice_page(int line, int size) {
		System.out.println(" -----------练习4------------ ");
		int page = line % 10 == 0 ? line / size : line /size + 1;
		return page;
	}
	
	public static void practice_5(int score) {
		System.out.println(" -----------练习5------------ ");
		if((score > 100) || (score < 0))
		{
			System.out.println("super man");
		}
		else if(score >= 90 && score <= 100)
		{
			System.out.println("优秀");
		}
		else if(score >= 80 && score <= 90)
		{
			System.out.println("良好");
		}
		else {
			System.out.println("不及格");
		}
	}
	
	public static void practice_6() {
		System.out.println(" -----------练习6------------ ");
		int num = 0;
		while(num != -1)
		{
			Scanner scanner = new Scanner(System.in);
			String string = scanner.next();
			System.out.println("您输入的是  " + string);
			num = Integer.parseInt(string); 
		}
	}
	
	public static void practice_7() {
		System.out.println(" -----------练习7------------ ");
		int x1 = 1, x2 = 2, y1 = 3, y2 = 4;
		double num = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("1 与 2 的距离为" + num);
		
		int i = 1;
		boolean b = (3 + 4 > 4) || (5 != 6) && (7 > (8 + ++i));
		System.out.println(b);
	}
	
	public static void practice_7_1(int money) {
		System.out.println("练习7_1");
		
	}
	
	public static void practice_8() {
		System.out.println(" -----------练习8------------ ");
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
			System.out.println("校验码正确!");
			System.out.println("校验码为:" + (10-(cc % 10)) % 10);
		}
	}

}
