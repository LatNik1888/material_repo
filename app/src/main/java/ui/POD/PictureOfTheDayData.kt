package ui.POD

sealed class PictureOfTheDayData {
    data class Success(val serverResponseData: PictureOfTheDayServerResponse) : PictureOfTheDayData()
    data class Error(val error: Throwable) : PictureOfTheDayData()
    data class Loading(val progress: Int?) : PictureOfTheDayData()
}