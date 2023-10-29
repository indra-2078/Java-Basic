import java.util.*;
public class valuechange {
    // values of var cannot be changed
    // values of arrays can be changed
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
		int t = se.nextInt();
		for(int i =0;i<t;i++){
		    int a = se.nextInt();
		    int b = se.nextInt();
		    int c = se.nextInt();
		    if(a>b){
		        b = a;
		    }
		    System.out.println(b*c);
		        
		    }
    }
}
