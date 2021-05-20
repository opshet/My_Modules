package sg.edu.rp.c346.id20010021.my_modules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ap extends AppCompatActivity {

    TextView textView2;
    Button Returns;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ap);

        textView2=findViewById(R.id.textView2);
        Returns=findViewById(R.id.Returns);


        Intent a= getIntent();
        String value= a.getStringExtra("value");
        String valueb= a.getStringExtra("valueb");
        String valuec= a.getStringExtra("valuec");
        String valued= a.getStringExtra("valued");
        String valuee= a.getStringExtra("valuee");
        String valuef= a.getStringExtra("valuef");
        textView2.setText("Module code: "+value+ "\n Module name: "+
                valueb+ "\n Academic Year: "+
                valuec+ "\n Semester: "+
                valued+ "\n Module Credit: "+
                valuee+ "\n Venue: "+valuef );


        Returns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }
}






