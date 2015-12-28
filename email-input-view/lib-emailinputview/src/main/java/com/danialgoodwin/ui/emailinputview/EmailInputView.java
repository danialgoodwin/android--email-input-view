/**
 * Created by Danial Goodwin on 2015-12-28.
 */
package com.danialgoodwin.ui.emailinputview;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.text.InputType;
import android.util.AttributeSet;
import android.widget.EditText;

/** An enhanced EditText with easy ability to get email from user. */
public class EmailInputView extends EditText {

    public EmailInputView(Context context) {
        super(context);
        initialize(context);
    }

    public EmailInputView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initialize(context);
    }

    public EmailInputView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initialize(context);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public EmailInputView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initialize(context);
    }

    private void initialize(Context context) {
        setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS);
        setHint(R.string.emailinputview_hint);
    }

}