package org.androidtpwn.lab1_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    ImageView imageView2;
    int imageIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);//reference id imageView
        imageView2 = (ImageView) findViewById(R.id.imageView2);//reference id imageView2

    }

    public void onButton1Clicked(View v) {
        changeImage();
    }//If click button, change Image.


    private void changeImage() {
        if (imageIndex == 0) { //If imageIndex is 0, only show imageView
            imageView.setVisibility(View.VISIBLE); //Visible imageView
            imageView2.setVisibility(View.INVISIBLE); //InVisible imageView2
            imageIndex = 1;//set imageIndex 1
        } else if (imageIndex == 1) {//If imageIndex is 1, only show imageView2
            imageView.setVisibility(View.INVISIBLE);//Invisible imageView
            imageView2.setVisibility(View.VISIBLE); //Visible imageView2
            imageIndex = 0;//set imageIndex 0
        }
    }
}
