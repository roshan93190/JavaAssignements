package day5.question2;

	public class Ticket {

		 public int getTicketid() {
			return ticketid;
		}
		public void setTicketid(int ticketid) {
			if(ticketid>0) {
				this.ticketid = ticketid;	
			}
			
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public static int getAvailableTickets() {
			
			return availableTickets;
		}
		public static void setAvailableTickets(int availableTickets) {
			Ticket.availableTickets = availableTickets;
		}
		private int ticketid;
		 private int price;
		 private static int availableTickets;
		
		 public int calculateTicketCost(int nooftickets) {
			 
			 if(availableTickets>nooftickets) {
				 availableTickets-=nooftickets;
				 int total=this.price*nooftickets;
				 
				 return total;
			 }
			 else {
				 return -1;
			 }
		 }
		public static void main(String[] args) {
			Ticket t=new Ticket();
			t.setAvailableTickets(25);
			t.setPrice(10);
			
			int total=t.calculateTicketCost(12);
			System.out.println(total);
		}
		
	}
	
	/*public int calculateTicketCost(int nooftickets) —this method should check the ticket
availability, If the tickets are available, reduce the nooftickets from availableTickets and
calculate the total amount as nooftickets*price  and return the total amount.  If the
tickets are not available, this method should return -1.
Write a main method in the Main class to test the application*/
