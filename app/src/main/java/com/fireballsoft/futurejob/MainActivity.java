package com.fireballsoft.futurejob;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity {

    private EditText editName;
    private RadioGroup rg;
    private RadioButton rb;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName = findViewById(R.id.editName);
        btnSubmit = findViewById(R.id.btnSubmit);
        rg = (RadioGroup)findViewById(R.id.radioGroup1);
        rb = (RadioButton) findViewById(rg.getCheckedRadioButtonId());
        btnSubmit.setOnClickListener(onClick_submit);
    }

    private View.OnClickListener onClick_submit = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (editName.getText() == null || editName.getText().length() == 0) {
                Toast.makeText(MainActivity.this, "Input your name", Toast.LENGTH_SHORT).show();
                return;
            }

            Intent intent = new Intent(MainActivity.this, ResultActivity.class);
            intent.putExtra("name", editName.getText().toString());
            intent.putExtra("major", rb.getText().toString());
            startActivity(intent);
        }
    };
}
