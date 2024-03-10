package Cosas

abstract class Room(d: Double, i: Int, i1: Int, b: Boolean) {
    abstract val pricePerNight: Double
    abstract val capacity: Int
    abstract val roomNumber: Int
    private val isAvailable: Boolean = true

    fun getRoomData(): String {
        return "Numero de habitacion: $roomNumber Precio por noche: $pricePerNight Capacidad : $capacity Disponible: ${if (isAvailable) "Si" else "No"}"
    }
}
