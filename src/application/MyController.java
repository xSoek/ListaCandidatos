package application;

import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.util.converter.LocalDateStringConverter;
import javafx.scene.control.Alert.AlertType;

public class MyController {

	@FXML
	private Button MyButton;
	@FXML
	private DatePicker MyCalendar;
	@FXML

	
	public void Alerta(ActionEvent event) throws ParseException {
	LocalDate fexa = MyCalendar.getValue();
	String today = String.valueOf(fexa);
	//Date date2=new SimpleDateFormat("yyyy/MM/dd").parse(fechaa); 
	String spring = "2019/03/20"; 
	String summer = "2019/06/21"; 
	String autumn = "2019/09/22"; 
	String winter = "2019/09/22"; 
	Date primavera = new SimpleDateFormat("yyyy/MM/dd").parse(spring); 
	Date verano = new SimpleDateFormat("yyyy/MM/dd").parse(summer); 
	Date otono = new SimpleDateFormat("yyyy/MM/dd").parse(autumn); 
	Date invierno = new SimpleDateFormat("yyyy/MM/dd").parse(winter); 
	Date hoy=new SimpleDateFormat("yyyy-MM-dd").parse(today); 
	
	if((primavera.compareTo(hoy)<0||primavera.compareTo(hoy)==0) && (verano.compareTo(hoy)>0) ) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Resultado");
		alert.setHeaderText("");
		alert.setContentText("Summer is comming... ");
		alert.showAndWait();
	}else if((verano.compareTo(hoy)==0 ||(verano.compareTo(hoy)<0)) && otono.compareTo(hoy)>0) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Resultado");
		alert.setHeaderText("");
		alert.setContentText("Summer has come... ");
		alert.showAndWait();
	}else if((otono.compareTo(hoy)==0 ||(otono.compareTo(hoy)<0)) && invierno.compareTo(hoy)>0) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Resultado");
		alert.setHeaderText("");
		alert.setContentText("Summer has passed... ");
		alert.showAndWait();
	}else if((invierno.compareTo(hoy)==0 ||(invierno.compareTo(hoy)<0)) && primavera.compareTo(hoy)>0) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Resultado");
		alert.setHeaderText("");
		alert.setContentText("Stop asking please, we are in winter");
		alert.showAndWait();
	}
	}
}
