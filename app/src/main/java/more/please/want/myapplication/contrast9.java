package more.please.want.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Button;
import android.media.MediaPlayer;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class contrast9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contrast9);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.v191);
        final ImageButton imageButton14=(ImageButton)findViewById(R.id.imageButton14);
        imageButton14.setOnClickListener(new ImageButton.OnClickListener(){
            public void onClick(View v){
                mediaPlayer.start();}
            protected void onStop(){
                mediaPlayer.release();
            }
        });
        ImageButton imageButton8 = (ImageButton)findViewById(R.id.imageButton8);
        final TextView textView = (TextView)findViewById(R.id.textView);
        final TextView textView2 = (TextView)findViewById(R.id.textView2);
        final TextView textView4 = (TextView)findViewById(R.id.textView4);
        final EditText textView5 = (EditText) findViewById(R.id.textView5);
        final Button button = findViewById(R.id.submit);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.v192);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this, R.raw.wrong);
        final Button button5 = findViewById(R.id.button5);
        final ImageButton nextButton = (ImageButton)findViewById(R.id.nextButton);
        imageButton8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textView.setText(" 나는 밥을");
                textView.setTextSize(40);
                textView2.setText("양치질을 안 했다.");
                textView2.setTextSize(40);

            }
        });

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                if(textView5.getText().toString().equals("먹었지만")){
                    mediaPlayer2.start();
                    nextButton.setImageResource(R.drawable.next);}

                else{
                    mediaPlayer1.start();
                    button5.setBackgroundResource(R.drawable.hint);
                    Animation anim = AnimationUtils.loadAnimation
                            (getApplicationContext(),
                                    R.anim.alpha_anim);
                    button5.startAnimation(anim);

                }
            }
        });

        button5.setOnClickListener(new Button.OnClickListener(){
            @Override
            public  void onClick(View v){
                textView4.setText("먹었지만");
                textView4.setTextSize(20);

            }
        });


        ImageButton backButton = (ImageButton)findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(
                        getApplicationContext(),
                        contrast8.class);
                startActivity(intent);
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
                        contrast10.class);
                startActivity(intent);
            }
        });
    }
}
