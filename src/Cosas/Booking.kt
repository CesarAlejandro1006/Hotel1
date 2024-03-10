package Cosas

abstract class Booking(
    room: Room,
    customer: Customer,
    startDate: String,
    endDate: String,
    totalNights: Int,
    b: Boolean
) {
    abstract val room: Room
    val customer: Customer
        get() {
            TODO()
        }
    private val startDate: String
        get() {
            TODO()
        }
    private val endDate: String
        get() {
            TODO()
        }
    private var totalNights: Int = 0
    private var isCancelled: Boolean = false
    private var totalPrice = 0.0

    fun calculatePrice() {
        totalPrice = room.pricePerNight * totalNights
    }

    fun cancelBooking() {
        isCancelled = true
    }

    fun updateNights(totalNights: Int) {
        this.totalNights = totalNights
    }

    fun getTotal(): Double = totalPrice

    fun getBookingData(): String {
        return "Nombre cliente ${customer.getCustomerData()}" + "Total de noches: $totalNights" +
                "Fecha inicio :  $startDate" +
                "Fecha final :  $endDate" +
                "Total : $totalPrice"
    }
}
