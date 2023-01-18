package dev.nwithan8.easypostextensions.internal;

public class Extensions {
    public static String toString(final int i) {
        return Integer.toString(i);
    }

    public static String toString(final double d) {
        return Double.toString(d);
    }

    public static String toString(final float f) {
        return Float.toString(f);
    }

    public static String toString(final long l) {
        return Long.toString(l);
    }

    public static String toString(final short s) {
        return Short.toString(s);
    }

    public static String toString(final byte b) {
        return Byte.toString(b);
    }

    public static String toString(final boolean b) {
        return Boolean.toString(b);
    }

    public static String toString(final char c) {
        return Character.toString(c);
    }

    public static int toInt(final String s) {
        return Integer.parseInt(s);
    }

    public static double toDouble(final String s) {
        return Double.parseDouble(s);
    }

    public static float toFloat(final String s) {
        return Float.parseFloat(s);
    }

    public static long toLong(final String s) {
        return Long.parseLong(s);
    }

    public static short toShort(final String s) {
        return Short.parseShort(s);
    }

    public static byte toByte(final String s) {
        return Byte.parseByte(s);
    }

    public static boolean toBoolean(final String s) {
        return Boolean.parseBoolean(s);
    }
}
