package more.please.want.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Button;
import android.media.MediaPlayer;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class select10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select10);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.v301);
        final ImageButton imageButton14=(ImageButton)findViewById(R.id.imageButton14);
        imageButton14.setOnClickListener(new ImageButton.OnClickListener(){
            public void onClick(View v){
                mediaPlayer.start();}
        });
        ImageButton imageButton8 = (ImageButton)findViewById(R.id.imageButton8);
        final TextView textView3 = (TextView)findViewById(R.id.textView3);
        final EditText editText2 = (EditText) findViewById(R.id.editText2);
        final Button submit = findViewById(R.id.submit);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.v302);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this, R.raw.wrong);
        final Button button = findViewById(R.id.button);

        submit.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                if(editText2.getText().toString().equals("중국집에서 자장면을 시키거나 짬뽕을 시켜라.")){
                    mediaPlayer2.start();
                }
                else{
                    mediaPlayer1.start();
                    button.setBackgroundResource(R.drawable.hint);
                    Animation anim = AnimationUtils.loadAnimation
                            (getApplicationContext(),
                                    R.anim.alpha_anim);
                    button.startAnimation(anim);

                }
            }
        });

        button.setOnClickListener(new Button.OnClickListener(){
            @Override
            public  void onClick(View v) {
                textView3.setText("중국집에서 자장면을 시키거나 짬뽕을 시켜라.");
                textView3.setTextSize(30);
            }});

        ImageButton backButton = (ImageButton)findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(
                        getApplicationContext(),
                        select9.class);
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

        ImageButton nextButton = (ImageButton)findViewById(R.id.nextButton);
        nextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(
                        getApplicationContext(),
                        good3.class);
                startActivity(intent);
            }
        });

    }
}

