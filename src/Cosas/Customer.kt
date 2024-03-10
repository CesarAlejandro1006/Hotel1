package Cosas

class Customer(names: String, firstLastName: String, secondLastName: String, rfc: String, address: String) {
    private val names: String
        get() {
            TODO()
        }
    private val firstLastName: String
        get() {
            TODO()
        }
    private val secondLastName: String
        get() {
            TODO()
        }
    private val rfc: String
        get() {
            TODO()
        }
    private val address: String
        get() {
            TODO()
        }
    private val bookingList: MutableList<Booking> = mutableListOf()

    fun addBooking(booking: Booking) {
        bookingList.add(booking)
    }

    fun getCustomerData(): String {
        TODO("Not yet implemented")
    }

    companion object {
        fun getCustomerData(customer: Customer): String {
            return "Nombre: ${customer.names} ${customer.firstLastName} ${customer.secondLastName} RFC: ${customer.rfc} Address: ${customer.address}"
        }
    }
}