package com.lord_ukaka.newsapp.database

import androidx.room.TypeConverter
import com.lord_ukaka.newsapp.dto.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}