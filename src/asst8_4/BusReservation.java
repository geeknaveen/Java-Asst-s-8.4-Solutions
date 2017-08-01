/*Write a Program to reserve tickets in an online bus reservation system using 
synchronization. Program must have option for single thread to book multiple seats. 
For each seat, the program must take a passenger name. Program should print 
number of seats booked at the end as report.  */
package asst8_4;

public class BusReservation implements Runnable{
	private int totalSeatsAvailable=6;
	
	public void run() {
		//BusReservation br = new BusReservation();
		PassengerThread pt = (PassengerThread) Thread.currentThread();
		boolean ticketsBooked = this.bookTickets(pt.getSeatsNeeded(), pt.getName());
		if(ticketsBooked==true){
			System.out.println("\nCONGRATS "+Thread.currentThread().getName()+" .. your requested no. of seats ("+pt.getSeatsNeeded()+") are BOOKED");
			//System.out.println("----------------------------------------------");
		}else{
			System.out.println("\nSorry "+Thread.currentThread().getName()+" .. No. of seats requested ("+pt.getSeatsNeeded()+") are not available");	
		}
	}
	// synchronized bookTickets method to book tickets.
  public  synchronized boolean bookTickets(int seats, String name){
	  System.out.println("\nWelcome to Dreambus "+Thread.currentThread().getName()+"\nNumber of Tickets Available are: "+this.getTotalSeatsAvailable());
	
	  //Book tickets if available seats are more than requested seats.
		if (seats>this.getTotalSeatsAvailable()) {
			return false;
		} else {
			
			totalSeatsAvailable = totalSeatsAvailable-seats;  //Reducing number of seats which are booked.
			
			return true;
		}
	}

	private int getTotalSeatsAvailable() {
		return totalSeatsAvailable;
	}

}
