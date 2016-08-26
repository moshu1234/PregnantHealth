package com.pregnant.health.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.pregnant.health.GloableParams;
import com.pregnant.health.MainActivity;
import com.pregnant.health.R;
import com.pregnant.health.bean.User;
import com.pregnant.health.utils.JSONUtils;
import com.pregnant.health.utils.SPUtils;

/**
 * Created by cws on 2016/7/19.
 */
public class WelcomeActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_welcome);

        initData();
    }

    private void initData() {
        ImageView mWelcomeImg = (ImageView) findViewById(R.id.iv_welcome);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.splash);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
//                startActivity(new Intent(WelcomeActivity.this, MainActivity.class));

                String user = (String) SPUtils.get("user", "");
                if (!TextUtils.isEmpty(user)) {
                    GloableParams.user = JSONUtils.string2Bean2(user, User.class);
                    if (GloableParams.user == null) {
                        startActivity(new Intent(WelcomeActivity.this, LoginActivity.class));
                    } else {
                        startActivity(new Intent(WelcomeActivity.this, MainActivity.class));
                    }
                } else {
                    startActivity(new Intent(WelcomeActivity.this, LoginActivity.class));
                }
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        mWelcomeImg.startAnimation(animation);
    }
}
