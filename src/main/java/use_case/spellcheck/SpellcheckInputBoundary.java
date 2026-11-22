package use_case.spellcheck;

/**
 * Input boundary for spellcheck action.
 */

public interface SpellcheckInputBoundary {

    /**
     * Executes the spellchecking use case.
     * @param inputData the input data to be checked
     */
    void execute(SpellcheckInputData inputData);
}
