package com.example.a080218_00.myapplication_exam;

public class StringConcatenateController {
    public static String formatString(String source) {
        source = source.replaceAll("razdel_", "Раздел ");
        source = source.replaceAll("razdel", "");
        source = source.replace("v", " - ");
        source = source.replace(".html", "");
        source = source.replace("v", "");
        source = source.replace("_", "");
        source = source.replace("/", ",");
        source = source.replace("file:,,,androidasset,", "");
        return source;
    }
}
