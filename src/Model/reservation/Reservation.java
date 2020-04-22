package Model.reservation;

import Model.Guest.Guest;
import Model.Room.Room;
import Model.StatusEntity;
import Persistence.Entity;

import java.time.LocalDate;


public class Reservation extends StatusEntity<ReservationStatus>{

	private Guest guest;
	private Room room;
	private LocalDate checkInDate;
	private LocalDate checkOutDate;
	private short numberOfAdults;
	private short numberOfChildren;

	// constructor for use in program
	public Reservation(Guest guest, Room room, LocalDate checkInDate, LocalDate checkOutDate, short numberOfAdults, short numberOfChildren)
	{

		this.guest = guest;
		this.room = room;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.numberOfAdults = numberOfAdults;
		this.numberOfChildren = numberOfChildren;
		super.setStatus(ReservationStatus.CONFIRMED);
		this.room.setReservation(this);
	}

	public Guest getGuest()
	{
		return guest;
	}

	public Room getRoom()
	{
		return room;
	}

	public LocalDate getCheckInDate()
	{
		return checkInDate;
	}

	public LocalDate getCheckOutDate()
	{
		return checkOutDate;
	}

	public int getNumberOfAdults()
	{
		return numberOfAdults;
	}

	public int getNumberOfChildren()
	{
		return numberOfChildren;
	}


}
