package com.example.httplibraries;

public class YouTubeEntry
{
	private String id;
	private String uploaded;
	private String uploader;
	private String category;
	private String title;
	private String description;
	private String duration;
	private String aspectRatio;
	private String rating;
	private String likeCount;
	private String ratingCount;
	private String viewCount;
	private String favoriteCount;
	private String commentCount;
	private Thumbnail thumbnail;
	private Player player;

	public YouTubeEntry(String title, String duration, String description)
	{
		this.title = title;
		this.duration = duration;
		this.description = description;
	}

	public String getVideoURL()
	{
		return player.getVideoURL();
	}

	public String getId()
	{
		return id;
	}

	public String getUploaded()
	{
		return uploaded;
	}

	public String getUploader()
	{
		return uploader;
	}

	public String getCategory()
	{
		return category;
	}

	public String getTitle()
	{
		return title;
	}

	public String getDescription()
	{
		return description;
	}

	public String getDuration()
	{
		return duration;
	}

	public String getAspectRatio()
	{
		return aspectRatio;
	}

	public String getRating()
	{
		return rating;
	}

	public String getLikeCount()
	{
		return likeCount;
	}

	public String getRatingCount()
	{
		return ratingCount;
	}

	public String getViewCount()
	{
		return viewCount;
	}

	public String getFavoriteCount()
	{
		return favoriteCount;
	}

	public String getCommentCount()
	{
		return commentCount;
	}

	public Thumbnail getThumbnail()
	{
		return thumbnail;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public void setUploaded(String uploaded)
	{
		this.uploaded = uploaded;
	}

	public void setUploader(String uploader)
	{
		this.uploader = uploader;
	}

	public void setCategory(String category)
	{
		this.category = category;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public void setDuration(String duration)
	{
		this.duration = duration;
	}

	public void setAspectRatio(String aspectRatio)
	{
		this.aspectRatio = aspectRatio;
	}

	public void setRating(String rating)
	{
		this.rating = rating;
	}

	public void setLikeCount(String likeCount)
	{
		this.likeCount = likeCount;
	}

	public void setRatingCount(String ratingCount)
	{
		this.ratingCount = ratingCount;
	}

	public void setViewCount(String viewCount)
	{
		this.viewCount = viewCount;
	}

	public void setFavoriteCount(String favoriteCount)
	{
		this.favoriteCount = favoriteCount;
	}

	public void setCommentCount(String commentCount)
	{
		this.commentCount = commentCount;
	}

	public void setThumbnail(Thumbnail thumbnail)
	{
		this.thumbnail = thumbnail;
	}

	public void setPlayer(Player player)
	{
		this.player = player;
	}

	@Override
	public String toString()
	{
		return "YouTubeEntry [id=" + id + ", uploaded=" + uploaded + ", uploader=" + uploader + ", category=" + category + ", title=" + title + ", description=" + description + ", duration=" + duration + ", aspectRatio=" + aspectRatio + ", rating=" + rating + ", likeCount=" + likeCount + ", ratingCount=" + ratingCount + ", viewCount=" + viewCount + ", favoriteCount=" + favoriteCount + ", commentCount=" + commentCount + "]";
	}
}
