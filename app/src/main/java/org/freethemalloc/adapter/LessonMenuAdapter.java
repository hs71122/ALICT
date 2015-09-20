package org.freethemalloc.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.balysv.materialripple.MaterialRippleLayout;

import org.freethemalloc.alict.R;
import org.freethemalloc.activity.Lesson;
import org.freethemalloc.model.MenuModel;

import java.util.List;

/**
 * Created by Harshana @freethemalloc.blogspot.com on 9/19/2015.
 */
public class LessonMenuAdapter extends RecyclerView.Adapter<LessonMenuAdapter.MenuItem>  {

    private Context context;
    private List<MenuModel> menuList;
    private View.OnClickListener clickListener;
    private Typeface font;

    public LessonMenuAdapter(Context context, List<MenuModel> menuList) {
        this.context = context;
        this.menuList = menuList;
        font = Typeface.createFromAsset(context.getAssets(), "iskoolaPota.ttf");
    }

    @Override
    public MenuItem onCreateViewHolder(final ViewGroup parent, int viewType) {
        View menuView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_al_ict_lesson_menu,parent,false);
        MenuItem menuItem = new MenuItem(menuView);
        clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Lesson.class);
                intent.putExtra("lesson", view.getTag().toString());
                context.startActivity(intent);
            }
        };
        return menuItem;
    }

    @Override
    public void onBindViewHolder(MenuItem holder, int position) {

        holder.linearLayout.setTag(menuList.get(position).getTag());
        holder.linearLayout.setOnClickListener(clickListener);
        if(menuList.get(position).getImage() != null) {
            holder.imageView.setImageResource(Integer.parseInt(menuList.get(position).getImage()));
        }else {
            holder.imageView.setImageResource(R.drawable.lesson);
        }
        holder.title.setTypeface(font);
        holder.header.setTypeface(font);
        holder.title.setText(menuList.get(position).getTitle());
        holder.header.setText(menuList.get(position).getHeader());
    }

    @Override
    public int getItemCount() {
        return menuList.size();
    }

    public static class MenuItem extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView title;
        TextView header;
        LinearLayout linearLayout;
        public MenuItem(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.sample_icon);
            title = (TextView) itemView.findViewById(R.id.title);
            header = (TextView) itemView.findViewById(R.id.header);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.innerLayout);
        }
    }
}
