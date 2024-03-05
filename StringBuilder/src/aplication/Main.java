package aplication;

import entities.Comment;
import entities.Post;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);


        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        Post post1 = new Post(
            LocalDateTime.parse("21/06/2018 13:05:44", format),
        "Traveling to New Zeland",
    "I'm going to visit this worderful contry",
        12
        );
        post1.addComment(new Comment("Have a nice trip"));
        post1.addComment(new Comment("Wow that's awesome"));

        Post post2 = new Post(
                LocalDateTime.parse("28/07/2018 23:14:19", format),
                "Good night guys",
                "see u tomorrow",
                5
        );
        post2.addComment(new Comment("Good night"));
        post2.addComment(new Comment("May the Force be with u"));

        System.out.println(post1);
        System.out.println(post2);

    }
}