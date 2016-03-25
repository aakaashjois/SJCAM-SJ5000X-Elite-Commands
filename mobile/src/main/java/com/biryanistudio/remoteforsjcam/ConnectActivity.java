package com.biryanistudio.remoteforsjcam;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import android.widget.VideoView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class ConnectActivity extends AppCompatActivity {

    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect);
        videoView = (VideoView) findViewById(R.id.video);
    }

    public void startVideo(View view)
    {
        String url = "rtsp://192.168.1.254/sjcam.mov";
        videoView.setVideoURI(Uri.parse(url));
        videoView.requestFocus();
        videoView.start();
        int height = videoView.getHeight();
        int width = videoView.getWidth();
        Log.i("SJCAM","Height = " + Integer.toString(height));
        Log.i("SJCAM","Width = " + Integer.toString(width));
    }}
