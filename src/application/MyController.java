package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class MyController {

	ObservableList<String> lista = FXCollections.observableArrayList("David", "Laura", "Camacho", "Jorge", "Alicia", "Daniel", "Santiago", "Gonzalo","Alejandro");
	@FXML
	private Button btnAdd;
	@FXML
	private Button btnRemove;
	@FXML
	private ListView<String> lstCandidates;
	@FXML
	private ListView<String> lstSelected;

	public void initialize() {
		cargar();
	}

	public void cargar() {
		lstCandidates.setItems(lista);
	}

	public void anadir(ActionEvent event) {
		if (lstCandidates.getSelectionModel().getSelectedItem() != null) {
			lstSelected.getItems().add(lstCandidates.getSelectionModel().getSelectedItem());
			lstCandidates.getItems().remove(lstCandidates.getSelectionModel().getSelectedItem());
		}
	}

	public void eliminar(ActionEvent event) {
		if (lstSelected.getSelectionModel().getSelectedItem() != null) {
			lstCandidates.getItems().add(lstSelected.getSelectionModel().getSelectedItem());
			lstSelected.getItems().remove(lstSelected.getSelectionModel().getSelectedItem());
		}
	}

}
