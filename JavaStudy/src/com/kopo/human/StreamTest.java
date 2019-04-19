package com.kopo.human;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class StreamTest {
	int temp;

	// 1. FileInputStream : read()메소드 사용
	public void test() {

		try {
//				FileInputStream fs = new FileInputStream("d:/a.txt");	
			FileReader fs = new FileReader("d:/a.txt");
			long before = System.currentTimeMillis();
			while ((temp = fs.read()) != -1) {
				System.out.print((char) temp);
			}
			System.out.println();
			long amount = System.currentTimeMillis() - before;
			System.out.println("FileInputStream 사용 while문이 걸린 시간 : " + amount);
			fs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 2. FileReader 사용
	public void test1() {

		try {
			FileReader fs = new FileReader("d:/a.txt");
			FileWriter fw = new FileWriter("d:/test1.txt");
			long before = System.currentTimeMillis();
			while ((temp = fs.read()) != -1) {
				fw.write(temp);
			}
			long amount = System.currentTimeMillis() - before;
			System.out.println("FileInputStream 사용 While문이 걸린 시간:" + amount);
			fs.close();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 3. BufferedReader, BuffereWriter 사용
	public void test2() {
		String tempStr;

		try {
			BufferedReader br = new BufferedReader(new FileReader("d:/a.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("d:/test5.txt"));
			while ((tempStr = br.readLine()) != null) {
				System.out.println(tempStr);
				bw.write(tempStr + "\r\n");
			}
			br.close();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 4. Jdk 1.7부터 사용가능
	public void test3() {
		String tempStr;

		try (BufferedReader br = new BufferedReader(new FileReader("d:/a.txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("d:/test3.txt"))) {
			while ((tempStr = br.readLine())!= null) {
				System.out.println(tempStr);
				bw.write(tempStr + "\r\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] aa) {
		StreamTest st = new StreamTest();
		// st.test();
		// st.test1();
		// st.test2();
		st.test3();
	}

}
