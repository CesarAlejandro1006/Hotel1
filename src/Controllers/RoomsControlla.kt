package Controllers

import Cosas.Room
import Mas_cosas.Printer
import Cosas.Room as Room1

class RoomsControlla(printer: Printer) {
    private val roomList by lazy { var mutableListOf: MutableList<Room>
        val also = mutableListOf(Room1(
            d = 200.00,
            i = 2,
            i1 = 2,
            b = true
        )).also { mutableListOf = it }
        return@lazy mutableListOf
    }

    fun registerRoom() {
        Printer.printMsg("Ingrese el precio por noche")
        val pricePerNight = readln().toDouble()
        Printer.printMsg("Ingrese la capacidad")
        val capacity: Int = readln().toInt()
        Printer.printMsg("Ingrese el numero de habitacion")
        val roomNumber: Int = readln().toInt()
        val isAvailable = true

        val addedRoom = Room(
            d = pricePerNight,
            i = capacity,
            i1 = roomNumber,
            b = isAvailable
        )
        roomList.add(addedRoom)
    }

    fun modifyRoom(modifiedRoom: Room, index: Int) {
        roomList[index] = modifiedRoom
    }

    fun getRoomByIndex(index: Int): Room {
        return roomList[index]
    }

    fun showRooms() {
        if (roomList.isEmpty()) {
            Printer.printMsg("No hay habitaciones registradas")
        } else {
            var counter = 1
            for (room in roomList) {
                Printer.printMsg("$counter " + room.getRoomData())
                counter++
            }
        }
    }

    fun areNotRoomsRegistered(): Boolean = roomList.isEmpty()
}