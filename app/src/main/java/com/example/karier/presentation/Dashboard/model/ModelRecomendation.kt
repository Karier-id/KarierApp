package com.example.karier.presentation.Dashboard.model

data class ModelRecomendation(
    val id: String,
    val title: String,
    val company: String,
    val location: String,
    val imageContent: String,
    val label: String,
    val variant: List<JobVariant?>
)

