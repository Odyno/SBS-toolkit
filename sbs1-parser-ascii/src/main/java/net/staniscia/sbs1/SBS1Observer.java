package net.staniscia.sbs1;


import net.staniscia.sbs1.msg.*;

/**
 * The Message Observer.
 */
public interface SBS1Observer {

    /**
     * Invocated for every instance of SBS message
     *
     * @param message
     */
    void update(MSG1 message);

    void update(MSG2 message);

    void update(MSG3 message);

    void update(MSG4 message);

    void update(MSG5 message);

    void update(MSG6 message);

    void update(MSG7 message);

    void update(MSG8 message);

    void update(ID message);

    void update(SEL message);

    void update(AIR message);

    void update(STA message);

    void update(CLK message);

}
