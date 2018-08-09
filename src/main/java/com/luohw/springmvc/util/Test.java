package com.luohw.springmvc.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class    Test {

    public static void main(String[] args) {
        String[] IGNORE_URL={"/dict/query","/dict/init","/favicon.ico,/img/*,/js/*,/css/*"};
        String uri="/js";

        Pattern pattern=Pattern.compile("/dict/query|/dict/init|/favicon.ico|/img/*|/js/*|/css/*|/*.js");
        Matcher matcher= pattern.matcher(uri);
        System.out.println(matcher.find());
        System.out.println(matcher.matches());
    }
}
