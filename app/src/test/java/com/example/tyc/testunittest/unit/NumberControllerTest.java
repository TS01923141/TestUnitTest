package com.example.tyc.testunittest.unit;

import android.util.Log;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

/**
 * Created by biji on 2018/8/28.
 */
@RunWith(MockitoJUnitRunner.class)
public class NumberControllerTest {
    private static final String TAG = "NumberControllerTest";

    @Mock
    private NumberController numberController;

    @Before
    public void setUp() throws Exception {
        numberController = new NumberController();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void equal() throws Exception {
        boolean result = NumberController.equal("1", "1");
//        Log.d(TAG, "equal: result");
        System.out.println("result: " + result);
        assertTrue(result);
    }

    @Test
    public void test() throws Exception{
        boolean result = numberController.test("1", "1");
        
        System.out.println("result: " + result);
        assertTrue(result);
    }
}