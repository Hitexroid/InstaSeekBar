package com.instaseekbar.hitexroid.hitex_instaseekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatImageView;
import android.widget.SeekBar;

import com.bq.markerseekbar.MarkerSeekBar;

/**
 * Created By Sadeq Nameni (Hitexroid)
 * 2018/05/12
 * 1397/02/22
 */
public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    private AppCompatImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MarkerSeekBar seekBar = findViewById(R.id.ui_seekbar2);
        imageView = findViewById(R.id.imageView);
        seekBar.setOnSeekBarChangeListener(this);

        imageView.setAlpha((float) seekBar.getProgress() / 100);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean userChanged) {
        if (userChanged)
            imageView.setAlpha((float) progress / 100);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}