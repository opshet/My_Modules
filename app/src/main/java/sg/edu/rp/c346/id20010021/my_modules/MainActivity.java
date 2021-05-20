package sg.edu.rp.c346.id20010021.my_modules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Android;
    TextView Forensics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Android=findViewById(R.id.Android);
        Forensics=findViewById(R.id.Forensics);

        Android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a= new Intent(MainActivity.this,
                        ap.class);
                a.putExtra("value", "C346");
                a.putExtra("valueb", "Android Programming");
                a.putExtra("valuec", "2020");
                a.putExtra("valued", "1");
                a.putExtra("valuee", "4");
                a.putExtra("valuef", "E62E");
                startActivity(a);

            }
        });

        Forensics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a= new Intent(MainActivity.this,
                        ap.class);
                a.putExtra("value", "C331");
                a.putExtra("valueb", "Digital Security and Forensics");
                a.putExtra("valuec", "2020");
                a.putExtra("valued", "1");
                a.putExtra("valuee", "4");
                a.putExtra("valuef", "E61J");
                startActivity(a);

            }
        });

    }

}