package com.softserveinc.ita.globalmetrologytests.criterias;

import org.testng.Assert;



import com.softserveinc.ita.globalmetrologytests.pages.ConfirmDialogPage;
import com.softserveinc.ita.globalmetrologytests.pages.Page;
import com.softserveinc.ita.globalmetrologytests.tools.controls
                                                .interfaces.IButton;
import com.softserveinc.ita.globalmetrologytests.tools.controls
                                                .interfaces.IDropdown;
import com.softserveinc.ita.globalmetrologytests.tools.controls
                                                .interfaces.ILabel;
import com.softserveinc.ita.globalmetrologytests.tools.controls
                                                .interfaces.ITextInput;
import com.softserveinc.ita.globalmetrologytests.tools.controls
                                                .interfaces.IValidationLabel;

/**
 * @author Dp-076 ATQC
 *         This class realizes soft assert.
 */
public final class Specification {

    /**
     * Is test at summary passed?
     * This variable contain answer.
     */
    private boolean summaryResult;

    /**
     * This variable contain failed tests report.
     */
    private StringBuilder summaryDescription;

    /**
     * Class constructor.
     */
    private Specification() {
        this.summaryResult = true;
        this.summaryDescription = new StringBuilder();
    }

    /**
     * Static method for create new Specification.
     *
     * @return new Specification.
     */
    public static Specification get() {
        return new Specification();
    }

    /**
     * Getter for summaryResult.
     *
     * @return boolean answer. Is test at summary passed?
     */
    public boolean getPassed() {
        return summaryResult;
    }

    /**
     * Getter for summaryDescription.
     *
     * @return failed tests report.
     */
    public String getDescription() {
        return summaryDescription.toString();
    }

    /**
     * This method add new log in failed tests report.
     *
     * @param pass - is current test passed?
     * @param errorText - text for error log.
     */
    public void add(final boolean pass, final String errorText) {
        summaryResult = summaryResult && pass;
        if (!pass) {
            summaryDescription.append(errorText + "\n");
        }
    }

    /**
     * Assert method for finish check test results.
     */
    public void check() {
        Assert.assertTrue(summaryResult, summaryDescription.toString());
    }

    /**
     * Fluent API method for resume test with new test criteria.
     *
     * @param label - test criteria input object.
     * @return new LabelCriteria for input object.
     */
    public LabelCriteria For(final ILabel label) {
        return LabelCriteria.get(label, this);
    }
    /**
     * Fluent API method for resume test with new test criteria.
     *
     * @param button - test criteria input object.
     * @return new ButtonCriteria for input object.
     */
    public ButtonCriteria For(final IButton button) {
        return ButtonCriteria.get(button, this);
    }

    /**
     * Fluent API method for resume test with new test criteria.
     *
     * @param validationLabel - test criteria input object.
     * @return new ValidationLabelCriteria for input object.
     */
    public ValidationLabelCriteria For(final IValidationLabel validationLabel) {
        return ValidationLabelCriteria.get(validationLabel, this);
    }

    /**
     * Fluent API method for resume test with new test criteria.
     *
     * @param textInput - test criteria input object.
     * @return new TextInputCriteria for input object.
     */
    public TextInputCriteria For(final ITextInput textInput) {
        return TextInputCriteria.get(textInput, this);
    }

    /**
     * Fluent API method for resume test with new test criteria.
     *
     * @param dropdown - test criteria input object.
     * @return new DropdownCriteria for input object.
     */
    public DropdownCriteria For(final IDropdown dropdown) {
        return DropdownCriteria.get(dropdown, this);
    }
  
    /**
     * Fluent API method for resume test with new test criteria.
     *
     * @param confirmDialogPageCriteria - test criteria input object.
     * @return new ConfirmDialogPageCriteria for input object.
     */
    public ConfirmDialogPageCriteria For(
            final ConfirmDialogPage confirmDialogPageCriteria) {
        return ConfirmDialogPageCriteria.get(confirmDialogPageCriteria, this);
    }

    /**
     * Fluent API method for resume test with new test criteria.
     *
     * @param page - test criteria input object.
     * @return new PageCriteria for input object.
     */
    public PageCriteria For(final Page page) {
        return PageCriteria.get(page, this);
    }
}
