package ch09;
public class SportsCar extends Car {
 char color = 'R';
 String s;
 
 @Override
 void move() {
	 System.out.println("스포츠카 이동 시속 300km");
	 }
 SportsCar() {
 System.out.println("SportsCar 객체 생성");
 }
 void openSunloof() {
 System.out.println("썬루프 열림");
 }
}
