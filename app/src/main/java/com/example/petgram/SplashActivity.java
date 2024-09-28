package com.example.petgram;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    private ImageView splashLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash); // Đảm bảo rằng bạn đang sử dụng đúng layout

        // Khởi tạo ImageView
        splashLogo = findViewById(R.id.splashLogo);

        // Kiểm tra xem splashLogo có null hay không
        if (splashLogo != null) {
            // Áp dụng hiệu ứng animation
            Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
            splashLogo.startAnimation(fadeIn);
        }

        // Chuyển sang MainActivity sau 3 giây
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000); // 3 giây
    }
}
