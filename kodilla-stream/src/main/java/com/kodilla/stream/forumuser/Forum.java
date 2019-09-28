package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> listOfForumUsers = new ArrayList<>();

    public Forum() {
        listOfForumUsers.add(new ForumUser(101, "Ania", 'F', 1980, 1, 12, 50));
        listOfForumUsers.add(new ForumUser(102, "Basia", 'F', 1990, 2, 11, 40));
        listOfForumUsers.add(new ForumUser(103, "Cesia", 'F', 2005, 3, 10, 30));
        listOfForumUsers.add(new ForumUser(104, "Danusia", 'F', 2010, 4, 9, 20));
        listOfForumUsers.add(new ForumUser(105, "Edziu", 'M', 1970, 5, 8, 15));
        listOfForumUsers.add(new ForumUser(106, "Franiu", 'M', 1980, 6, 7, 10));
        listOfForumUsers.add(new ForumUser(107, "Grześ", 'M', 2008, 7, 6, 5));
        listOfForumUsers.add(new ForumUser(108, "Heniu", 'M', 2019, 8, 5, 0));
    }

    public ArrayList<ForumUser>getUserList(){
        return new ArrayList<> (listOfForumUsers);
    }


}
