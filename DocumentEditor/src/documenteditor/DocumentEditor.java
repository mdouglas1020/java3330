/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package documenteditor;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


/**
 *
 * @author Professor Wergeles
 */
public class DocumentEditor extends Application {
    
    public String title = "Document Editor"; 
    
    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle(title);
        
        VBox root = new VBox(20); 
        
        GridPane grid = new GridPane(); 
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(20);
        
        Label titleLabel = new Label("Title:");
        TextField titleField = new TextField(); 
        titleField.setPrefColumnCount(45);
        HBox titleFieldBox = new HBox(10); 
        titleFieldBox.setAlignment(Pos.CENTER_LEFT);
        titleFieldBox.getChildren().addAll(titleLabel, titleField); 
        
        grid.add(titleFieldBox, 0, 0);
        
//        HTMLEditor editor = new HTMLEditor(); 
//        editor.setPrefSize(600, 500);
//        root.add(editor, 0, 1);

        TextArea editor = new TextArea(); 
        editor.setPrefColumnCount(45);
        editor.setPrefRowCount(25);
        grid.add(editor, 0, 1); 
        
        Button saveButton = new Button("Save"); 
        HBox saveButtonBox = new HBox(); 
        saveButtonBox.setAlignment(Pos.CENTER_RIGHT);
        saveButtonBox.getChildren().add(saveButton); 
        
        //saveButton.setRotate(45);
        
        grid.add(saveButtonBox, 0, 2); 
        
        
        MenuBar menuBar = new MenuBar(); 
        Menu fileMenu = new Menu("File"); 
        menuBar.getMenus().add(fileMenu); 
        MenuItem openMenuItem = new MenuItem("Open"); 
        //fileMenu.getItems().add(openMenuItem); 
        MenuItem saveMenuItem = new MenuItem("Save"); 
        fileMenu.getItems().addAll(openMenuItem, saveMenuItem); 
        
        FileChooser chooser = new FileChooser(); 
        
        openMenuItem.setOnAction((ActionEvent event) -> {
            System.out.println("Open Chosen");
            
            File file = chooser.showOpenDialog(primaryStage); 
            if( file != null ){
                System.out.println(file.toString()); 
                
                
            }
        });
        
        saveMenuItem.setOnAction((ActionEvent event) -> {
            File file = chooser.showSaveDialog(primaryStage); 
            
            System.out.println(file.toString()); 
            
        });
        
        root.getChildren().add(menuBar); 
        root.getChildren().add(grid); 
        
        Scene scene = new Scene(root, 800, 700); 
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
