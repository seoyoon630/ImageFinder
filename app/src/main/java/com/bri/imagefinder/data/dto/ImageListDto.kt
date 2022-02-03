package com.bri.imagefinder.data.dto

data class ImageListDto(
    val hits: List<ImageDto>,
    val total: Int,
    val totalHits: Int
)

data class ImageDto(
    /**댓글 개수*/
    val comments: Int,
    /**다운로드 수*/
    val downloads: Int,
    /**고화질 url*/
    val fullHDURL: String,
    /**이미지 id*/
    val id: Int,
    /**이미지 높이*/
    val imageHeight: Int,
    /**이미지 용량*/
    val imageSize: Int,
    /**이미지 url*/
    val imageURL: String,
    /**이미지 너비*/
    val imageWidth: Int,
    /**최대 사이즈로 변환한 이미지 url*/
    val largeImageURL: String,
    /**좋아요 수*/
    val likes: Int,
    /**Pixabay url*/
    val pageURL: String,
    /**미리보기 높이*/
    val previewHeight: Int,
    /**미리보기 url*/
    val previewURL: String,
    /**미리보기 너비*/
    val previewWidth: Int,
    /**tag*/
    val tags: String,
    /**todo ??*/
    val type: String,
    /**게시자*/
    val user: String,
    /**게시자 프로필*/
    val userImageURL: String,
    /**게시자 id*/
    val user_id: Int,
    /**view 수*/
    val views: Int,
    /**이미지 중간 사이즈 높이*/
    val webformatHeight: Int,
    /**이미지 중간 사이즈 url*/
    val webformatURL: String,
    /**이미지 중간 사이즈 너비*/
    val webformatWidth: Int
)

//request
//key (required)	str	Your API key: 25433416-183170f8774886a7caed027de
//q	str	A URL encoded search term. If omitted, all images are returned. This value may not exceed 100 characters.
//Example: "yellow+flower"
//lang	str	Language code of the language to be searched in.
//Accepted values: cs, da, de, en, es, fr, id, it, hu, nl, no, pl, pt, ro, sk, fi, sv, tr, vi, th, bg, ru, el, ja, ko, zh
//Default: "en"
//id	str	Retrieve individual images by ID.
//image_type	str	Filter results by image type.
//Accepted values: "all", "photo", "illustration", "vector"
//Default: "all"
//orientation	str	Whether an image is wider than it is tall, or taller than it is wide.
//Accepted values: "all", "horizontal", "vertical"
//Default: "all"
//category	str	Filter results by category.
//Accepted values: backgrounds, fashion, nature, science, education, feelings, health, people, religion, places, animals, industry, computer, food, sports, transportation, travel, buildings, business, music
//min_width	int	Minimum image width.
//Default: "0"
//min_height	int	Minimum image height.
//Default: "0"
//colors	str	Filter images by color properties. A comma separated list of values may be used to select multiple properties.
//Accepted values: "grayscale", "transparent", "red", "orange", "yellow", "green", "turquoise", "blue", "lilac", "pink", "white", "gray", "black", "brown"
//editors_choice	bool	Select images that have received an Editor's Choice award.
//Accepted values: "true", "false"
//Default: "false"
//safesearch	bool	A flag indicating that only images suitable for all ages should be returned.
//Accepted values: "true", "false"
//Default: "false"
//order	str	How the results should be ordered.
//Accepted values: "popular", "latest"
//Default: "popular"
//page	int	Returned search results are paginated. Use this parameter to select the page number.
//Default: 1
//per_page	int	Determine the number of results per page.
//Accepted values: 3 - 200
//Default: 20
//callback	string	JSONP callback function name
//pretty	bool	Indent JSON output. This option should not be used in production.
//Accepted values: "true", "false"
//Default: "false"

//response
//total	The total number of hits.
//totalHits	The number of images accessible through the API. By default, the API is limited to return a maximum of 500 images per query.
//id	A unique identifier for this image.
//pageURL	Source page on Pixabay, which provides a download link for the original image of the dimension imageWidth x imageHeight and the file size imageSize.
//previewURL	Low resolution images with a maximum width or height of 150 px (previewWidth x previewHeight).
//webformatURL
//Medium sized image with a maximum width or height of 640 px (webformatWidth x webformatHeight). URL valid for 24 hours.
//
//Replace '_640' in any webformatURL value to access other image sizes:
//Replace with '_180' or '_340' to get a 180 or 340 px tall version of the image, respectively. Replace with '_960' to get the image in a maximum dimension of 960 x 720 px.
//largeImageURL	Scaled image with a maximum width/height of 1280px.
//views	Total number of views.
//downloads	Total number of downloads.
//likes	Total number of likes.
//comments	Total number of comments.
//user_id, user	User ID and name of the contributor. Profile URL: https://pixabay.com/users/{ USERNAME }-{ ID }/
//userImageURL	Profile picture URL (250 x 250 px).