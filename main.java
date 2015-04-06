import java.util.Scanner;


public class prog {
	public static void main(String[] args){
		
		int x = 0;
		LinkList list = new LinkList();
	    while(x < 50){
		
		postfixinfix obj = new postfixinfix();
		infixpostfix obje = new infixpostfix();
		
		System.out.println("");
		System.out.println("Choose one of the following (Enter Number): ");
		System.out.println("(1) Infix to Postfix");
		System.out.println("(2) Postfix to Infix");
		System.out.println("(3) Print Equations");
		System.out.println("(4) Info");
		System.out.println("(5) Exit");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		
		
		if(i == 1){
			System.out.println("You've selected an Infix to Postfix conversion");
			System.out.println("Enter an eqution in Infix form:");
			String postfix = sc.next();
			System.out.println(obje.convert(postfix));
			list.insert(""+obje.convert(postfix)+"");
			x++;
		
			
		}
		
		
		else if(i == 2){
			System.out.println("You've selected a Postfix to Infix conversion");
			System.out.println("Enter an equation in Postfix form:");
			String infix = sc.next();
			System.out.println(obj.convert(infix));
			list.insert(""+obj.convert(infix)+"");
			x++;
		}
		
		
		else if(i==3){
			System.out.println("");
			list.printList();
			x++;
		}
		
		
		else if(i==4){
			System.out.println("");
			System.out.println("-In infix notation the functions are placed between their operands, such as \"1+2\".");
		    
		    System.out.println("-In postfix notation the functions are preceded by all their operands");
		    
		    System.out.println("-This program will make these conversions for you!");
			System.out.println("");
		}
		
		
		else if(i==5){
			System.out.println("Goodbye");
			x = 50;
			
		}
		
		
		else{
			System.out.println("THAT IS NOT AN OPTION!");
			x++;
			
		}
	
	
	
	
	
		}
	
	}

}


