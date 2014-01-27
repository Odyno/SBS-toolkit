package net.staniscia.sbs1.net;

import net.staniscia.sbs1.SBS1Observer;
import net.staniscia.sbs1.SBS1Parser;
import net.staniscia.sbs1.SBS1ParserHandler;
import net.staniscia.sbs1.parser.ParserFactory;
import net.staniscia.sbs1.util.SBS1LogObserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Simple socket client, read data from socket and to String on Console the toString of SBS Message
 */
public class SBS1SimpleSocketServices implements SBS1SocketService {

    public static final int DEFAULT_SBS1_PORT = 30003;
    private ServerSocket serverSock = null;

    private SBS1ParserHandler parserHandler;
    private Socket clientSocket;
    private SBS1Parser parser;
    private SBS1LogObserver theLogger;
    private boolean isVerbose;


    @Override
    public void register(SBS1Observer observer) {
        parser.register(observer);
    }

    @Override
    public void unRegister(SBS1Observer observer) {
        parser.unRegister(observer);
    }

    @Override
    public void setVerbose(boolean isVerbose) {
        this.isVerbose = isVerbose;
        if (parser != null) {
            if (isVerbose) {
                register(theLogger);
            } else {
                unRegister(theLogger);
            }
        }
    }

    @Override
    public void start() throws IOException {
        start(DEFAULT_SBS1_PORT, ParserFactory.getDefaultParser());
    }

    @Override
    public void start(int port, SBS1Parser theParser) throws IOException {
        serverSock = new ServerSocket(port);
        clientSocket = serverSock.accept();
        parser = theParser;
        if (isVerbose) {
            parser.register(theLogger);
        }
        parserHandler = parser.process(clientSocket.getInputStream());
    }

    @Override
    public void stop() throws IOException {
        if (!parserHandler.isDone()) {
            parserHandler.cancel();
            parser = null;
        }

        if (clientSocket != null && clientSocket.isConnected()) {
            clientSocket.close();
        }

        if (serverSock != null && !serverSock.isClosed()) {
            serverSock.close();
        }
    }


}
