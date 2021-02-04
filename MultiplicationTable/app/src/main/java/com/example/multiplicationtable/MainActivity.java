package com.example.multiplicationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity  implements View.OnClickListener

{
    EditText editText;
    Button button;
    TextView result;
    int ans=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // by ID we can use each component
        // whose id is assigned in the XML file

        editText = (EditText)findViewById(R.id.editText);
        button = (Button)findViewById(R.id.button);
        result = (TextView)findViewById(R.id.textView);

        // set clickListener on button
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.button:
                StringBuffer buffer =new StringBuffer();
                int res;

                // Get the input number from the editText
                String fs = editText.getText().toString();

                // Convert it to integer
                int n = Integer.parseInt(fs);

                // Build the logic for the table
                for (int i=1; i<=15; i++){
                    ans=(i*n);
                    buffer.append(n + " X "+ i + " = "+ ans + "\n\n");
                }

                // Set the buffer testView
                result.setText(buffer);
                break;
        }
    }
}