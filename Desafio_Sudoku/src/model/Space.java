package model;

public class Space {
    private final int expected;
    private final boolean fixed;
    private Integer actual;

    public Space(int expected, boolean fixed) {
        this.expected = expected;
        this.fixed = fixed;
        this.actual = fixed ? expected : null;
    }

    public Integer getActual() {
        return actual;
    }

    public void setActual(Integer actual) {
        if (!fixed) {
            this.actual = actual;
        }
    }

    public boolean isFixed() {
        return fixed;
    }

    public int getExpected() {
        return expected;
    }
}
