package com.frank.generator.yapi.common.utils;

public class YapiPkgUtils
{
    public static String getUpperCase(String humpName)
    {
        char[] chars = humpName.toCharArray();
        if (chars[0] >= 'a' && chars[0] <= 'z') {
            chars[0] = (char)(chars[0] - 32);
        }
        return new String(chars);
    }
}
