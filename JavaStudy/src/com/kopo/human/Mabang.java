package com.kopo.human;

public class Mabang {
	int num;
	int[][] mabang;

	public Mabang(int num) {
		this.num=num;
	}

	public void start() {
		mabang= new int[num][num];
		int x = 0 ;
		int y= num/2;

		mabang[x][y]=1;

		for(int index =2; index<=num*num; index++) {
			x=x-1;
			y=y-1;

			if(x<0) {
				if(y<0) {
					x=x+2;
					y=y+1;
				}else {
					x=x+num;
				}				
			}else{
				if(y<0) {
					y=y+num;
				}else {
					if(mabang[x][y]!=0) {
						x=x+2;
						y=y+1;
					}
				}				
			}

			mabang[x][y]=index;		
		}
		
		for(int i=0;i<mabang.length;i++) {
			for(int j=0;j<mabang[i].length;j++) {
				System.out.print(mabang[i][j]+" ");
			}
			System.out.println();
		}
		for(int[] temp:mabang ) {
			for(int present:temp) {
				System.out.print(present+"");		
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Mabang mb = new Mabang(5);
		mb.start();

	}

}