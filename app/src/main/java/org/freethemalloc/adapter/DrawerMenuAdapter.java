package org.freethemalloc.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.freethemalloc.alict.R;
import org.freethemalloc.model.MenuModel;

import java.util.List;

/**
 * Created by Harshana @freethemalloc.blogspot.com on 7/25/2015.
 */
public class DrawerMenuAdapter extends RecyclerView.Adapter<DrawerMenuAdapter.MenuItem> {

    private final Typeface font;
    private List<MenuModel> menuList;
    private Context context;
    private View.OnClickListener clickListener;

    public DrawerMenuAdapter(Context context, List<MenuModel> menuStr){
        this.menuList = menuStr;
        this.context = context;
        font = Typeface.createFromAsset(context.getAssets(), "iskoolaPota.ttf");
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

        holder.title.setTypeface(font);
        holder.header.setTypeface(font);
        holder.header.setText(menuList.get(position).getHeader());
        holder.title.setText(menuList.get(position).getTitle());
        holder.imageView.setImageResource(Integer.parseInt(menuList.get(position).getImage()));
        holder.linearLayout.setOnClickListener(clickListener);
    }

    @Override
    public int getItemCount() {
        return menuList.size();
    }

    public static class MenuItem extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView header;
        TextView title;
        LinearLayout linearLayout;
        public MenuItem(View itemView) {
            super(itemView);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.menu);
            header = (TextView) itemView.findViewById(R.id.header);
            title = (TextView) itemView.findViewById(R.id.title);
            imageView = (ImageView)itemView.findViewById(R.id.icon);
        }
    }
}
