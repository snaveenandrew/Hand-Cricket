
import java.util.Scanner;


public class hcsp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c = 0,s1=0,s2=0,rand,f=0,ms=0;
		int tot;
		Scanner in = new Scanner(System.in);
		System.out.print("Bating");
		do{
			a = in.nextInt();
			b = (int)Math.ceil((Math.random()*6));
			if(ms == 0){
				c = b;
				ms++;
			}
			if(c == b){
				f++;
			}
			if(f==3){
				continue;
			}
			System.out.print(a+" "+b+"\n");
			s1 += a;
		}while(a!=b);
		System.out.print("Bowling");
		do{
			a = in.nextInt();
			b = (int)Math.ceil((Math.random()*6));
			System.out.print(a+" "+b+"\n");
			s2 += b;
		}while(a!=b && s2<s1);
		System.out.println( "Player A: "+ s1 + "\nPlayer B: " + s2);
		if(s1>s2){
			 tot=s1-s2;
			System.out.println("Player A Won by "+tot+" runs");
		}
		else if(s1<s2)
			System.out.println("Player B Won");
		else
			System.out.println("Match Tied");
	}
}
