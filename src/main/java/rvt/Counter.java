package rvt;

public class Counter {
    private int value;

    public Counter(int initialValue) {
        this.value = initialValue;
    }

    public Counter() {
        this.value = 0;
    }

    public void increase() {
        this.value++;
    }

    public int value() {
        return this.value;
    }

    public void reset() {
        this.value = 0;
    }
}
