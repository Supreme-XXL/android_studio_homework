package com.xxl.smart_home_super.homework;

import static com.xxl.smart_home_super.util.RoundRectImageView.getRoundBitmapByShader;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import com.xxl.smart_home_super.R;

public class WeichatActivity extends AppCompatActivity {

    private ImageView iv_head_001;
    private ImageView iv_head_002;
    private ImageView iv_head_005;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weichat);
        myinit();
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.dragon);
        Bitmap outBitmap =getRoundBitmapByShader(bitmap, 500,500,40, 0);
        iv_head_001.setImageBitmap(outBitmap);

        Bitmap bitmap01 = BitmapFactory.decodeResource(getResources(), R.drawable.dragon01);
        Bitmap outBitmap01 =getRoundBitmapByShader(bitmap01, 500,500,40, 0);
        iv_head_002.setImageBitmap(outBitmap01);

        Bitmap bitmap02 = BitmapFactory.decodeResource(getResources(), R.drawable.frog);
        Bitmap outBitmap02 =getRoundBitmapByShader(bitmap02, 500,500,40, 0);
        iv_head_005.setImageBitmap(outBitmap02);
    }

    private void myinit() {
        iv_head_001 =findViewById(R.id.iv_head_001);
        iv_head_002 =findViewById(R.id.iv_head_002);
        iv_head_005 =findViewById(R.id.iv_head_005);
    }
}