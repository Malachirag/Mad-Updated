package com.example.edutech;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class Firebase extends AppCompatActivity
{
    private MediaPlayer mp;
    private MediaController mc;
    private VideoView videoView;
    private ImageView playbutton;
    private TextView currentTimer;
    private TextView durationTimer;
    private ProgressBar currentProgress;
    private ProgressBar bufferprogress;
    private Uri videouri;
    private boolean isPlaying;
    private int current=0;
    private int duration=0;
    private TextView mov_title,description;
    private ImageView inception,tenet,interstellar,titanic,dangal,sultan,chennai,three,kgf,vr,kantara,kirik;
    ConstraintLayout l;


    public void run_movie(Uri videouri,String title)
    {
        Toast.makeText(Firebase.this,"ENJOY WATCHING "+ title+"!!", Toast.LENGTH_SHORT).show();
        bufferprogress.setVisibility(View.VISIBLE);
        new VideoProgress().execute();
        mov_title.setText(title);
        videoView.setVideoURI(videouri);
        videoView.requestFocus();
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                videoView.start();
                bufferprogress.setVisibility(View.GONE);
                duration = mp.getDuration() / 1000;
                String durationstring = String.format("%02d:%02d", duration / 60, duration % 60);
                durationTimer.setText(durationstring);

            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebase);


        isPlaying = false;
        videoView = findViewById(R.id.videoView);
        playbutton = findViewById(R.id.playbtn);
        currentTimer = findViewById(R.id.currentTimer);
        durationTimer = findViewById(R.id.durationTimer);
        currentProgress = findViewById(R.id.videoProgress);
        currentProgress.setMax(100);
        bufferprogress = findViewById(R.id.progressBar3);
        inception = findViewById(R.id.inception);
        tenet = findViewById(R.id.tenet);
        interstellar = findViewById(R.id.intersteller);
        titanic = findViewById(R.id.titanic);
        dangal = findViewById(R.id.dangal);
        sultan = findViewById(R.id.sultan);
        chennai = findViewById(R.id.chennai);
        three = findViewById(R.id.three_ediots);
        kgf = findViewById(R.id.kgf);
        vr = findViewById(R.id.vr);
        kirik = findViewById(R.id.kirik_party);
        kantara = findViewById(R.id.kantara);
        mov_title = findViewById(R.id.movi_title);
        l = findViewById(R.id.l);
        l.setBackgroundColor(Color.BLACK);
        mc = new MediaController(this);


        mc.setAnchorView(videoView);
        videoView.setMediaController(mc);
        videouri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-video-streaming-a6a47.appspot.com/o/file_example_MP4_480_1_5MG.mp4?alt=media&token=e881ce97-a15b-45f5-969d-f622bed41afd");
        run_movie(videouri, "ENJOY COURSES");


        inception.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videouri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/edu-tech-77e88.appspot.com/o/CSS%20in%207%20Minutes%20%F0%9F%94%A5.mp4?alt=media&token=e58a901a-2542-4873-b716-39ac45bc6bf7");
                String mtitle = "CSS";
                run_movie(videouri, mtitle);

            }
        });

        tenet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videouri= Uri.parse("https://firebasestorage.googleapis.com/v0/b/edu-tech-77e88.appspot.com/o/CSS%20in%207%20Minutes%20%F0%9F%94%A5.mp4?alt=media&token=e58a901a-2542-4873-b716-39ac45bc6bf7");
                run_movie(videouri,"CSS");
            }
        });
        interstellar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videouri= Uri.parse("https://firebasestorage.googleapis.com/v0/b/edu-tech-77e88.appspot.com/o/CSS%20in%207%20Minutes%20%F0%9F%94%A5.mp4?alt=media&token=e58a901a-2542-4873-b716-39ac45bc6bf7");
                run_movie(videouri,"CSS");
            }
        });
        titanic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videouri= Uri.parse("https://firebasestorage.googleapis.com/v0/b/edu-tech-77e88.appspot.com/o/CSS%20in%207%20Minutes%20%F0%9F%94%A5.mp4?alt=media&token=e58a901a-2542-4873-b716-39ac45bc6bf7");
                run_movie(videouri,"CSS");
            }
        });
        dangal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videouri= Uri.parse("https://firebasestorage.googleapis.com/v0/b/edu-tech-77e88.appspot.com/o/CSS%20in%207%20Minutes%20%F0%9F%94%A5.mp4?alt=media&token=e58a901a-2542-4873-b716-39ac45bc6bf7");
                run_movie(videouri,"CSS");
            }
        });
        sultan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videouri= Uri.parse("https://firebasestorage.googleapis.com/v0/b/edu-tech-77e88.appspot.com/o/CSS%20in%207%20Minutes%20%F0%9F%94%A5.mp4?alt=media&token=e58a901a-2542-4873-b716-39ac45bc6bf7");
                run_movie(videouri,"CSS");
            }
        });
        chennai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videouri= Uri.parse("https://firebasestorage.googleapis.com/v0/b/edu-tech-77e88.appspot.com/o/L10%20Introduction%20to%20CSS%2C%20Advantages%2C%20Syntax%20of%20Cascading%20Style%20Sheets%20(CSS)%20Web%20Engineering.mp4?alt=media&token=54534956-ad96-48f7-b100-98d1dde23e07");
                run_movie(videouri,"CSS");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videouri= Uri.parse("https://firebasestorage.googleapis.com/v0/b/edu-tech-77e88.appspot.com/o/L10%20Introduction%20to%20CSS%2C%20Advantages%2C%20Syntax%20of%20Cascading%20Style%20Sheets%20(CSS)%20Web%20Engineering.mp4?alt=media&token=54534956-ad96-48f7-b100-98d1dde23e07");
                run_movie(videouri,"CSS");
            }
        });
        kgf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videouri= Uri.parse("https://firebasestorage.googleapis.com/v0/b/edu-tech-77e88.appspot.com/o/L10%20Introduction%20to%20CSS%2C%20Advantages%2C%20Syntax%20of%20Cascading%20Style%20Sheets%20(CSS)%20Web%20Engineering.mp4?alt=media&token=54534956-ad96-48f7-b100-98d1dde23e07");
                run_movie(videouri,"HTML");
            }
        });

        vr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videouri= Uri.parse("https://firebasestorage.googleapis.com/v0/b/edu-tech-77e88.appspot.com/o/L10%20Introduction%20to%20CSS%2C%20Advantages%2C%20Syntax%20of%20Cascading%20Style%20Sheets%20(CSS)%20Web%20Engineering.mp4?alt=media&token=54534956-ad96-48f7-b100-98d1dde23e07");
                run_movie(videouri,"HTML");
            }
        });
        kantara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videouri= Uri.parse("https://firebasestorage.googleapis.com/v0/b/edu-tech-77e88.appspot.com/o/L10%20Introduction%20to%20CSS%2C%20Advantages%2C%20Syntax%20of%20Cascading%20Style%20Sheets%20(CSS)%20Web%20Engineering.mp4?alt=media&token=54534956-ad96-48f7-b100-98d1dde23e07");
                run_movie(videouri,"HTML");
            }
        });
        kirik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videouri= Uri.parse("https://firebasestorage.googleapis.com/v0/b/edu-tech-77e88.appspot.com/o/L3%20Introduction%20to%20HTML%20Tags%20Basic%20Syntax%20and%20Description%20of%20HTML%20Tags%20Web%20Engineering%20Lectures.mp4?alt=media&token=1d300467-9fe1-4994-9933-4df9223f1896");
                run_movie(videouri,"HTML");
            }
        });




        isPlaying = true;
        playbutton.setImageResource(R.drawable.img);
        new VideoProgress().execute();
        playbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPlaying) {
                    videoView.pause();
                    isPlaying = false;
                    playbutton.setImageResource(R.drawable.img_1);
                } else {
                    videoView.start();
                    isPlaying = true;
                    playbutton.setImageResource(R.drawable.img);
                }
            }
        });
    }
    protected void onStop() {
        super.onStop();
        isPlaying=false;
    }

    public class VideoProgress extends AsyncTask<Void,Integer,Void>
    {

        @Override
        protected Void doInBackground(Void... voids) {
            do
            {
                if(isPlaying)
                {
                    current=videoView.getCurrentPosition()/1000;
                    try{
                        int currentPercent=current*100/duration;
                        publishProgress(currentPercent);
                    }
                    catch (Exception e)
                    {

                    }
                }

            }while(currentProgress.getProgress()<=100);
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {

            super.onProgressUpdate(values);
            try{
                int currentPercent=values[0]*100/duration;
                currentProgress.setProgress(currentPercent);
                String currentString=String.format("%02d:%02d",values[0]/60,values[0]%60);
                currentTimer.setText(currentString);}
            catch (Exception e)
            {

            }
        }
    }
    @Override
    public void onBackPressed()
    {
        Intent intent = new Intent(Firebase.this, Readable.class);
        startActivity(intent);
        finish();
    }



}