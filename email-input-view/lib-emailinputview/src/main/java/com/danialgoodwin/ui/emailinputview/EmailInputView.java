/**
 * Created by Danial Goodwin on 2015-12-28.
 */
package com.danialgoodwin.ui.emailinputview;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.text.InputType;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Patterns;
import android.widget.EditText;

/** An enhanced EditText with easy ability to get valid email from user. An error message will
 * appear for invalid errors. */
public class EmailInputView extends EditText {

    public EmailInputView(Context context) {
        super(context);
        initialize();
    }

    public EmailInputView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initialize();
    }

    public EmailInputView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initialize();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public EmailInputView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initialize();
    }

    @Override
    protected void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect) {
        super.onFocusChanged(focused, direction, previouslyFocusedRect);
        if (!focused) { validateEmail(); }
    }

    @Override
    public void onEditorAction(int actionCode) {
        super.onEditorAction(actionCode);
        validateEmail();
    }

    public boolean isValid() {
        return isValidEmail(getText());
    }

    public boolean isValidEmail(CharSequence email) {
        return !TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    private void initialize() {
        setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS);
        setHint(R.string.emailinputview_hint);
    }

    protected void showErrorMessage() {
        setError(getContext().getString(R.string.emailinputview_invalid_error));
    }

    private void validateEmail() {
        if (getText().length() != 0 && !isValidEmail(getText())) {
            showErrorMessage();
        }
    }

}