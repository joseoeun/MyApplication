package more.please.want.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageButton;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.media.MediaPlayer;

public class array3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array3);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.v31);
        final ImageButton imageButton14=(ImageButton)findViewById(R.id.imageButton14);
        imageButton14.setOnClickListener(new ImageButton.OnClickListener(){
            public void onClick(View v){
                mediaPlayer.start();
            }
            protected void onStop(){
                mediaPlayer.release();
            }

        });



        ImageButton backButton = (ImageButton)findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(
                        getApplicationContext(),
                        array2.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton8 = (ImageButton)findViewById(R.id.imageButton8);
        final ImageView imageView7 = (ImageView)findViewById(R.id.imageView7);
        final ImageButton imageButton11 = (ImageButton)findViewById(R.id.imageButton11);
        final ImageButton imageButton12 = (ImageButton)findViewById(R.id.imageButton12);
        final ImageButton imageButton13 = (ImageButton)findViewById(R.id.imageButton13);
        imageButton8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                imageView7.setImageResource(R.drawable.t3);
                imageButton11.setImageResource(R.drawable.t3a);
                imageButton12.setImageResource(R.drawable.t3b);
                imageButton13.setImageResource(R.drawable.t3c);
                Animation anim = AnimationUtils.loadAnimation
                        (getApplicationContext(),
                                R.anim.alpha_anim);
                imageView7.startAnimation(anim);
                imageButton11.startAnimation(anim);
                imageButton12.startAnimation(anim);
                imageButton13.startAnimation(anim);
            }
        });

        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this, R.raw.wrong);
        imageButton12.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public  void onClick(View v){
                mediaPlayer1.start();

            }
        });

        final ImageButton nextButton = (ImageButton)findViewById(R.id.nextButton);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.v32);
        imageButton11.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View v){
                mediaPlayer2.start();
                nextButton.setImageResource(R.drawable.next);
            }
        });

        imageButton13.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View v){
                mediaPlayer1.start();
            }
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

        nextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(
                        getApplicationContext(),
                        array4.class);
                startActivity(intent);
            }
        });
    }
}
