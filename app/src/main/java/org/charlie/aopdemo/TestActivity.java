package org.charlie.aopdemo;

import android.app.Activity;
import android.os.Bundle;
import org.charlie.aop.HelloWorld;
import org.charlie.aopannotation.Test;

@Test
public class TestActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
