package main.webapp.utils;

public final class IdentityUtil {

    private static long INITIAL_VALUE = 1L;

    private IdentityUtil() {}

    public static long getId() {return INITIAL_VALUE++;}
}
