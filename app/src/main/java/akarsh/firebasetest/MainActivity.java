package akarsh.firebasetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyFirebaseMessagingService mfs=new MyFirebaseMessagingService();
        tv=(TextView)findViewById(R.id.textView);
        tv.setText(mfs.msg);
        Toast.makeText(this.getApplicationContext(),mfs.msg,Toast.LENGTH_LONG).show();
    }
}
