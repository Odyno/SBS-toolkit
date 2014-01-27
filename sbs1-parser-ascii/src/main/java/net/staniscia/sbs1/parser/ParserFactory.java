package net.staniscia.sbs1.parser;

import net.staniscia.sbs1.SBS1Parser;

/**
 * Created by staniscia on 23/01/14.
 */
public class ParserFactory {

    public static final SBS1Parser getDefaultParser() {
        return new SBS1SimpleScannerParser();
    }
}
