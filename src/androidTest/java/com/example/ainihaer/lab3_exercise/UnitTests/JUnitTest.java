package com.example.ainihaer.lab3_exercise.UnitTests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ainihaer.lab3_exercise.MainActivity;
import com.example.ainihaer.lab3_exercise.R;

/**
 * Created by ainihaer on 4/13/16.
 */
public class JUnitTest extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;
    public JUnitTest() {
        super(MainActivity.class);
    }

    public void testAdd(){
        mainActivity = getActivity();
        EditText editText  = (EditText)mainActivity.findViewById(R.id.editText);
        EditText editText2 = (EditText)mainActivity.findViewById(R.id.editText2);
        TextView textView  = (TextView)mainActivity.findViewById(R.id.textView);
        Button button = (Button)mainActivity.findViewById(R.id.button);
        int a = Integer.parseInt(editText.getText().toString());
        int b = Integer.parseInt(editText.getText().toString());
        int sum = a + b;
        int add = mainActivity.add(a,b);
        assertEquals(add, sum);

    }

}
