package net.staniscia.sbs1.net;

import net.staniscia.sbs1.SBS1Observer;
import net.staniscia.sbs1.SBS1Parser;

import java.io.IOException;

/**
 * Created by staniscia on 27/01/14.
 */
public interface SBS1SocketService {
    /**
     * register a new Observer
     *
     * @param observer
     */
    void register(SBS1Observer observer);

    /**
     * Unregister a specific observer
     *
     * @param observer
     */
    void unRegister(SBS1Observer observer);

    /**
     * if true, every message is logged on Console
     *
     * @param isVerbose
     */
    void setVerbose(boolean isVerbose);

    /**
     * Start the Acquisition
     *
     * @throws java.io.IOException
     */
    void start() throws IOException;

    /**
     * Start the acquisition
     *
     * @param port
     * @param theParser
     * @throws java.io.IOException
     */
    void start(int port, SBS1Parser theParser) throws IOException;

    /**
     * Stop the acquisition
     *
     * @throws java.io.IOException
     */
    void stop() throws IOException;
}
