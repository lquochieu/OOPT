package hust.soict.cttn.gui.javafx;

import java.awt.Label;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavafxCounter extends Application{
	
	private TextField tftCount;
	private Button btnCount;
	private int count = 0;
	@Override
	public void start(Stage arg0) throws Exception {
		tftCount = new TextField("0");
		tftCount.setEditable(false);
		btnCount = new Button("Counter");
		btnCount.setOnAction(evt -> tftCount.setText(++count + ""));
		
		FlowPane flow = new FlowPane();
		flow.setPadding(new Insets(15, 12, 15, 12));
		flow.setVgap(10);
		flow.setHgap(10);
		flow.getChildren().addAll(new javafx.scene.control.Label("Count: "), tftCount, btnCount);
		
		arg0.setScene(new Scene(flow, 400, 100));
		arg0.setTitle("JavaFX Counter");
		arg0.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
