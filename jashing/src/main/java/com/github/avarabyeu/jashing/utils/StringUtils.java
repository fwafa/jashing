package com.github.avarabyeu.jashing.utils;

import com.google.common.base.Strings;

/**
 * Set of useful stuff for working with strings
 *
 * @author avarabyeu
 */
public final class StringUtils {

    private StringUtils() {
    }

    /**
     * Returns substring before provided string
     *
     * @param str       String to be truncated
     * @param separator Separator
     * @return Null of initial string is Null, empty if provided string is empty, otherwise substring before
     */
    public static String substringBefore(final String str, final String separator) {
        if (Strings.isNullOrEmpty(str)) {
            return str;
        }
        final int pos = str.indexOf(separator);
        if (pos == -1) {
            return str;
        }
        return str.substring(0, pos);
    }
}
