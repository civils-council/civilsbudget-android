package ua.ck.civilscouncil.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.androidquery.AQuery;

import java.util.List;

import ua.ck.civilscouncil.R;
import ua.ck.civilscouncil.entities.Project;

/**
 * Created by cheb on 10/3/15.
 */
public class ProjectAdapter extends ArrayAdapter<Project>{
    private LayoutInflater inflater;
    private AQuery aq;

    public ProjectAdapter(Context context, int resource, List<Project> objects) {
        super(context, resource, objects);
        inflater = LayoutInflater.from(context);
        aq = new AQuery(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ViewHolder holder;

        if (row == null) {
            row = inflater.inflate(R.layout.item_project, parent, false);

            holder = new ViewHolder();
            if (row != null) {
                holder.image = (ImageView) row.findViewById(R.id.projectImage);
                holder.title = (TextView) row.findViewById(R.id.txt_project_title);
                holder.description = (TextView) row.findViewById(R.id.txt_project_description);
                holder.likes = (TextView) row.findViewById(R.id.txt_project_likes);
                row.setTag(holder);
            }
        } else {
            holder = (ViewHolder) row.getTag();
        }

        Project item = getItem(position);
        holder.title.setText(item.getTitle());
        holder.description.setText(item.getDescription());
        holder.likes.setText(String.format("%d",item.getLikes()));

        AQuery itemAq = aq.recycle(row);
        if (item.getPicture().length() > 0)
            itemAq.id(holder.image).image(item.getPicture());

        return row;
    }

    static class ViewHolder {
        ImageView image;
        TextView title;
        TextView description;
        TextView likes;
    }
}
