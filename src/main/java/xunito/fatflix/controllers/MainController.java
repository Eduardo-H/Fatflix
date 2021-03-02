package xunito.fatflix.controllers;

import xunito.fatflix.App;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class MainController {

	@FXML
	private ImageView logo;
	
    @FXML
    private void logout() {
    	App.changeResizable();
    	App.setRoot("login");
    }
    
    @FXML
	public void openMoviesWindow() {
		App.setRoot("movies");
	}
    
    @FXML
	public void openTVShowsWindow() {
		App.setRoot("tvShows");
	}
    
    @FXML
    public void openDirectorsWindow() {
    	App.setRoot("directors");
    }
    
    @FXML
    public void openActorsWindow() {
    	App.setRoot("actors");
    }
}
