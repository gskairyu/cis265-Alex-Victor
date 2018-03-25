class Passenger { 
 private String name; 
 private String ticket_type; 
 private int seat_no; 
 public Passenger() { 
 } 
 public Passenger(String name, String type, int num) { 
  this.setName(name); 
  this.setTicket_type(type); 
  this.setSeat_no(num); 
 } 
 public String toString() { 
  return this.getName() + " " + this.getTicket_type(); 
 } 
 public String getName() { 
  return name; 
 } 
 public void setName(String name) { 
  this.name = name; 
 } 
 public String getTicket_type() { 
  return ticket_type; 
 } 
 public void setTicket_type(String ticket_type) { 
  this.ticket_type = ticket_type; 
 } 
 public int getSeat_no() { 
  return seat_no; 
 } 
 public void setSeat_no(int seat_no) { 
  this.seat_no = seat_no; 
 } 
} 
