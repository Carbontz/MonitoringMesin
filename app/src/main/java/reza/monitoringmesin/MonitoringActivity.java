package reza.monitoringmesin;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class MonitoringActivity extends AppCompatActivity {

    private Bundle bundle;
    private String plantKe;
    private TextView tvPlant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monitoring);

        bundle = new Bundle();
        tvPlant = (TextView) findViewById(R.id.tvPlantKe);

        //ambil nilai plant yang dilihat dan set ke teks
        bundle = getIntent().getExtras();
        plantKe = bundle.getString("Plant");
        tvPlant.setText(plantKe);
    }

}
