package com.lionbank.model;

public class Comment {

    private String commentDetail;
    private int commentID;
    private String commentedBy;
    private String topicID;
    private int upvotes;

    public Comment() {
    }

    public Comment(String commentDetail, int commentID, int topicID, String commentedBy) {
        super();
        this.commentDetail = commentDetail;
        this.commentID = commentID;
        this.topicID = topicID;
        this.commentedBy = commentedBy;
    }

    public String getCommentDetail() {
        return commentDetail;
    }

    public void setCommentDetail(String commentDetail) {
        this.commentDetail = commentDetail;
    }

    public int getCommentID() {
        return commentID;
    }

    public void setCommentID(int commentID) {
        this.commentID = commentID;
    }

    public String getCommentedBy() {
        return commentedBy;
    }

    public void setCommentedBy(String commentedBy) {
        this.commentedBy = commentedBy;
    }

    public String getTopicID() {
        return topicID;
    }

    public void setTopicID(String topicID) {
        this.topicID = topicID;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(int upvotes) {
        this.upvotes = upvotes;
    }
}
