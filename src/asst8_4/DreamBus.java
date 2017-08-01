/*Program should print number of seats booked at the end as report.*/
package asst8_4;

//Bus tickets reservation system will cater to booking requests of three passengers simultaneously. 
//The method reserveSeat of Reservation class is responsible for execution of the booking requests
//made by the concerned passenger and thereby the Bus Reservation System is made possible 
//due to Synchronization

//When the work of the first thread completes, then only second thread is allowed to work.
//This restriction is called as synchronization.
//We can use synchronized keyword with variables, methods and we even can make synchronized blocks like above.
//We will not be able to say that which Thread will execute first on synchronized block,
//But we can say that at a  particular time, Only one thread will be working on that block. 

public class DreamBus{
	
	public static void main(String[] args){
			BusReservation br = new BusReservation();
			// Invoke booking of first passenger
			PassengerThread pt1 = new PassengerThread(4,br,"Deepika Padukone");
			// Invoke booking of second passenger simultaneously/same time
			PassengerThread pt2 = new PassengerThread(2, br, "Alia");
			// Invoke booking of third passenger simultaneously/same time
			PassengerThread pt3 = new PassengerThread(2, br, "Sonam Kapoor");
			
			pt1.start();  //Starting passenger1 Thread.
			pt2.start();  //Starting passenger2 Thread.
			pt3.start();  //Starting passenger3 Thread.
			}
}
