package com.softserveinc.ita.globalmetrologytests.pages;

import com.softserveinc.ita.globalmetrologytests.tools.controls.Button;
import com.softserveinc.ita.globalmetrologytests.tools.controls.Label;
import com.softserveinc.ita.globalmetrologytests.tools.controls.interfaces.IButton;
import com.softserveinc.ita.globalmetrologytests.tools.controls.interfaces.ILabel;

/**
 * @author Dp-076 ATQC
 * This class allows to create the confirm dialog page object.
 */
public class ConfirmDialogPage extends Page {

    /**
     * The text of the confirm dialog page.
     */
    private ILabel label;
    /**
     * The "Yes" button of the confirm dialog page.
     */
    private IButton yesButton;
    /**
     * The "No" button of the confirm dialog page.
     */
    private IButton noButton;

    /**
     * The constructor of the class.
     */
    public ConfirmDialogPage() {

        this.label = Label.getByCss(".modal-title");
        this.yesButton = Button
                .getByCss("#popup > div > div.modal-dialog.modal-md > div "
                        + "> div.modal-body.clearfix > div > button"
                        + ".btn.btn-danger.delete");
        this.noButton = Button
                .getByCss("#popup > div > div.modal-dialog.modal-md > div "
                        + "> div.modal-body.clearfix > div > button.btn"
                        + ".btn-success.cancel");

    }

    /**
     * @return the text message of this confirm dialog page.
     */
    public final String getMessage() {
        return this.label.getText();
    }

    /**
     * @return the "Yes" button of this confirm dialog page.
     */
    public final IButton getYesButton() {
        return this.yesButton;
    }


    /**
     * @return the "No" button of this confirm dialog page.
     */
    public final IButton getNoButton() {
        return this.noButton;
    }

    /**
     * @return Main page after clicking "Yes" button on this
     * confirm dialog page.
     */
    public final void clickYes() {
        this.yesButton.click();
    }
    /**
     * @return Main page after clicking "No" button on this
     * confirm dialog page.
     */
    public final void clickNo() {
        this.noButton.click();
    }
    /**
     * confirms player deleting.
     * @return new player's list page.
     */
   
}
