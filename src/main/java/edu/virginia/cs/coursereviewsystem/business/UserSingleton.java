package edu.virginia.cs.coursereviewsystem.business;

import edu.virginia.cs.coursereviewsystem.Student;
import edu.virginia.cs.coursereviewsystem.data.DatabaseManager;

public class UserSingleton {

    private static final UserSingleton instance = new UserSingleton();

    private Student currentUser;
    private DatabaseManager dbManager;
    private ReviewSystemService service;

    private UserSingleton(){}

    public static UserSingleton getInstance() {
        return instance;
    }

    public Student getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(Student user) {
        this.currentUser = user;
    }

    public DatabaseManager getDbManager() { return dbManager; }
    public void setDbManager(DatabaseManager dbManager) { this.dbManager = dbManager; }

    public ReviewSystemService getService() { return service; }

    public void setService(ReviewSystemService reviewService) { this.service = reviewService; }
}
