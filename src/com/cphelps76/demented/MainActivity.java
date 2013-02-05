package com.cphelps76.demented;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final String ACTION_SET_THEME = "com.anddoes.launcher.SET_THEME";
        final String EXTRA_PACKAGE_NAME = "com.anddoes.launcher.THEME_PACKAGE_NAME";

        Intent intent = new Intent(ACTION_SET_THEME);
        intent.putExtra(EXTRA_PACKAGE_NAME, getPackageName());
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
        Toast.makeText(this, "Apex Launcher is not installed!", Toast.LENGTH_SHORT).show();
        }
        finish();
    }

}
