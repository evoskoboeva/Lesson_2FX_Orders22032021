package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import sample.OrdersPackage.Ingridient;
import sample.OrdersPackage.Measure;

import java.util.ArrayList;


public class Controller {
@FXML
TextArea txtReport;
@FXML
TextField txtIngridient;
@FXML
    Button btnIngridients;
@FXML
Button btnIngridientsReport;
@FXML
Button btnMenu;
@FXML
Button btnOrders;
@FXML
TextField txtnameIngridient;
@FXML
TextField txtquantityIngridient;
@FXML
TextField txtmeasure;
@FXML
TextField txtdescriptionIngridient;
    ArrayList<Ingridient> ingridients = new ArrayList<>();



    public void Menu(ActionEvent actionEvent) {
        txtReport.setText("Sorry..Menu on reconstruction");
    }

    public void Orders(ActionEvent actionEvent) {
        txtReport.setText("Sorry..Orders on reconstruction");
    }
    public void IngridientsToArray(ActionEvent actionEvent){
               txtReport.setText(ingridients.toString());



    }

    public void IngridientsCreate(ActionEvent actionEvent) {
        String nameIngridient = txtnameIngridient.getText();
        Integer quantityIngridient =0;
        Measure measure= Measure.valueOf(txtmeasure.getText());
        String descriptionIngridient=txtdescriptionIngridient.getText();
        Ingridient ingridient = null;
        try{
            quantityIngridient = Integer.parseInt(txtquantityIngridient.getText());
            ingridient = new Ingridient(nameIngridient, quantityIngridient, measure, descriptionIngridient);
            txtIngridient.setText(ingridient.toString());
        }
        catch (Exception ex)
        {
            txtIngridient.setText("Error while data conversion: " + ex.getLocalizedMessage());
        }

        ingridients.add(ingridient);
        txtnameIngridient.setText("");
        txtquantityIngridient.setText("");
        txtmeasure.setText("");
        txtdescriptionIngridient.setText("");




    }

}
