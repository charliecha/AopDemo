package org.charlie.aopdemo;

import android.app.Activity;
import android.os.Bundle;
import org.charlie.aop.annotation.Test;

@Test
public class TestActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
