package demo;

public class Comment {
	public String postId;
	public String comment;
	public Photo imagecomment;
	public Video videocomment;
	public Reaction reaction;
	public String getPostId() {
		return postId;
	}
	public void setPostId(String postId) {
		this.postId = postId;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Photo getImagecomment() {
		return imagecomment;
	}
	public void setImagecomment(Photo imagecomment) {
		this.imagecomment = imagecomment;
	}
	public Video getVideocomment() {
		return videocomment;
	}
	public void setVideocomment(Video videocomment) {
		this.videocomment = videocomment;
	}
	public Reaction getReaction() {
		return reaction;
	}
	public void setReaction(Reaction reaction) {
		this.reaction = reaction;
	}
}
