package solution.base;

import java.util.Iterator;

public class ToIterate<T> implements Iterable<T> { // ANSWER 3.1
// implements Iterable so that ToIterate can be iterated
    private final T[] internal;

    public static final <T> ToIterate<T> of(T ... ts) {
        T[] array = (T[]) new Object[ts.length];
        System.arraycopy(ts, 0, array, 0, ts.length);
        return new ToIterate(array);
    }

    private ToIterate(T[] ts) { internal = ts; }

    @Override // ANSWER 3.1
    public Iterator<T> iterator() {
        return new Iterator() {
            private int i = 0;
            @Override public boolean hasNext() { return i < internal.length; }
            @Override public T next() { return internal[i++]; }
        };
    }

}
