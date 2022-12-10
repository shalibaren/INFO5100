package Final_Project;

import java.util.*;

public class Tile {

    private final ColorSetting cs;
    private final static HashMap<Integer, Tile> cache = new HashMap<>();

    public final static Tile ZERO = new Tile(ColorSetting._0);
    public final static Tile TWO = new Tile(ColorSetting._2);
    public final static Tile FOUR = new Tile(ColorSetting._4);

    // commonly used numbers/values, 0, 2, and 4 are put in the cache
    static {
        for (ColorSetting n : ColorSetting.values()) {
            switch (n) {
            case _0:
                cache.put(n.value(), ZERO);
                break;
            case _2:
                cache.put(n.value(), TWO);
                break;
            case _4:
                cache.put(n.value(), FOUR);
                break;
            default:
                cache.put(n.value(), new Tile(n));
                break;
            }
        }
    }
    
    // constructor
    public Tile(ColorSetting n) {
        cs = n;
    }
    
    ColorSetting value() {
        return cs;
    }
    
    public static Tile valueOf(int num) {
        return cache.get(num);
    }
    
    public Tile getDouble() {
        return valueOf(cs.value() << 1);
    }
    
    boolean empty() {
        return cs == ColorSetting._0;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Tile))
            return false;
        Tile other = (Tile) obj;
        if (cs != other.cs)
            return false;
        return true;
    }

    // randomTile to determine a 4 or a 2 when a tile spawns
    static Tile randomTile() {
        return Math.random() < 0.15 ? FOUR : TWO;
    }   
    
    public String toString() {
        return String.format("%1$4d", cs.value());
        
    }
}
