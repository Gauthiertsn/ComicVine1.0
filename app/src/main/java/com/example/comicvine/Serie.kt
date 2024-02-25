package com.example.comicvine

import com.example.comicvine.Personnage
import com.example.comicvine.Episode
data class Serie(
    val title: String,
    val imageResId: Int,
    val studio: String,
    val numberOfEpisodes: Int,
    val year: Int,
    val story: String,
    val personnages: List<Personnage>,
    val episodes: List<Episode>
)