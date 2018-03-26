import java.util.*; 
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
    	System.out.println("Enter the ticket type(AC/Gen)");
    	gat.setTicket_type((input.nextLine()).toUpperCase());
    	System.out.println("Enter the Seat number");
    	gat.setSeat_no(input.nextInt());
    	createQueue.enqueue(gat);   	
    	
     break; 
    case 'R': 
    //REMOVE PASSENGER FROM THE QUEUE 
    	System.out.println("Passenger removed is :"+createQueue.dequeue()); 
     /* YOUR CODE HERE */ 
     break; 
    case 'S': 
    //SCAN AND DISPLAY DETAILS OF A PARTICULAR PASSENGER
    	if (createQueue.hasItems()==false) {
    		
    		System.out.println("The list is empty"); 
    		break;
    	}
    	else {
    	System.out.println("Enter the passenger whose details are neeeded");
    	String check=(input.nextLine()).toUpperCase();
    	String keep=""; 
    	Iterator k=createQueue.iterator() ;
    	while(k.hasNext()){
    	String gat2=String.valueOf(k.next());
    	String[] splitStr = gat2.split("\\s");
    	
    	if(splitStr[0].equals(check)) {
    		keep=splitStr[0];
    		System.out.println(gat2);
    		break;
    	}
    	}
    	
    	if(keep.equals(check)) {	
    	break;
    	}
    	else {
    	 System.out.println("Passsenger with the name: "+check +"not found");
    	 break;
    	}
    	}	
     /* YOUR CODE HERE */ 
     
    case 'Q': 
    //DISPLAY CONTENTS IN QUEUE AND QUIT THE LOOP
    	Iterator g=createQueue.iterator() ;
    	System.out.println(createQueue.size());
    	while(g.hasNext()){
    	System.out.println(g.next());
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
