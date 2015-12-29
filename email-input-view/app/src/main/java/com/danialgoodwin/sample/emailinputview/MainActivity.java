package com.danialgoodwin.sample.emailinputview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.danialgoodwin.ui.EmailInputView;

public class MainActivity extends Activity {

    private EmailInputView mEmailInputView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEmailInputView = (EmailInputView) findViewById(R.id.emailInputView);

        findViewById(R.id.submitButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEmailInputView.isValid()) {
                    showToast("Email submitted!");
                } else {
                    showToast("Email not recognized!");
                }
            }
        });
    }

    private void showToast(CharSequence message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

}
