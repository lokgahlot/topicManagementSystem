package com.lionbank.model;

public class Tpoic {

    private String topicName;
    private int topicID;
    private String topicDescription;
    private String topiccreatedBy;

    public Tpoic() {
    }

    public Tpoic(String topicName, int topicID, String topicDescription, String topiccreatedBy) {
        super();
        this.topicName = topicName;
        this.topicID = topicID;
        this.topicDescription = topicDescription;
        this.topiccreatedBy = topiccreatedBy;
    }

    public int getTopicID() {
        return topicID;
    }

    public void setTopicID(int topicID) {
        this.topicID = topicID;
    }

    public String getTopicDescription() {
        return topicDescription;
    }

    public void setTopicDescription(String topicDescription) {
        this.topicDescription = topicDescription;
    }

    public String getTopiccreatedBy() {
        return topiccreatedBy;
    }

    public void setTopiccreatedBy(String topiccreatedBy) {
        this.topiccreatedBy = topiccreatedBy;
    }
    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

}
