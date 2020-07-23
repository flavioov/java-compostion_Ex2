package Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ssz");

    private Date moment;
    private String title;
    private String content;
    private int likes;

    private List<Comment> comments = new ArrayList<Comment>();

    public Post(Date moment, String title, String content, int likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }


    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void removeComment(Comment comment) {
        comments.remove(comment);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(title + "\n");
        stringBuilder.append(likes);
        stringBuilder.append(" Likes - ");
        stringBuilder.append(simpleDateFormat.format(moment) + "\n");
        stringBuilder.append(content + 'n');
        stringBuilder.append("Comments: \n");
        stringBuilder.append("Comments: \n");
        for (Comment c :
                comments) {
            stringBuilder.append(c.getText() + "\n");
        }

        return stringBuilder.toString();
    }

}
