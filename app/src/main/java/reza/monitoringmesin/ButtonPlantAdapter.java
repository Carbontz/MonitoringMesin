package reza.monitoringmesin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static java.security.AccessController.getContext;
import static reza.monitoringmesin.MainActivity.arrayGambarPlant;
import static reza.monitoringmesin.MainActivity.arrayNamaPlant;

/**
 * Created by Reza on 09/01/2017.
 */

public class ButtonPlantAdapter extends BaseAdapter {

    private Context mContext;
    private final String[] judul;
    private final int[] idGambar;

    public ButtonPlantAdapter(Context mContext, String[] judul, int[] idGambar) {
        this.mContext = mContext;
        this.judul = judul;
        this.idGambar = idGambar;
    }

    @Override
    public int getCount() {
        return judul.length;
    }

    @Override
    public Object getItem(int position) {
        return judul[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView==null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.btn_plant, null);
        }
        //inisiasi
        TextView textView = (TextView) convertView.findViewById(R.id.tvPlantTeks);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.ivPlantGambar);
        //set nilai
        textView.setText(judul[position]);
        imageView.setImageResource(idGambar[position]);
        /*} else {
            convertView = (View) convertView;
        }*/

        return convertView;
    }
}
