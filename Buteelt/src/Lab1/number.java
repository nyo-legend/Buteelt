package Lab1;

public abstract class number implements java.io.Serializable {
    
    public abstract int intValue();

    public static int floatValueToInt(float value) {
        return Math.round(value);
    }

}

