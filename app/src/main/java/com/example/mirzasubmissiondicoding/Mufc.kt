package com.example.mirzasubmissiondicoding

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Mufc(val imgSrc: Int,
                val imgName: String,
                val imgDetail : String ) : Parcelable