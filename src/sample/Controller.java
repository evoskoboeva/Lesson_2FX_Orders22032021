package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import sample.OrdersPacage.Food;


public class Controller {
@FXML
    TextArea txtReport;
@FXML
    Button btnIngridients;
@FXML
Button btnMenu;
@FXML
Button btnOrders;




    public void Ingridients(ActionEvent actionEvent) {
        txtReport.setText(sample.OrdersPacage.Ingridient.class.descriptorString());
    }

    public void Menu(ActionEvent actionEvent) {
        txtReport.setText(Food.ingridient.getDescriptionIngridient());
    }

    public void Orders(ActionEvent actionEvent) {
        txtReport.setText("");
    }

}
