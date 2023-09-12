module edu.virginia.cs.coursereviewsystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.sql;

    opens edu.virginia.cs.coursereviewsystem to javafx.fxml;
    exports edu.virginia.cs.coursereviewsystem;
}