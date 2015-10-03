package ua.ck.civilscouncil.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import ua.ck.civilscouncil.R;
import ua.ck.civilscouncil.adapters.ProjectAdapter;
import ua.ck.civilscouncil.entities.Project;


/**
 * Created by cheb on 10/3/15.
 */
public class MainActivity extends Activity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Project> projects = new ArrayList<>();
        projects.add(new Project(1, "test", "descr","source", "url", "2015-10-03T09:11:04+00:00",3,"Alex"));
        projects.add(new Project(2, "test", "descr","source", "url", "2015-10-03T09:11:04+00:00",3,"Alex"));
        projects.add(new Project(3, "test", "descr","source", "url", "2015-10-03T09:11:04+00:00",3,"Alex"));
        projects.add(new Project(4, "test", "descr","source", "url", "2015-10-03T09:11:04+00:00",3,"Alex"));

        listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(new ProjectAdapter(MainActivity.this, R.layout.item_project, projects));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, ProjectDetailsActivity.class);
                startActivity(intent);
            }
        });
    }
}
