package org.freethemalloc.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import org.freethemalloc.alict.R;

import java.util.List;

/**
 * Created by Harshana @freethemalloc.blogspot.com on 7/25/2015.
 */
public class DrawerMenuAdapter extends RecyclerView.Adapter<DrawerMenuAdapter.MenuItem> {

    private List<String> menuStr;
    private Context context;
    private View.OnClickListener clickListener;

    public DrawerMenuAdapter(Context context, List<String> menuStr){
        this.menuStr = menuStr;
        this.context = context;
    }
    @Override
    public MenuItem onCreateViewHolder(ViewGroup parent, int viewType) {
        View menuView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_al_ict_drawer_menu,parent,false);
        MenuItem menuItem = new MenuItem(menuView);
        clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show();
            }
        };
        return menuItem;
    }

    @Override
    public void onBindViewHolder(MenuItem holder, int position) {

        holder.button.setText(menuStr.get(position));
        //holder.button.setBackgroundColor(Color.CYAN);
        //holder.button.setTextColor(Color.WHITE);
        holder.button.setOnClickListener(clickListener);
    }

    @Override
    public int getItemCount() {
        return menuStr.size();
    }

    public static class MenuItem extends RecyclerView.ViewHolder {

        Button button;
        public MenuItem(View itemView) {
            super(itemView);
            button = (Button) itemView.findViewById(R.id.layout_btn);
        }
    }
}
