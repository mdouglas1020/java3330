/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package documenteditor2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.web.HTMLEditor;
import javafx.stage.Stage;
import static documenteditor2.WriteToFile.*;

/**
 *
 * @author MichaelDouglas
 */
public class Documenteditor2 extends Application {
      public String title = "Document Editor 2";
    public int width = 800;
    public int height = 700;
    
    
    @Override
    public void start(Stage primaryStage) {
       primaryStage.setTitle(title);
       GridPane grid = new GridPane();
       VBox root = new VBox();
       grid.setAlignment(Pos.CENTER);
       grid.setVgap(20);
       Label titleLabel = new Label("Title");
       TextField titleField = new TextField();
       titleField.setPrefColumnCount(45);
       HBox titleFieldBox = new HBox(10);
       titleFieldBox.setAlignment(Pos.CENTER_LEFT);
       titleFieldBox.getChildren().addAll(titleLabel, titleField);
       
       grid.add(titleFieldBox, 0, 0);
//       
//       TextArea editor = new TextArea();
//       editor.setPrefRowCount(25);
//       editor.setPrefColumnCount(50);
//       grid.add(editor, 0 , 1);
       
       HTMLEditor editor = new HTMLEditor();
       editor.setPrefSize(600,500);
       grid.add(editor, 0, 1);
       
       Button saveButton = new Button("Save");
       HBox saveButtonBox = new HBox();
       saveButtonBox.setAlignment(Pos.CENTER_RIGHT);
       saveButtonBox.getChildren().add(saveButton);
       grid.add(saveButtonBox, 0, 2);
       
       Button clearButton = new Button("Clear");
       HBox clearButtonBox = new HBox();
       clearButtonBox.setAlignment(Pos.CENTER_LEFT);
       clearButtonBox.getChildren().add(clearButton);
       grid.add(clearButtonBox, 0, 2);
       
       MenuBar menuBar = new MenuBar();
       Menu fileMenu = new Menu("File");
       menuBar.getMenus().add(fileMenu);
       MenuItem openMenuItem = new MenuItem("Open");
        MenuItem saveMenuItem = new MenuItem("Save");
       fileMenu.getItems().add(openMenuItem);
       fileMenu.getItems().add(saveMenuItem);
       Menu editMenu = new Menu("Edit");
       menuBar.getMenus().add(editMenu);
       MenuItem clearMenuItem = new MenuItem("Clear");
       editMenu.getItems().add(clearMenuItem);
       
       
       openMenuItem.setOnAction((ActionEvent event) -> {
       System.out.println("Open Chosen");
    });
       
       saveMenuItem.setOnAction((ActionEvent event) -> {
       System.out.println("Save Chosen");
    });
       
       saveButton.setOnAction((ActionEvent event)-> { 
      
        String savedText = editor.getHtmlText();
         WriteToFile invoke = new WriteToFile();
         
         invoke.WriteToFile2(savedText);
        
         
         
           
       });
       
       clearMenuItem.setOnAction((ActionEvent event)->{
       
           String savedText = editor.getHtmlText();
           
           
       
       });
       
       clearButton.setOnAction((ActionEvent event)-> {
       
          editor.setHtmlText("");
       
       });
       
//       saveButton.setRotate(45);
//       editor.setRotate(-90);
       
       root.getChildren().add(menuBar);
       
       root.getChildren().add(grid);
       
       Scene scene = new Scene(root, width, height);
       primaryStage.setScene(scene);
       primaryStage.show();
       
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
