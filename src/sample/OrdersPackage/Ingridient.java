package sample.OrdersPacage;

import java.util.Objects;

public class Ingridient {
    private String nameIngridient;
    private Integer quantityIngridient;
    private Measure measure;
    private String descriptionIngridient;


    @Override
    public  String toString() {
        return "Ingridient{" +
                "nameIngridient='" + nameIngridient + '\'' +
                ", quantityIngridient=" + (this.quantityIngridient<0?"not correct":this.quantityIngridient) +
                ", measure=" + measure +
                ", description='" + descriptionIngridient + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ingridient)) return false;
        Ingridient that = (Ingridient) o;
        return getNameIngridient().equals(that.getNameIngridient()) && getQuantityIngridient().equals(that.getQuantityIngridient()) && getMeasure() == that.getMeasure() && Objects.equals(getDescriptionIngridient(), that.getDescriptionIngridient());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameIngridient(), getQuantityIngridient(), getMeasure(), getDescriptionIngridient());
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
            this.quantityIngridient = -1;
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

    public Ingridient(String nameIngridient, Integer quantityIngridient,Measure measure, String descriptionIngridient) {
        this.nameIngridient = nameIngridient;
        this.setQuantityIngridient(quantityIngridient);
        this.measure = measure;
        this.descriptionIngridient = descriptionIngridient;
    }



}
