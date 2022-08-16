package com.dafiti.Interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webelements.MultipleSelect;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: johnsmart
 * Date: 6/06/11
 * Time: 10:25 AM
 * To change this template use File | Settings | File Templates.
 * Usado por: jessicajsi
 */
public class ListaDesplegable {

    private final WebElement listaDesplegable;
    private final Select seleccionarCampo;

    private ListaDesplegable(final WebElement listaDesplegable) {
        this.listaDesplegable = listaDesplegable;
        this.seleccionarCampo = new Select(listaDesplegable);
    }

    public static ListaDesplegable forWebElement(final WebElement webElement) {
        if (webElement instanceof WebElementFacade) {
            return new ListaDesplegable((((WebElementFacade) webElement).getElement()));
        } else {
            return new ListaDesplegable(webElement);
        }
    }

    public void select(final String visibleLabel) {
        seleccionarCampo.selectByVisibleText(visibleLabel);
    }

    public void selectByValue(final String value) {
        seleccionarCampo.selectByValue(value);
    }

    public void selectMultipleItems(final String... selectedLabels) {
        Select select = new Select(listaDesplegable);
        for (String selectedLabel : selectedLabels) {
            select.selectByVisibleText(selectedLabel);
        }
    }


    public Set<String> getSelectedOptionLabels() {
        MultipleSelect multipleSelect = new MultipleSelect(listaDesplegable);
        return multipleSelect.getSelectedOptionLabels();
    }

    public Set<String> getSelectedOptionValues() {
        MultipleSelect multipleSelect = new MultipleSelect(listaDesplegable);
        return multipleSelect.getSelectedOptionValues();
    }

    public String getSelectedValue() {
        return seleccionarCampo.getFirstSelectedOption().getAttribute("value");
    }

    public String getSelectedLabel() {
        return seleccionarCampo.getFirstSelectedOption().getText();
    }
}
