package more.please.want.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.View;
import android.widget.ImageButton;
import android.media.MediaPlayer;

public class intend2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intend2);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.v521);
        final ImageButton imageButton14=(ImageButton)findViewById(R.id.imageButton14);
        imageButton14.setOnClickListener(new ImageButton.OnClickListener(){
            public void onClick(View v){
                mediaPlayer.start();}
            protected void onStop(){
                mediaPlayer.release();
            }
        });


        ImageButton imageButton8 = (ImageButton)findViewById(R.id.imageButton8);
        final ImageButton imageButton = (ImageButton)findViewById(R.id.imageButton);
        final ImageButton imageButton9 = (ImageButton)findViewById(R.id.imageButton9);
        final ImageButton imageButton10 = (ImageButton)findViewById(R.id.imageButton10);
        imageButton8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                imageButton.setImageResource(R.drawable.q521);
                imageButton9.setImageResource(R.drawable.q522);
                imageButton10.setImageResource(R.drawable.q523);
                Animation anim = AnimationUtils.loadAnimation
                        (getApplicationContext(),
                                R.anim.alpha_anim);
                imageButton.startAnimation(anim);
                imageButton9.startAnimation(anim);
                imageButton10.startAnimation(anim);
            }
        });

        ImageButton backButton = (ImageButton)findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(
                        getApplicationContext(),
                        intend1.class);
                startActivity(intent);
            }
        });

        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this, R.raw.wrong);
        imageButton9.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public  void onClick(View v){
                mediaPlayer1.start();

            }
        });

        final ImageButton nextButton = (ImageButton)findViewById(R.id.nextButton);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.v522);
        imageButton.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View v){
                mediaPlayer2.start();
                nextButton.setImageResource(R.drawable.next);
            }
        });

        imageButton10.setOnClickListener(new ImageButton.OnClickListener(){
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
                        intend3.class);
                startActivity(intent);
            }
        });
    }
}
