package net.staniscia.sbs1;

import java.io.InputStream;

/**
 * The parser for SBS1 ASCII FORMAT
 */
public interface SBS1Parser {

    /**
     * Register a new observer for this parser
     *
     * @param observer
     */
    void register(SBS1Observer observer);

    /**
     * UnRegister a observer for this parser
     *
     * @param observer
     */
    void unRegister(SBS1Observer observer);

    /**
     * No Block parsering of stream
     *
     * @param s
     */
    SBS1ParserHandler process(InputStream s);

    /**
     * Bloking parsering of string
     *
     * @param s
     */
    void processIt(String s);

}
