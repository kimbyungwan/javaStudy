package ch07;

// �ڷ����� ����
// �ݵ�� ������ ����
// �� ������ ���� ������ �� �ִ� �޼ҵ尡 ����

//Java Bean (POJO : Plain Old Java Object)
public class Notebook {
	int price;
	String brand;
	float size;
	public void print() {
		System.out.println(price + brand + size);
	}
	
	public void setSize(float s) {
		size = s;
	}
	public float getSize() {
		return size;
	}
	
	public void setBrand(String s) {
		brand = s;
	}
	public String getBrand() {
		return brand;
	}
	
	// set ���� �޼ҵ� / get ���� �޼ҵ�
	public void setPrice(int p) {
		price = p;
	}
	public int getPrice() {
		return price;
	}
}
