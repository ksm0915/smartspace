package ksm;

import java.io.IOException;

public class ksm {
	
	public static void main(String[] args) throws IOException{
		
		System.out.println("아침인삿는 M 점심인사는 A 저녁인사는 E");
		System.out.println("원하는 인사는 : ");
		char day = (char)System.in.read();
		switch(day)
		{
		case 'M' : System.out.println("아침인사는 Good Morning");
		           break;
		case 'A' : System.out.println("점심인사는 Good Afternoon");
		           break;
		case 'E' : System.out.println("점녁인사는 Good Evening");
				   break;
		default : System.out.println("원하는 입력이 아닙니다.");
		}
	}	

}
