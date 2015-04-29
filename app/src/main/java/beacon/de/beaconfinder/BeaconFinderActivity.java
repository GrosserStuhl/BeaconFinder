package beacon.de.beaconfinder;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import beacon.de.beaconfinder.util.SystemUiHider;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */
public class BeaconFinderActivity extends Activity {

    ArrayAdapter<String> listAdapter;
    Button connectNew;
    ListView listView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beacon_finder);
        init();
    }

    private void init(){
        connectNew = (Button) findViewById(R.id.bConnectNew);
        listView = (ListView) findViewById(R.id.listView);
        listAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,0);
        listView.setAdapter(listAdapter);
    }
}
