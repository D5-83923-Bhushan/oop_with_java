import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=40;
        int n2=15;
        int n3=30;
        int n4=15;
        int n5=15;
        int n6=35;
        int n7=20;
        int n8=30;
        int n9=35;
        int n10=35;
        
        int totalbill = 0;
        
        
		System.out.println("*********** Food Menu ************\n");
		
        //System.out.println("select item \n 1.Dosa =40  \n 2.Samosa=15 RS \n 3.Idli=30 RS \n 4.vadapa=15 RS \n 5.Bread pattice=15 RS \n 6.pulav=35 RS \n 7.Upma=20 RS  \n 8.Bhel=30 RS  \n 9.vadasambhar=35 RS  \n 10.kachori =20 RS \n 11.Generate Bill");
	    
        System.out.println("select item \n\n1.Dosa = " +n1 );
        System.out.println("2.Samosa = " +n2 );
        System.out.println("3.Idli = " +n3 );
        System.out.println("4.vadapa = " +n4 );
        System.out.println("5.Bread pattice = " +n5 );

        System.out.println("6.pulav = " +n6 );
        System.out.println("7.Upma = " +n7 );
        System.out.println("8.Bhel = " +n8 );
        System.out.println("9.vadasambhar = " +n9 );
        System.out.println("10.kachori = " +n10 );
        System.out.println("10.Total Bill current  = " +totalbill +"\n");
        
        int ch;
		do {
        	
        System.out.println("Select Item ");
        
         ch=sc.nextInt();
        
        switch (ch) {
		case 1:
			  System.out.println("You selected dosa "+n1);
			  totalbill+=n1;
			  break;
		case 2:
			System.out.println("You selected Samosa "+n2);
			totalbill+=n2;
			break;
		case 3:
			System.out.println("You selected Idli "+n3);
			totalbill+=n3;
			break;
		case 4:
			System.out.println("You selected vadapav "+n4);
			totalbill+=n4;
			break;
			
		case 5:
			System.out.println("You selected Bread pattice "+n5);
			totalbill+=n5;
			break;
			
		case 6:
			System.out.println("You selected pulav "+n6);
			totalbill+=n6;
			break;
			
		case 7:
			System.out.println("You selected upma "+n7);
			totalbill+=n7;
			break;
		
		case 8:
			System.out.println("You selected Bhel "+n8);
			totalbill+=n8;
			break;
			
		case 9:
			System.out.println("You selected vadasambhar "+n9);
			totalbill+=n9;
			break;
	
		case 10:
				System.out.println("You selected kachori "+n10);
				totalbill+=n10;
				break;
					
		case 11 :
			System.out.println("Total bill is "+totalbill);

		default:
			System.out.println("Thank You visit again...");
			break;
		}
		
        }while(ch!=12); {}
        
		 
		 
		
	}

}
