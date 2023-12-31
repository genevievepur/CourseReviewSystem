package edu.virginia.cs.coursereviewsystem.data;

import edu.virginia.cs.coursereviewsystem.Student;
import edu.virginia.cs.coursereviewsystem.Course;
import edu.virginia.cs.coursereviewsystem.Review;

import java.util.List;

public class DatabaseTester {
    public static void main(String[] args) {
//        UserSingleton userSingleton = UserSingleton.getInstance();
//        if (userSingleton.getDbManager() == null) {
//            userSingleton.setDbManager(new DatabaseManager());
//        }
//
//        userSingleton.getDbManager().connect();
//        userSingleton.getDbManager().deleteTables();
//        userSingleton.getDbManager().createTables();
//        userSingleton.getDbManager().disconnect();
//    }
        DatabaseManager dbManager = new DatabaseManager();
        dbManager.connect();
        dbManager.deleteTables();
        dbManager.createTables();


        Student amy1 = new Student("Amy", "qwerty");
        Student john = new Student("John", "123456");
        Student amy2 = new Student("Amy", "abcdef");


        Course course1 = new Course("CS", 1110);
        Course course2 = new Course("CS", 3140);


        dbManager.addStudent(amy1);
        dbManager.addStudent(john);
        dbManager.addCourse(course1);
        dbManager.addCourse(course2);
        //dbManager.addStudent(amy2);


        Review review1 = new Review(amy1, course1, "Great course!", 5);
        Review review2 = new Review(john, course1, "This course sucked!", 1);




        dbManager.addReview(review1); dbManager.addReview(review2);


        Student amyByID = dbManager.getStudentByID(1);
        System.out.println("Student 1: " + amyByID.getName());


        boolean existsSDE = dbManager.doesCourseExist("CS", 3140);
        System.out.println("SDE exists in database: " + existsSDE);


        List<Review> introReviews = dbManager.getReviewsOfCourse(course1);
        System.out.println("---- Intro to CS Reviews ----");
        for (int i = 0; i < introReviews.size(); i++) {
            Review review = introReviews.get(i);
            System.out.println("Review: " + review.getText() + "- Rating: " + review.getRating());
        }
        dbManager.disconnect();
    }
}
