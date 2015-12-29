# EmailInputView for Android

An enhanced EditText with easy ability to get valid email from user. An error message will appear for invalid emails.



## Features ##

- Keyboards will show the `@` and `.com` (depends on the user's keyboard).
- Show error message for invalid email addresses, but not when the user is in the middle of typing it!
- Convenience method `isValid()`. (Based on Android's `Patterns.EMAIL_ADDRESS`)
- Ability to override `showErrorMessage()` to change behavior.
- All other default `EditText` features, including standard Android UI.
- Minimal size library.



## Usage ##

In the app's build.gradle file, add the dependency:

    compile 'com.danialgoodwin.android:email-input-view:1.0'

In XML layout:

    <com.danialgoodwin.ui.EmailInputView
        android:id="@+id/emailInputView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />

Note: All modern Android projects should already be using jCenter. In the project's root build.gradle file, the following should already be there.

    
    buildscript {
        repositories {
            jcenter()
        }
        ...
    }



## TODO ##
Features up for grabs to get pull-request experience:

- Don't allow spaces in input.



## License ##
MIT
