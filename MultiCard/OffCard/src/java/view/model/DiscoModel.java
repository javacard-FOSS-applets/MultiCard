package view.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class DiscoModel {
    private StringProperty moneyGet = new SimpleStringProperty("0");
    private StringProperty bonusGet = new SimpleStringProperty("0");
    private StringProperty moneyAdd = new SimpleStringProperty("0");

    public String getMoneyGet() {
        return moneyGet.get();
    }

    public void setMoneyGet(String moneyGet) {
        this.moneyGet.set(moneyGet);
    }

    public StringProperty moneyGetProperty() {
        return moneyGet;
    }

    public String getBonusGet() {
        return bonusGet.get();
    }

    public void setBonusGet(String bonusGet) {
        this.bonusGet.set(bonusGet);
    }

    public StringProperty bonusGetProperty() {
        return bonusGet;
    }

    public String getMoneyAdd() {
        return moneyAdd.get();
    }

    public void setMoneyAdd(String moneyAdd) {
        this.moneyAdd.set(moneyAdd);
    }

    public StringProperty moneyAddProperty() {
        return moneyAdd;
    }
}
