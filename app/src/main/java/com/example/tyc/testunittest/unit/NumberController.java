package com.example.tyc.testunittest.unit;

import java.util.Objects;

/**
 * Created by biji on 2018/8/28.
 */

public class NumberController {

    public static Boolean equal(String s1, String s2){
        return Objects.equals(s1,s2);
    }

    public Boolean test(String s1, String s2){
        return equal(s1, s2);
    }
}
