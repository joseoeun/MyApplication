package more.please.want.myapplication;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton okayButton = (ImageButton)findViewById(R.id.startButton);
        okayButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(
                        getApplicationContext(),
                        Main2Activity.class);
                startActivity(intent);
            }
        });

        ImageButton exitButton = (ImageButton)findViewById(R.id.exitButton);
        exitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setMessage("정말 끝내시겠습니까?");
                dialog.setTitle("종료 알림창")
                        .setCancelable(false)
                        .setPositiveButton("네", new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                finish();
                            }
                        })
                        .setNegativeButton("아니오", new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = dialog.create();
                alert.setTitle("종료 알림창");
                alert.show();
            }
        });

    }
}
