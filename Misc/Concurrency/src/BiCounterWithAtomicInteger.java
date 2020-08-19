package Misc.Concurrency.src;

import java.util.concurrent.atomic.AtomicInteger;

public class BiCounterWithAtomicInteger {
    
    private AtomicInteger i = new AtomicInteger();
    private AtomicInteger j = new AtomicInteger();
    
    synchronized public void incrementI() {
        i.incrementAndGet();
    }

    public AtomicInteger getI() {
        return i;
    }

    synchronized public void incrementJ() {
        j.incrementAndGet();
    }

    public AtomicInteger getJ() {
        return j;
    }
    
}