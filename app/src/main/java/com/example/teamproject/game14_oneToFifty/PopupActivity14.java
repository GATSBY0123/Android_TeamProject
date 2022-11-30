package com.example.teamproject.game14_oneToFifty;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.example.teamproject.R;
import com.example.teamproject.game02_click.BtnClickGameActivity;

public class PopupActivity14 extends Activity {

    public MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //타이틀바 없애기
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_14popup);

        findViewById(R.id.btnPlay).setOnClickListener(mClick);

        //데이터 가져오기
        Intent intent = getIntent();
        String data = intent.getStringExtra("data");

    }

    //확인 버튼 클릭
    View.OnClickListener mClick = new View.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnPlay:
                    Intent ex1 = new Intent(PopupActivity14.this, OneToFiftyMainActivity.class);
                    startActivity(ex1);
                    mp.stop();
                    finish();
                    break;
            }
        }
    };

//    @Override
//    public void onBackPressed() {
//        //안드로이드 백버튼 막기
//        return;
//    }
}
