package com.softserveinc.ita.globalmetrologytests.tools.controls.interfaces;
/**
 * This interface is a layer between controls level and higher levels.
 *
 * @author Dp-076 ATQC
 */
public interface ILabel {
    /**
     * Wrapper for the WebElement method "isDisplayed".
     *
     * @return true, if displayed or false if not
     */
    boolean isDisplayed();
    /**
     * Wrapper for the WebElement method "getText()".
     *
     * @return text
     */
    String getText();
    /**
     * @return true, if is present.
     */
    boolean isPresent();
}
