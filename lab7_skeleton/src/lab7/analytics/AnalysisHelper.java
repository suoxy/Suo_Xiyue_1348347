/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

/**
 *
 * @author harshalneelkamal
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import lab7.entities.Comment;
import lab7.entities.Post;
import lab7.entities.User;


public class AnalysisHelper {
    //Find Average number of likes per comment.
    //TODO
    
    private Map<Integer, Post> posts = DataStore.getInstance().getPosts();
    
    public void getAverageLikesPerCommets() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        int likeNumber = 0;
        int commentNumber = comments.size();
        for (Comment c : comments.values()) {
            likeNumber += c.getLikes();
        }
        
        System.out.println("1) average of likes per comments: " + likeNumber / commentNumber);           
    }
    
    public void getPostWithMostLikes() {
        int most = 0;
        Map.Entry<Integer, Post> entry = posts.entrySet().iterator().next();
        Post mostPost = entry.getValue();
        for (Post p : posts.values()) {   
            int likesForThisPost = 0; 
            for (Comment c : p.getComments()) {
                likesForThisPost += c.getLikes();
            } 
            if (likesForThisPost > most) {
                most = likesForThisPost;
                mostPost = p;
            }
        }
        System.out.println("2) Post " + mostPost.getPostId() + " has most (" + most + ") likes.");   
    }
    
    public void getPostWithMostComments() {
        int most = 0;
        Map.Entry<Integer, Post> entry = posts.entrySet().iterator().next();
        Post mostPost = entry.getValue();
        for (Post p : posts.values()) {   
            int CommentsForThisPost = p.getComments().size(); 
            if (CommentsForThisPost > most) {
                most = CommentsForThisPost;
                mostPost = p;
            }
        }
        System.out.println("3) Post " + mostPost.getPostId() + " has most (" + most + ") Comments.");
    }
    
    public void getTopFiveInactiveUserBasedOnPosts() {
            
            Map<Integer, User> users = DataStore.getInstance().getUsers();
            List<User> uList = new ArrayList<>(users.values());
            
            // sort users by total post numbers
            Comparator<User> userPostComparator = new Comparator<User>() {
                @Override
                public int compare(User userOne, User userTwo) {
                    int userOneTotalPost = 0;
                    int userTwoTotalPost = 0;
                    for (Post p : posts.values()) {
                        if (p.getUserId() == userOne.getId()) {
                            userOneTotalPost++;
                        }
                        if (p.getUserId() == userTwo.getId()) {
                            userTwoTotalPost++;
                        }
                    }                   
                    return Integer.compare(userOneTotalPost, userTwoTotalPost);
                }
            };                                   
            Collections.sort(uList, userPostComparator);
            System.out.println("4) top 5 inactive users based on total posts");
            for (int i = 1; i <= 5; i++) {
                int postsNum = 0;
                for (Post p : posts.values()) {
                    if (uList.get(i-1).getId() == p.getUserId()) {
                        postsNum++;
                    }
                }
                System.out.println("    Top " + i + " inactice user is (user ID)" + uList.get(i-1).getId() + 
                        " with " + postsNum + " posts");
            }
    }
    
    public void getTopFiveInactiveUserBasedOnComments() {
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        List<User> uList = new ArrayList<>(users.values());
        
        
         // sort users by total comments numbers
            Comparator<User> userCommentComparator = new Comparator<User>() {
                @Override
                public int compare(User userOne, User userTwo) {                   
                    return Integer.compare(userOne.getComments().size(), userTwo.getComments().size());
                }
            };
        Collections.sort(uList, userCommentComparator);
        System.out.println("5) top 5 inactive users based on total comments");
            for (int i = 1; i <= 5; i++) {
                System.out.println("    Top " + i + " inactice user is (user ID)" + uList.get(i-1).getId() + 
                        " with " + uList.get(i-1).getComments().size() + " comments");
            } 
        
    }
    
    public void getTopFiveInactiveUsersOverall() {
        Map<Integer, User> users = DataStore.getInstance().getUsers();
            List<User> uList = new ArrayList<>(users.values());
            
            
            
            // sort users by total post numbers
            Comparator<User> userOverallComparator = new Comparator<User>() {
                @Override
                public int compare(User userOne, User userTwo) {
                    int overallOne = 0;
                    int overallTwo = 0;
                    
                    int userOneTotalPost = 0;
                    int userTwoTotalPost = 0;
                    for (Post p : posts.values()) {
                        if (p.getUserId() == userOne.getId()) {
                            userOneTotalPost++;
                        }
                        if (p.getUserId() == userTwo.getId()) {
                            userTwoTotalPost++;
                        }
                    }
                    overallOne += userOneTotalPost;
                    overallTwo += userTwoTotalPost;
                    
                    int commentOne = userOne.getComments().size();
                    int commentTwo = userTwo.getComments().size();                
                    overallOne += commentOne;
                    overallTwo += commentTwo;
                    
                    int likeOne = 0;
                    int likeTwo = 0;
                    for (Comment c : userOne.getComments()) {
                        likeOne += c.getLikes();
                    }
                    for (Comment c : userTwo.getComments()) {
                        likeTwo += c.getLikes();
                    }
                    overallOne += likeOne;
                    overallTwo += likeTwo;
                    
                    
                    return Integer.compare(overallOne, overallTwo);
                }
            };                                   
            Collections.sort(uList, userOverallComparator);
            
            System.out.println("6) top 5 inactive users overall");
            for (int i = 1; i <= 5; i++) {
                int postsNum = 0;
                int likes = 0;
                int comments = uList.get(i-1).getComments().size();;
                int overall = 0;
                for (Post p : posts.values()) {
                    if (uList.get(i-1).getId() == p.getUserId()) {
                        postsNum++;
                    }
                }
                for (Comment c : uList.get(i-1).getComments()) {
                    likes += c.getLikes();
                }
                
                overall = postsNum + likes + comments;
                System.out.println("    Top " + i + " inactice user is (user ID)" + uList.get(i-1).getId() + 
                        " with " + postsNum + " posts; " + likes + " likes; " + comments + " comments; and overall is " + overall);
            }
        
    }
    
        public void getTopFiveProactiveUsersOverall() {
        Map<Integer, User> users = DataStore.getInstance().getUsers();
            List<User> uList = new ArrayList<>(users.values());
            
            
            
            // sort users by total post numbers
            Comparator<User> userOverallComparator = new Comparator<User>() {
                @Override
                public int compare(User userOne, User userTwo) {
                    int overallOne = 0;
                    int overallTwo = 0;
                    
                    int userOneTotalPost = 0;
                    int userTwoTotalPost = 0;
                    for (Post p : posts.values()) {
                        if (p.getUserId() == userOne.getId()) {
                            userOneTotalPost++;
                        }
                        if (p.getUserId() == userTwo.getId()) {
                            userTwoTotalPost++;
                        }
                    }
                    overallOne += userOneTotalPost;
                    overallTwo += userTwoTotalPost;
                    
                    int commentOne = userOne.getComments().size();
                    int commentTwo = userTwo.getComments().size();                
                    overallOne += commentOne;
                    overallTwo += commentTwo;
                    
                    int likeOne = 0;
                    int likeTwo = 0;
                    for (Comment c : userOne.getComments()) {
                        likeOne += c.getLikes();
                    }
                    for (Comment c : userTwo.getComments()) {
                        likeTwo += c.getLikes();
                    }
                    overallOne += likeOne;
                    overallTwo += likeTwo;
                    
                    
                    return Integer.compare(overallTwo, overallOne);
                }
            };                                   
            Collections.sort(uList, userOverallComparator);
            
            System.out.println("7) top 5 proactive users overall");
            for (int i = 1; i <= 5; i++) {
                int postsNum = 0;
                int likes = 0;
                int comments = uList.get(i-1).getComments().size();;
                int overall = 0;
                for (Post p : posts.values()) {
                    if (uList.get(i-1).getId() == p.getUserId()) {
                        postsNum++;
                    }
                }
                for (Comment c : uList.get(i-1).getComments()) {
                    likes += c.getLikes();
                }
                
                overall = postsNum + likes + comments;
                System.out.println("    Top " + i + " inactice user is (user ID)" + uList.get(i-1).getId() + 
                        " with " + postsNum + " posts; " + likes + " likes; " + comments + " comments; and overall is " + overall);
            }
        
    }
    
}
