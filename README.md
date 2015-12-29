# EmailInputView for Android

An enhanced EditText with easy ability to get valid email from user. An error message will appear for invalid emails.



## Features ##

- Keyboards will show the `@` and `.com` (depends on the user's keyboard).
- Show error message for invalid email addresses, but not when the user is in the middle of typing it!
- Convenience method `isValid()`. (Based on Android's `Patterns.EMAIL_ADDRESS`)
- Ability to override `showErrorMessage()` to change behavior.
- All other default `EditText` features, including standard Android UI.



## Usage ##

In XML layout:

    <com.danialgoodwin.ui.EmailInputView
        android:id="@+id/emailInputView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />



## TODO ##
Features up for grabs to get pull-request experience:

- Don't allow spaces in input.



## License ##
MIT
