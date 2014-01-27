package net.staniscia.sbs1.msg;

import org.mockito.ArgumentMatcher;


/**
 * Created by staniscia on 27/01/14.
 */
public class SBS1Matcher<T> extends ArgumentMatcher<T> {
    private T match;

    public SBS1Matcher(T match) {
        this.match = match;
    }

    @Override
    public boolean matches(Object o) {
        return match.equals(o);
    }
}