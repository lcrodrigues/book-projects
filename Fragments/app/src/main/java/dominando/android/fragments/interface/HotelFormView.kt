package dominando.android.fragments.`interface`

import dominando.android.fragments.Hotel

interface HotelFormView {
    fun showHotel(hotel: Hotel)
    fun errorInvalidHotel()
    fun errorSaveHotel()
}