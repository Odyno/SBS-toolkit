package net.staniscia.sbs1.parser;

import net.staniscia.sbs1.SBS1Observer;
import net.staniscia.sbs1.msg.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by staniscia on 24/01/14.
 */
class SBS1SimpleListenerCaller implements SBS1Observer {

    private List<SBS1Observer> observers;
    private ExecutorService ex = Executors.newCachedThreadPool();

    public SBS1SimpleListenerCaller() {
        observers = Collections.synchronizedList(new ArrayList<SBS1Observer>());
    }

    public void register(SBS1Observer observer) {
        observers.add(observer);
    }

    public void unRegister(SBS1Observer observer) {
        observers.remove(observer);
    }

    public boolean isActive() {
        return ex != null;
    }

    public void doStop() {
        ex.shutdownNow();
        ex = null;
    }

    @Override
    public void update(final MSG1 message) {
        for (final SBS1Observer observer : observers) {
            ex.execute(new Runnable() {
                @Override
                public void run() {
                    observer.update(message);
                }
            });
        }
    }

    @Override
    public void update(final MSG2 message) {
        for (final SBS1Observer observer : observers) {
            ex.execute(new Runnable() {
                @Override
                public void run() {
                    observer.update(message);
                }
            });
        }
    }

    @Override
    public void update(final MSG3 message) {
        for (final SBS1Observer observer : observers) {
            ex.execute(new Runnable() {
                @Override
                public void run() {
                    observer.update(message);
                }
            });
        }
    }

    @Override
    public void update(final MSG4 message) {
        for (final SBS1Observer observer : observers) {
            ex.execute(new Runnable() {
                @Override
                public void run() {
                    observer.update(message);
                }
            });
        }
    }

    @Override
    public void update(final MSG5 message) {
        for (final SBS1Observer observer : observers) {
            ex.execute(new Runnable() {
                @Override
                public void run() {
                    observer.update(message);
                }
            });
        }
    }

    @Override
    public void update(final MSG6 message) {
        for (final SBS1Observer observer : observers) {
            ex.execute(new Runnable() {
                @Override
                public void run() {
                    observer.update(message);
                }
            });
        }
    }

    @Override
    public void update(final MSG7 message) {
        for (final SBS1Observer observer : observers) {
            ex.execute(new Runnable() {
                @Override
                public void run() {
                    observer.update(message);
                }
            });
        }
    }

    @Override
    public void update(final MSG8 message) {
        for (final SBS1Observer observer : observers) {
            ex.execute(new Runnable() {
                @Override
                public void run() {
                    observer.update(message);
                }
            });
        }
    }

    @Override
    public void update(final ID message) {
        for (final SBS1Observer observer : observers) {
            ex.execute(new Runnable() {
                @Override
                public void run() {
                    observer.update(message);
                }
            });
        }
    }

    @Override
    public void update(final SEL message) {
        for (final SBS1Observer observer : observers) {
            ex.execute(new Runnable() {
                @Override
                public void run() {
                    observer.update(message);
                }
            });
        }
    }

    @Override
    public void update(final AIR message) {
        for (final SBS1Observer observer : observers) {
            ex.execute(new Runnable() {
                @Override
                public void run() {
                    observer.update(message);
                }
            });
        }
    }

    @Override
    public void update(final STA message) {
        for (final SBS1Observer observer : observers) {
            ex.execute(new Runnable() {
                @Override
                public void run() {
                    observer.update(message);
                }
            });
        }
    }

    @Override
    public void update(final CLK message) {
        for (final SBS1Observer observer : observers) {
            ex.execute(new Runnable() {
                @Override
                public void run() {
                    observer.update(message);
                }
            });
        }
    }
}
