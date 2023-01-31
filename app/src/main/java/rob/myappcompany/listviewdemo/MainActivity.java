package rob.myappcompany.listviewdemo;

import static java.util.Arrays.asList;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView friendListView = findViewById(R.id.myListView);

        final ArrayList<String> myFriendList = new ArrayList<String>(asList("Ryuuiti", "Okka", "Masaru"));

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myFriendList);

        friendListView.setAdapter(arrayAdapter);


        friendListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),  "Hello " + myFriendList.get(i), Toast.LENGTH_SHORT).show();
            }

        });
    }
}
