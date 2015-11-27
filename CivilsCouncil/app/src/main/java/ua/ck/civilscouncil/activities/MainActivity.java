package ua.ck.civilscouncil.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;

import com.androidquery.AQuery;
import com.androidquery.callback.AjaxCallback;
import com.androidquery.callback.AjaxStatus;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import ua.ck.civilscouncil.R;
import ua.ck.civilscouncil.adapters.ProjectAdapter;
import ua.ck.civilscouncil.entities.Project;
import ua.ck.civilscouncil.utils.Const;


/**
 * Created by cheb on 10/3/15.
 */
public class MainActivity extends Activity {
    AQuery aq;

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aq = new AQuery(this);

        listView = (ListView)findViewById(R.id.list_view);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, ProjectDetailsActivity.class);
                Project selectedProject = (Project) listView.getAdapter().getItem(position);
                intent.putExtra("id", selectedProject.getId());
                startActivity(intent);
            }
        });

        getProjectList();
    }

    private void getProjectList() {
        aq.ajax(Const.getProjectsURL(), JSONObject.class, new AjaxCallback<JSONObject>() {
            @Override
            public void callback(String url, JSONObject object, AjaxStatus status) {
                super.callback(url, object, status);
                try {
                    ArrayList<Project> projects = new ArrayList<>();
                    if (object.has("projects")) {
                        JSONArray jsonArray = object.getJSONArray("projects");
                        for (int i = 0; i < jsonArray.length(); i++) {
                            JSONObject json = jsonArray.getJSONObject(i);
                            Project project = new Project(json);
                            projects.add(project);
                        }
                        listView.setAdapter(new ProjectAdapter(MainActivity.this, R.layout.item_project, projects));
                    }
                } catch (Exception ex) {

                }
            }
        });
    }
}