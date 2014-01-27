package net.staniscia.sbs1.util;

import net.staniscia.sbs1.SBS1Observer;
import net.staniscia.sbs1.msg.*;

import java.util.logging.Logger;

/**
 * Created by staniscia on 27/01/14.
 */
public class SBS1LogObserver implements SBS1Observer {

    Logger log = Logger.getLogger(SBS1LogObserver.class.getName());

    @Override
    public void update(MSG1 message) {
        log.info(message.toString());
    }

    @Override
    public void update(MSG2 message) {
        log.info(message.toString());
    }

    @Override
    public void update(MSG3 message) {
        log.info(message.toString());
    }

    @Override
    public void update(MSG4 message) {
        log.info(message.toString());
    }

    @Override
    public void update(MSG5 message) {
        log.info(message.toString());
    }

    @Override
    public void update(MSG6 message) {
        log.info(message.toString());
    }

    @Override
    public void update(MSG7 message) {
        log.info(message.toString());
    }

    @Override
    public void update(MSG8 message) {
        log.info(message.toString());
    }

    @Override
    public void update(ID message) {
        log.info(message.toString());
    }

    @Override
    public void update(SEL message) {
        log.info(message.toString());
    }

    @Override
    public void update(AIR message) {
        log.info(message.toString());
    }

    @Override
    public void update(STA message) {
        log.info(message.toString());
    }

    @Override
    public void update(CLK message) {
        log.info(message.toString());
    }
}
