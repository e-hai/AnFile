package com.an.file.functions

import android.graphics.Bitmap
import android.net.Uri
import com.an.file.model.AudioType
import com.an.file.model.ImageType
import com.an.file.model.MediaStoreData
import com.an.file.model.VideoType
import java.io.InputStream

interface Storage {

    fun createPicture(fileName: String, mimeType: ImageType = ImageType.IMAGE_JPEG): Uri

    fun createMusic(fileName: String, mimeType: AudioType = AudioType.AUDIO_AAC): Uri

    fun createMovie(fileName: String, mimeType: VideoType = VideoType.VIDEO_MPEG): Uri

    fun createOther(fileName: String): Uri

    fun savePicture(fileName: String, bitmap: Bitmap): Uri

    fun savePicture(fileName: String, inputStream: InputStream): Uri

    fun saveMovie(fileName: String, inputStream: InputStream): Uri

    fun saveMusic(fileName: String, inputStream: InputStream): Uri

    fun saveOther(fileName: String, inputStream: InputStream): Uri

    fun queryPicture(offset: Int, limit: Int): List<MediaStoreData>

    fun queryMovie(offset: Int, limit: Int): List<MediaStoreData>

    fun queryMusic(offset: Int, limit: Int): List<MediaStoreData>

    fun queryOther(offset: Int, limit: Int): List<MediaStoreData>

}