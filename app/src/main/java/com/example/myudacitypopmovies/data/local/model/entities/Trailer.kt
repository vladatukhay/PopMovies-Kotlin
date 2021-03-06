package com.example.myudacitypopmovies.data.local.model.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.Index
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.io.Serializable

@Entity(tableName = "trailer", indices = Index("movie_id"), foreignKeys = ForeignKey(entity = Movie::class, parentColumns = "id", childColumns = "movie_id", onDelete = CASCADE, onUpdate = CASCADE))
class Trailer(@field:SerializedName("id") @field:PrimaryKey val id: String, @field:ColumnInfo(name = "movie_id") var movieId: Long, @field:SerializedName("key") val key: String, @field:SerializedName("site") val site: String, @field:SerializedName("name") val name: String) : Serializable