package more.please.want.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageButton arrayButton = (ImageButton)findViewById(R.id.arrayButton);
        arrayButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(
                        getApplicationContext(),
                        array1.class);
                startActivity(intent);
            }
        });

        ImageButton conditionButton = (ImageButton)findViewById(R.id.imageButton2);
        conditionButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(
                        getApplicationContext(),
                        condition1.class);
                startActivity(intent);
            }
        });

        ImageButton causeButton = (ImageButton)findViewById(R.id.imageButton3);
        causeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(
                        getApplicationContext(),
                        cause1.class);
                startActivity(intent);
            }
        });

        ImageButton intendButton = (ImageButton)findViewById(R.id.imageButton4);
        intendButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(
                        getApplicationContext(),
                        intend1.class);
                startActivity(intent);
            }
        });

        ImageButton cantrastButton = (ImageButton)findViewById(R.id.imageButton5);
        cantrastButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(
                        getApplicationContext(),
                        contrast1.class);
                startActivity(intent);
            }
        });

        ImageButton selectButton = (ImageButton)findViewById(R.id.imageButton6);
        selectButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(
                        getApplicationContext(),
                        select1.class);
                startActivity(intent);
            }
        });

    }
}
