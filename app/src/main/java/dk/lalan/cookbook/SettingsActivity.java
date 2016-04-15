package dk.lalan.cookbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SettingsActivity extends AppCompatActivity {

    private String port, ip, url;
    EditText portText, ipText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        portText = (EditText) findViewById(R.id.portText);
        ipText = (EditText) findViewById(R.id.ipText);

    }

    public void startTheShow(View v){
        ip = ipText.getText().toString();
        port = portText.getText().toString();
        url = "http://"+ip+":"+port;
//        Toast.makeText(this, url, Toast.LENGTH_LONG).show();

        Intent i = new Intent(this, WebActivity.class);
        i.putExtra("url", url);
        startActivity(i);
    }
}
