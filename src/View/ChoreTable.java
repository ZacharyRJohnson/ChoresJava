package View;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class ChoreTable extends Application {

    private TableView table = new TableView();

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        Scene scene = new Scene(new Group());
        primaryStage.setTitle("Table View");
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);

        final Label label = new Label("Chores");
        label.setFont(new Font("Arial", 20));

        table.setEditable(true);
        table.setPrefWidth(400);

        TableColumn nameCol = new TableColumn("Chore Name");
        TableColumn dueDateCol = new TableColumn("Due Date");
        TableColumn timeCol = new TableColumn("Time");
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        table.getColumns().addAll(nameCol, dueDateCol, timeCol);

        VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table);

        ((Group) scene.getRoot()).getChildren().addAll(vbox);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
