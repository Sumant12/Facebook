package demo;
import java.util.*;

public class Post {
	public String postId;
	public String postContent;
	public String postedBy;
	public List<Photo> photos;
	public List<Video> videos;
	public int likes;
	public int shares;
	public List<Comment> comments;
	public String getPostId() {
		return postId;
	}
	public void setPostId(String postId) {
		this.postId = postId;
	}
	public String getPostContent() {
		return postContent;
	}
	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}
	public String getPostedBy() {
		return postedBy;
	}
	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}
	public List<Photo> getPhotos() {
		return photos;
	}
	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}
	public List<Video> getVideos() {
		return videos;
	}
	public void setVideos(List<Video> videos) {
		this.videos = videos;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public int getShares() {
		return shares;
	}
	public void setShares(int shares) {
		this.shares = shares;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	public Post(String postId, String postContent, String postedBy, List<Photo> photos, List<Video> videos, int likes,
			int shares, List<Comment> comments) {
		super();
		this.postId = postId;
		this.postContent = postContent;
		this.postedBy = postedBy;
		this.photos = photos;
		this.videos = videos;
		this.likes = likes;
		this.shares = shares;
		this.comments = comments;
	}

}
