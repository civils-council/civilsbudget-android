package ua.ck.civilscouncil.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import ua.ck.civilscouncil.R;
import ua.ck.civilscouncil.entities.Project;

/**
 * Created by cheb on 10/3/15.
 */
public class ProjectAdapter extends ArrayAdapter<Project>{
    private LayoutInflater inflater;

    public ProjectAdapter(Context context, int resource, List<Project> objects) {
        super(context, resource, objects);
        inflater = LayoutInflater.from(context);
    }

    //TODO ViewHolder
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = inflater.inflate(R.layout.item_project, parent, false);
        Project project = getItem(position);
        ((TextView) v.findViewById(R.id.txt_project_title)).setText(getItem(position).getTitle());
        ((TextView) v.findViewById(R.id.txt_project_likes)).setText(getItem(position).getTitle());
        return v;
    }
}
