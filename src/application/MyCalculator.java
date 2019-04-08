package application;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MyCalculator {
	@FXML
	private Button sumar;
	@FXML
	private Button restar;
	@FXML
	private Button multiplicar;
	@FXML
	private Button elevar;
	@FXML
	private Button raiz;
	@FXML
	private Button borrar;
	@FXML
	private Button dividir;
	@FXML
	private TextField num1;
	@FXML
	private TextField num2;
	@FXML
	private TextField resultado;
	@FXML
	private int res;
	@FXML
	public void initialize() {
		// TODO (don't really need to do anything here).
	}

	public void suma(ActionEvent event) {
		int number1 = Integer.parseInt(num1.getText());
		int number2 = Integer.parseInt(num2.getText());
		res = number1 + number2;
		resultado.setText(String.valueOf(res));
	}

	public void resta(ActionEvent event) {
		int number1 = Integer.parseInt(num1.getText());
		int number2 = Integer.parseInt(num2.getText());
		res = number1 - number2;
		resultado.setText(String.valueOf(res));
	}

	public void producto(ActionEvent event) {
		int number1 = Integer.parseInt(num1.getText());
		int number2 = Integer.parseInt(num2.getText());
		res = number1 * number2;
		resultado.setText(String.valueOf(res));
	}

	public void division(ActionEvent event) {
		int number1 = Integer.parseInt(num1.getText());
		int number2 = Integer.parseInt(num2.getText());
		res = number1 / number2;
		resultado.setText(String.valueOf(res));
	}

	public void powear(ActionEvent event) {
		int number1 = Integer.parseInt(num1.getText());
		int number2 = Integer.parseInt(num2.getText());
		res=(int) Math.pow(number1, number2);
		resultado.setText(String.valueOf(res));
	}
	public void square(ActionEvent event) {
		int number1 = Integer.parseInt(num1.getText());
		res=(int) Math.sqrt(number1);
		resultado.setText(String.valueOf(res));
	}
	public void borrado(ActionEvent event) {
		num1.setText(null);
		num2.setText(null);
		resultado.setText(null);
	}

}
