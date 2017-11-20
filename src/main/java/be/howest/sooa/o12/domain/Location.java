package be.howest.sooa.o12.domain;

import java.io.Serializable;

/**
 *
 * @author Hayk
 */
public class Location implements Serializable, Comparable<Location> {

    private static final long serialVersionUID = 1L;

    private final int x;
    private final int y;

    public Location() {
        this(0, 0);
    }

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.x;
        hash = 29 * hash + this.y;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (this.x != other.x) {
            return false;
        }
        return y == other.y;
    }

    @Override
    public int compareTo(Location other) {
        if (x > other.x) {
            return x - other.x;
        }
        return y - other.y;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("[").append(x).append("; ")
                .append(y).append("]")
                .toString();
    }
}
