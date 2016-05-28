package com.biryanistudio.remoteforsjcam;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import org.videolan.libvlc.media.VideoView;


public class ConnectActivity extends AppCompatActivity {

    private VideoView videoView;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect);
        videoView = (VideoView) findViewById(R.id.video);
    }

    public void startVideo(final View view)
    {
        final String url = "rtsp://192.168.1.254/sjcam.mov";
        videoView.setVideoURI(Uri.parse(url));
        videoView.start();
    }}


