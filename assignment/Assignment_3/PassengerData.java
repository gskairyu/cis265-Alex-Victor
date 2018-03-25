import java.util.Scanner; 
class PassengerData extends Passenger { 
 public static CreateQueue<Passenger> createQueue; 
 public PassengerData() { 
  super(); 
 } 
 public void menuOptions(){ 
  char choice; 
  do { 
   System.out.println("Enter A(dd), R(emove), S(can), or Q(uit)"); 
   //scan the input 
   Scanner input = new Scanner(System.in); 
      choice = (input.nextLine()).toUpperCase().charAt(0); 
   switch(choice) { 
    case 'A': 
    //ADD PASSENGERS TO THE QUEUE 
     /* YOUR CODE HERE */ 
    	Passenger gat=new Passenger(); 
    	System.out.println("Enter Passenger Name");
    	gat.setName((input.nextLine()).toUpperCase());
    	System.out.println("Enter the ticket type(AC/Gen");
    	gat.setTicket_type((input.nextLine()).toUpperCase());
    	System.out.println("Enter the Seat number");
    	gat.setSeat_no(input.nextInt());
    	createQueue.enqueue(gat);
    	System.out.println(gat); 
    
   	 
    	
    	/*System.out.println("Enter the ticket type(AC/Gen");
    	setTicket_type((input.nextLine()).toUpperCase());
    	System.out.println("Enter the Seat number");
    	setSeat_no(input.nextInt());*/
    	
    	
     break; 
    case 'R': 
    //REMOVE PASSENGER FROM THE QUEUE 
     /* YOUR CODE HERE */ 
     break; 
    case 'S': 
    //SCAN AND DISPLAY DETAILS OF A PARTICULAR PASSENGER 
     /* YOUR CODE HERE */ 
     break; 
    case 'Q': 
    //DISPLAY CONTENTS IN QUEUE AND QUIT THE LOOP
    	System.out.println(createQueue.size()); 
    	while(createQueue.iterator().hasNext()==true){
    	System.out.println(createQueue.iterator().next());
    	}
     /* YOUR CODE HERE */ 
     break; 
    default: 
     System.out.println("Invalid choice ---try again\n"); 
   } 
  } while (choice != 'Q'); 
 } 
 public static void main(String[] args) { 
  createQueue = new CreateQueue<Passenger>(); 
  PassengerData data = new PassengerData(); 
  data.menuOptions(); 
 } 
} 
