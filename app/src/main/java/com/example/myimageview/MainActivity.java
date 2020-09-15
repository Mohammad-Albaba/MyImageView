package com.example.myimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView imageView;
int [] bird=new int[]{R.drawable.bird_1,R.drawable.bird_2,R.drawable.bird_3,R.drawable.bird_4,R.drawable.bird_5};
int n=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.imageview);
    }

    public void btn_back(View view) {
        imageView.setImageResource(bird[n]);
        if (n>0)
            n--;
    }

    public void btn_next(View view) {
        imageView.setImageResource(bird[n]);
        if (n<4)
            n++;
    }
}
