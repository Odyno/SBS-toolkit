package net.staniscia.sbs1;

/**
 * Parser Handler
 */
public interface SBS1ParserHandler {
    /**
     * Returns true if this task is completed. Completion may be due to normal termination, an exception, or cancellation -- in all of these cases, this method will return true.
     *
     * @return boolean
     */
    boolean isDone();

    /**
     * Attempts to cancel execution of this task.
     */
    public void cancel();
}
