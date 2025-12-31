package com.example.walkietalkie;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: 初始化 WebRTC PeerConnectionFactory 和 AudioTrack
        // 自动接听 + 纯音频
    }
}
