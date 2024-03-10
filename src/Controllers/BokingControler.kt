package Controllers

import Cosas.Customer
import Cosas.Room
import Mas_cosas.Printer
import Cosas.Booking as Booking1

class BokingControler {

    private val printer = Printer()
    private val bookingsList = mutableListOf<Booking1>()

    fun createBooking(customer: Customer, room: Room) {
        printer.printMsg("Ingrese la fecha de inicio")
        val startDate = readln()
        printer.printMsg("Ingrese la fecha de salida")
        val endDate = readln()
        printer.printMsg("Ingrese el numero de noches")
        val totalNights = readln().toInt()

        val addedBooking = Booking1(
            room = room,
            customer = customer,
            startDate,
            endDate = endDate,
            totalNights = totalNights,
            b = false
        ).apply {
            calculatePrice()
        }
        customer.addBooking(addedBooking)
        bookingsList.add(addedBooking)
    }

    fun showBookings() {
        if (bookingsList.isEmpty()) {
            printer.printMsg("No hay habitaciones registradas")
        } else {
            var counter = 1
            for (booking in bookingsList) {
                printer.printMsg("$counter " + booking.getBookingData())
                counter++
            }
        }
    }
}