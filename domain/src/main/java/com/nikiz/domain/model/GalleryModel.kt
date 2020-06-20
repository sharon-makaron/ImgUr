package com.nikiz.domain.model

data class GalleryModel(
    val accountId: Int,
    val accountUrl: String,
    val adType: Int,
    val adUrl: String,
    val animated: Boolean,
    val bandwidth: Long,
    val commentCount: Int,
    val cover: String,
    val coverHeight: Int,
    val cover_width: Int,
    val datetime: Int,
    val description: String,
    val downs: Int,
    val edited: Int,
    val favorite: Boolean,
    val favoriteCount: Int,
    val gifv: String,
    val hasSound: Boolean,
    val height: Int,
    val hls: String,
    val id: String,
    val images: List<Image>,
    val imagesCount: Int,
    val inGallery: Boolean,
    val inMostViral: Boolean,
    val includeAlbumAds: Boolean,
    val isAd: Boolean,
    val isAlbum: Boolean,
    val layout: String,
    val link: String,
    val looping: Boolean,
    val mp4: String,
    val mp4_size: Int,
    val nsfw: Boolean,
    val points: Int,
    val privacy: String,
    val score: Int,
    val section: String,
    val size: Int,
    val tags: List<Tag>,
    val title: String,
    val topic: String,
    val topic_id: Int,
    val type: String,
    val ups: Int,
    val views: Int,
    val vote: Boolean,
    val width: Int
)

data class Image(
    val accountId: Int,
    val accountUrl: String,
    val adType: Int,
    val adUrl: String,
    val animated: Boolean,
    val bandwidth: Long,
    val commentCount: Int,
    val datetime: Int,
    val description: String,
    val downs: Int,
    val edited: String,
    val favorite: Boolean,
    val favoriteCount: Int,
    val gifv: String,
    val hasSound: Boolean,
    val height: Int,
    val hls: String,
    val inGallery: Boolean,
    val inMostViral: Boolean,
    val isAd: Boolean,
    val link: String,
    val looping: Boolean,
    val mp4: String,
    val mp4Size: Int,
    val nsfw: Boolean,
    val points: Int,
    val score: Int,
    val section: String,
    val size: Int,
    val tags: List<Tag>,
    val title: String,
    val type: String,
    val ups: Int,
    val views: Int,
    val vote: Boolean,
    val width: Int
)

data class Tag(
    val accent: String,
    val backgroundHash: String,
    val backgroundIsAnimated: Boolean,
    val description: String,
    val displayName: String,
    val followers: Int,
    val following: Boolean,
    val isPromoted: Boolean,
    val isWhitelisted: Boolean,
    val logoDestinationUrl: String,
    val logoHash: String,
    val name: String,
    val thumbnailHash: String,
    val thumbnailIsAnimated: Boolean,
    val totalItems: Int
)