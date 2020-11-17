package test_Chapter3;

import java.io.*;

public class P37 {

	public static void main(String[] args)throws java.io.IOException {
		System.out.println("請輸入英文字母");
		BufferedReader br=
			new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		
		String stru=str.toUpperCase();
		String strl=str.toLowerCase();
		
		System.out.println("轉換成大寫時為"+stru);
		System.out.println("轉換成小寫時為"+strl);

	}

}
