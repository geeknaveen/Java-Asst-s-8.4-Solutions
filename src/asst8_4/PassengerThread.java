/*Write a Program to reserve tickets in an online bus reservation system using 
synchronization. Program must have option for single thread to book multiple seats. 
For each seat, the program must take a passenger name. Program should print 
number of seats booked at the end as report.  
*/
package asst8_4;

//This represent a Passenger. The reasons for extending the Thread class is that this should carry the data of number of seats.
public class PassengerThread extends Thread{
	
		private int seatsNeeded;

		public PassengerThread(int seats, Runnable target, String name) {
			super(target,name);
			this.seatsNeeded = seats;
		}

		public int getSeatsNeeded() {
			return seatsNeeded;
		}
	

}
