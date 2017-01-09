package reza.monitoringmesin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import static java.security.AccessController.getContext;
import static reza.monitoringmesin.Plant.arrayGambarPlant;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;
    private ButtonPlantAdapter buttonPlantAdapter;
    private Context context;
    private Plant plant;
    private Intent intent;
    private Bundle bundle;
    private String plantKe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        bundle = new Bundle();
        //button plant
        plant = new Plant();
        gridView = (GridView) findViewById (R.id.gvPlant);
        gridView.setAdapter(new ButtonPlantAdapter(this,plant.arrayNamaPlant,plant.arrayGambarPlant));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                plantKe = plant.arrayNamaPlant[position];
                Toast.makeText(MainActivity.this,"Tombol "+plantKe+" di klik.",Toast.LENGTH_SHORT).show();
                //transfer nilai antar activity
                intent = new Intent(getApplicationContext(),MonitoringActivity.class);
                bundle.putString("Plant", plantKe);
                intent.putExtras(bundle);
                //panggil activity baru
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
