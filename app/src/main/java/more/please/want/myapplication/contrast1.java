package more.please.want.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.media.MediaPlayer;

public class contrast1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contrast1);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.v111);
        final ImageButton imageButton14=(ImageButton)findViewById(R.id.imageButton14);
        imageButton14.setOnClickListener(new ImageButton.OnClickListener(){
            public void onClick(View v){
                mediaPlayer.start();}
            protected void onStop(){
                mediaPlayer.release();
            }
        });

        ImageButton imageButton8 = (ImageButton)findViewById(R.id.imageButton8);
        final ImageView imageView6 = (ImageView)findViewById(R.id.imageView6);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this, R.raw.v112);
        imageButton8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View v){
                imageView6.setImageResource(R.drawable.t11);
                Animation anim = AnimationUtils.loadAnimation
                        (getApplicationContext(),
                                R.anim.alpha_anim);
                imageView6.startAnimation(anim);
                mediaPlayer1.start();}
        });



        ImageButton toselectButton = (ImageButton)findViewById(R.id.toselectButton);
        toselectButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(
                        getApplicationContext(),
                        Main2Activity.class);
                startActivity(intent);
            }
        });

        ImageButton okayButton = (ImageButton)findViewById(R.id.okayButton);
        okayButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(
                        getApplicationContext(),
                        contrast2.class);
                startActivity(intent);
            }
        });
    }
}
