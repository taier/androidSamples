package irina.com.android_samples;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

import irina.com.android_samples.gallery.GalleryGridActivity;
import irina.com.android_samples.gallery.GalleryListActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        changeBackgroundColor();
    }

    private void changeBackgroundColor() {
        RelativeLayout mainLayout = findViewById(R.id.main_layout);
        if (mainLayout == null) {
            return;
        }
        Random rnd = new Random();
        mainLayout.setBackgroundColor(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
    }

    @Override
    protected void onPause() {
        super.onPause();

        RelativeLayout layout = findViewById(R.id.main_layout);
        if (layout == null) {
            return;
        }
        layout.setBackgroundColor(Color.CYAN);
    }

    public void openGallery(View view) { //TODO: change
        RadioButton gridViewButton = findViewById(R.id.gridViewRadioButton);
        Intent intent;
        if (gridViewButton.isChecked()) {
            intent = new Intent(MainActivity.this, GalleryGridActivity.class);
        } else {
            intent = new Intent(MainActivity.this, GalleryListActivity.class);
        }
        startActivity(intent);
    }

    public void openLoginActivity(View view) {
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    public void openRegistrationActivity(View view) {
        Intent intent = new Intent(MainActivity.this, RegistrationActivity.class);
        startActivity(intent);
    }

    public void onButtonClick(View view) {
        TextView textViewName = findViewById(R.id.main_text_view);
        if (textViewName == null) {
            return;
        }
        textViewName.setText("ASDF");

        RelativeLayout layout = findViewById(R.id.main_layout);
        if (layout == null) {
            return;
        }
        layout.setBackgroundColor(Color.CYAN);

        //go to login page
//        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
//        startActivity(intent);
    }

}
