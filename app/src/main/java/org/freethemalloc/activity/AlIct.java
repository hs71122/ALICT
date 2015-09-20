package org.freethemalloc.activity;

import android.support.v4.widget.DrawerLayout;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

import org.freethemalloc.adapter.DrawerMenuAdapter;
import org.freethemalloc.adapter.LessonMenuAdapter;
import org.freethemalloc.alict.R;
import org.freethemalloc.fragment.NavigationDrawerFragment;
import org.freethemalloc.lessons.Lessons;
import org.freethemalloc.model.MenuModel;

import java.util.ArrayList;
import java.util.List;


public class AlIct extends AppCompatActivity {

    private Toolbar toolbar;
    RecyclerView rv ;
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_ict_layout);
        toolbar = (Toolbar)findViewById(R.id.app_bar);
        linearLayout = (LinearLayout)findViewById(R.id.mainCont);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        NavigationDrawerFragment drawerFragment = (NavigationDrawerFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        drawerFragment.setup(R.id.fragment_navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout), toolbar);

        rv = (RecyclerView)findViewById(R.id.rv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(layoutManager);
        DrawerMenuAdapter adapter = new DrawerMenuAdapter(this,makeDrawerMenu());
        rv.setAdapter(adapter);

        RecyclerView rvLessonMenu = (RecyclerView)findViewById(R.id.rvLessonMenu);
        LinearLayoutManager lessonMenuLayoutManager = new LinearLayoutManager(this);
        rvLessonMenu.setLayoutManager(lessonMenuLayoutManager);
        List<MenuModel> menuModelList = Lessons.getLessonList();
        LessonMenuAdapter lessonMenuAdapter = new LessonMenuAdapter(this,menuModelList);
        rvLessonMenu.setAdapter(lessonMenuAdapter);
    }

    private List<MenuModel> makeDrawerMenu(){

        List<MenuModel> list = new ArrayList<>();
        list.add(new MenuModel("ICT පාඩම් මාලාව","ICT Lessons","",  String.valueOf(R.drawable.lesson)));
        list.add(new MenuModel("Python පාඩම් මාලාව","Python Lessons","",  String.valueOf(R.drawable.python_logo)));
        list.add(new MenuModel("Database පාඩම් මාලාව","Database Lessons","",  String.valueOf(R.drawable.icon_database)));
        return list;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_al_ict, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
