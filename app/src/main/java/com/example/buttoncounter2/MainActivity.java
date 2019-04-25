package com.example.buttoncounter2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView countText;
    private Button addButton;
    private Button subtractButton;
    private Button resetButton;
    public int countVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countText = this.findViewById(R.id.countText);
        addButton = this.findViewById(R.id.addButton);
        subtractButton = this.findViewById(R.id.subtractButton);
        resetButton = this.findViewById(R.id.resetButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countVal++;
                countText.setText(Integer.toString(countVal));
            }
        });
        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countVal--;
                countText.setText(Integer.toString(countVal));
            }
        });
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countVal = 0;
                countText.setText(Integer.toString(countVal));
            }
        });

    }
}
