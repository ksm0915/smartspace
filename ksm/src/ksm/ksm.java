package ksm;

import java.io.IOException;

public class ksm {
	
	public static void main(String[] args) throws IOException{
		
		System.out.println("��ħ�λ�� M �����λ�� A �����λ�� E");
		System.out.println("���ϴ� �λ�� : ");
		char day = (char)System.in.read();
		switch(day)
		{
		case 'M' : System.out.println("��ħ�λ�� Good Morning");
		           break;
		case 'A' : System.out.println("�����λ�� Good Afternoon");
		           break;
		case 'E' : System.out.println("�����λ�� Good Evening");
				   break;
		default : System.out.println("���ϴ� �Է��� �ƴմϴ�.");
		}
	}	

}
