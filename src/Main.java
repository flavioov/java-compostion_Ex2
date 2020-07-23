import Entities.Comment;
import Entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyy");

        Comment c1 = new Comment("Have a nice trip !");
        Comment c2 = new Comment("Wow, that's awesome !");
        Post p1 = new Post(
                sdf1.parse("21/02/2020"),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country !",
                12);

        p1.addComment(c1);
        p1.addComment(c2);

        Comment c3 = new Comment("Good night !");
        Comment c4 = new Comment("May the force be with you");
        Post p2 = new Post(
                sdf1.parse("28/05/2020"),
                "Good night guys",
                "See you tomorrw",
                5);


        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p1);
        System.out.println(p2);

    }
}
