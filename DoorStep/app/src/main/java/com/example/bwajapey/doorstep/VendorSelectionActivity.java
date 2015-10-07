package com.example.bwajapey.doorstep;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class VendorSelectionActivity extends ListActivity {

    ListView listV;

    String[] itemname ={
            "Happy Homes Super Market",
            "Royal Mart Super Markey",
            "Shopping City",
            "Smart",
            "M K Home Needs",
            "Pai Stores",
            "Shivanand stores",
            "More"
    };


    Integer[] imgid={
            R.drawable.happyhomes,
            R.drawable.royalmart,
            R.drawable.shoppingcity,
            R.drawable.smart,
            R.drawable.doorstep_logo,
            R.drawable.doorstep_logo,
            R.drawable.doorstep_logo,
            R.drawable.doorstep_logo,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendor_selection);

        CustomListAdapter adapter=new CustomListAdapter(this, itemname, imgid);
        listV =(ListView)findViewById(android.R.id.list);
        listV.setAdapter(adapter);

        listV.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String Slecteditem = itemname[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_vendor_selection, menu);
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
