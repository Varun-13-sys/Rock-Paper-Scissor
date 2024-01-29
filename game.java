package com.sample.pro2;
import java.util.Random;
import java.util.Scanner;
public class game{
public static void main(String args[]) {
Scanner s=new Scanner(System.in);
System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
System.out.println("                       ROCK PAPER SCISSOR                     ");
System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
int a=10;
int H=0;
int AI=0;
int no=0;
while(a>0)
{
	display();
	System.out.println("Enter your option:");
	String c=s.next();
	if(c.equals("R")) {
	Random r=new Random();
	int comp=10+r.nextInt(3)+1;
if(comp==11) {
	System.out.println("You: Rock");
	System.out.println("AI Rock");
	System.out.println("Result:Draw");
	no=no+1;
	H=H+1;
	AI=AI+1;
	System.out.println("Human: "+H+" | AI:"+AI);
}
 if(comp==12)
{
	System.out.println("You:Rock");
	System.out.println("AI:Paper");
	System.out.println("Result:Lose");
	no=no+1;
	H=H+0;
	AI=AI+1;
	System.out.println("Human: "+H+" | AI:"+AI);
}
 if(comp==13)
{
	System.out.println("You:Rock");
	System.out.println("AI:Scissor");
	System.out.println("result:Win");
	no=no+1;
	H=H+1;
	AI=AI+0;
	System.out.println("Human: "+H+" | AI:"+AI);
}
	}
	if(c.equals("P")) {
	Random r=new Random();
	int comp=20+r.nextInt(3)+1;
 if(comp==21)
{
	System.out.println("AI:Paper");
	System.out.println("You:Rock");
	System.out.println("result:Win");
	no=no+1;
	H=H+1;
	AI=AI+0;
	System.out.println("Human: "+H+" | AI:"+AI);
}
 if(comp==22)
{
	System.out.println("AI:Paper");
	System.out.println("You:scissor");
	System.out.println("result:lose");
	no=no+1;
	H=H+0;
	AI=AI+1;
	System.out.println("Human: "+H+" | AI:"+AI);
}
 if(comp==23)
{
	System.out.println("You:Paper");
	System.out.println("AI:Paper");
	System.out.println("result:draw");
	no=no+1;
	H=H+1;
	AI=AI+1;System.out.println("Human: "+H+" | AI:"+AI);
}
	}
	if(c.equals("S")) {
	Random r=new Random();
	int comp=30+r.nextInt(3)+1;
 if(comp==31)
{
	System.out.println("You:Scissor");
	System.out.println("AI:Scissor");
	System.out.println("result:draw");
	no=no+1;
	H=H+1;
	AI=AI+1;
	System.out.println("Human: "+H+" | AI:"+AI);
}
 if(comp==32)
{
	System.out.println("AI:Scissor");
	System.out.println("You:Paper");
	System.out.println("result:Win");
	no=no+1;
	H=H+1;
	AI=AI+0;
	System.out.println("Human: "+H+" | AI:"+AI);
}
 if(comp==33)
{
	System.out.println("AI:Scissor");
	System.out.println("You:Rock");
	System.out.println("result:lose");
	no=no+1;
	H=H+0;
	AI=AI+1;
	System.out.println("Human: "+H+" | AI:"+AI);
}
}
}
}
public static void display() {
	System.out.println("1.rock:R");
	System.out.println("2.paper:P");
	System.out.println("3.Scissor:S");
	System.out.println("________________________________________________________________");
	
}

}
