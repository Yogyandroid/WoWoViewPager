package com.nightonke.wowoviewpagerexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.wowo_translation_animation).setOnClickListener(this);
        findViewById(R.id.wowo_scale_animation).setOnClickListener(this);
        findViewById(R.id.wowo_alpha_animation).setOnClickListener(this);
        findViewById(R.id.wowo_drawable_color_animation).setOnClickListener(this);
        findViewById(R.id.wowo_textview_color_animation).setOnClickListener(this);
        findViewById(R.id.wowo_background_color_animation).setOnClickListener(this);
        findViewById(R.id.wowo_layer_list_color_animation).setOnClickListener(this);
        findViewById(R.id.wowo_state_list_color_animation).setOnClickListener(this);
        findViewById(R.id.wowo_rotation_animation).setOnClickListener(this);
        findViewById(R.id.wowo_path_animation).setOnClickListener(this);
        findViewById(R.id.app_intro_example).setOnClickListener(this);
        findViewById(R.id.cv_example).setOnClickListener(this);
        findViewById(R.id.wowo_textview_textsize_animation).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, SetEaseTypeActivity.class);
        switch (v.getId()) {
            case R.id.wowo_translation_animation:
                intent.putExtra("AnimationType", "WoWoTranslationAnimation");
                break;
            case R.id.wowo_scale_animation:
                intent.putExtra("AnimationType", "WoWoScaleAnimation");
                break;
            case R.id.wowo_alpha_animation:
                intent.putExtra("AnimationType", "WoWoAlphaAnimation");
                break;
            case R.id.wowo_drawable_color_animation:
                intent.putExtra("AnimationType", "WoWoShapeColorAnimation");
                break;
            case R.id.wowo_textview_color_animation:
                intent.putExtra("AnimationType", "WoWoTextViewColorAnimation");
                break;
            case R.id.wowo_background_color_animation:
                intent.putExtra("AnimationType", "WoWoBackgroundColorAnimation");
                break;
            case R.id.wowo_layer_list_color_animation:
                intent.putExtra("AnimationType", "WoWoLayerListColorAnimation");
                break;
            case R.id.wowo_state_list_color_animation:
                intent.putExtra("AnimationType", "WoWoStateListColorAnimation");
                break;
            case R.id.wowo_rotation_animation:
                intent.putExtra("AnimationType", "WoWoRotationAnimation");
                break;
            case R.id.wowo_path_animation:
                intent.putExtra("AnimationType", "WoWoPathAnimation");
                break;
            case R.id.wowo_textview_textsize_animation:
                intent.putExtra("AnimationType", "WoWoTextViewTextSizeAnimation");
                break;
            case R.id.app_intro_example:
                startActivity(new Intent(this, AppIntroExampleActivity.class));
                return;
            case R.id.cv_example:
                startActivity(new Intent(this, CVExampleActivity.class));
                return;
        }
        startActivity(intent);
    }
}
