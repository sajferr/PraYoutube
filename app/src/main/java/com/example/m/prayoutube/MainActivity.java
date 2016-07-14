package com.example.m.prayoutube;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MainActivity extends AppCompatActivity {
    private String Apis="AIzaSyAkEJnWVRL1Ava_z9NITwQcdMivDo0rDC4";
    YouTubePlayerView yt ;
    YouTubePlayer.OnInitializedListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yt=(YouTubePlayerView)findViewById(R.id.viewYT);
        Button button = (Button)findViewById(R.id.button);
        listener=new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

            youTubePlayer.setFullscreen(true);
                youTubePlayer.loadVideo("https://www.youtube.com/watch?v=3LiubyYpEUk&list=PLshdtb5UWjSp0879mLeCsDQN6L73XBZTk&index=84");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yt.initialize(Apis,listener);
            }
        });
    }
}
