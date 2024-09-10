module exercisesmod {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens edu.mathurc.exercises00 to javafx.fxml;

    exports edu.mathurc.exercises00;
}
