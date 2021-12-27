package erub.rb.ru.chat;

import java.io.IOException;

import erub.rb.ru.controller.ClientController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ChatClientM extends Application {

	private Stage primaryStage;
	private VBox chatLayout;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Donald but he's a client");

		initChatLayout();
	}

	private void initChatLayout() {
		try {
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(ChatClientM.class.getResource("/erub/rb/ru/chat/ClientGUI.fxml "));
			loader.setController(new ClientController());
			chatLayout = (VBox) loader.load();

			// Show the scene containing the root layout.
			Scene scene = new Scene(chatLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
