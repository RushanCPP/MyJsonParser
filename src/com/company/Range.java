package com.company;

import java.util.Iterator;

public final class Range implements Iterable<Integer> {
    final int start, end, step;

    public Range(int end) {
        this(0, end, 1);
    }

    public Range(int start, int end) {
        this(start, end, 1);
    }

    public Range(int start, int end, int step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new RangeIterator();
    }

    class RangeIterator implements Iterator<Integer> {
        int current;

        public RangeIterator() {
            current = start;
        }

        @Override
        public boolean hasNext() {
            if (step > 0) {
                return current < end;
            }
            return current > end;
        }

        @Override
        public Integer next() {
            int result = current;
            current += step;
            return result;
        }
    }
}
