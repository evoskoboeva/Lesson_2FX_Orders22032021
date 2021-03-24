package sample.OrdersPackage;

import java.util.Objects;

public class Ingridient {
    private String nameIngridient;
    private Integer quantityIngridient;
    private Measure measure;
    private String descriptionIngridient;


    @Override
    public  String toString() {
        return
                "  nameIngridient= " + nameIngridient  +
                ", quantityIngridient= " + quantityIngridient +
                ", measure= " + measure +
                ", description= " + descriptionIngridient  +System.lineSeparator();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ingridient)) return false;
        Ingridient that = (Ingridient) o;
        return getNameIngridient().equals(that.getNameIngridient()) && getQuantityIngridient().equals(that.getQuantityIngridient()) && getMeasure() == that.getMeasure() && Objects.equals(getDescriptionIngridient(), that.getDescriptionIngridient());
    }



    public String getNameIngridient() {
        return nameIngridient;
    }

    public void setNameIngridient(String nameIngridient) {
        this.nameIngridient = nameIngridient;
    }

    public Integer getQuantityIngridient() {
        return quantityIngridient;
    }

    public void setQuantityIngridient(Integer quantityIngridient) {
        if (quantityIngridient < 0) {
            this.quantityIngridient = 0;
        } else {
            this.quantityIngridient = quantityIngridient;
        }
    }

    public Measure getMeasure() {
        return measure;
    }

    public void setMeasure(Measure measure) {
        this.measure = measure;
    }

    public String getDescriptionIngridient() {
        return descriptionIngridient;
    }

    public void setDescriptionIngridient(String descriptionIngridient) {
        this.descriptionIngridient = descriptionIngridient;
    }

    public Ingridient(String nameIngridient, Integer quantityIngridient, Measure measure, String descriptionIngridient) {
        this.nameIngridient = nameIngridient;
        this.setQuantityIngridient(quantityIngridient);
        this.measure = measure;
        this.descriptionIngridient = descriptionIngridient;
    }



}
