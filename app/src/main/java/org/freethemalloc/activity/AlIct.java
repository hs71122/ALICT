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

import org.freethemalloc.adapter.LessonMenuAdapter;
import org.freethemalloc.alict.R;
import org.freethemalloc.fragment.NavigationDrawerFragment;
import org.freethemalloc.model.Lessons;
import org.freethemalloc.model.MenuModel;

import java.util.List;


public class AlIct extends AppCompatActivity {

    private Toolbar toolbar;
    RecyclerView lessonRecyclerView;
    LinearLayout linearLayout;
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_ict_layout);
        initialize();
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        NavigationDrawerFragment drawerFragment;
        drawerFragment = (NavigationDrawerFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        drawerFragment.setUp(R.id.fragment_navigation_drawer, drawerLayout, toolbar);
        setUpLessonRecyclerView();
    }

    /**
     * setup the drawer menu
     */
    private void setUpLessonRecyclerView() {
        LinearLayoutManager lessonMenuLayoutManager = new LinearLayoutManager(this);
        lessonRecyclerView.setLayoutManager(lessonMenuLayoutManager);
        List<MenuModel> menuModelList = Lessons.getLessonList();
        LessonMenuAdapter lessonMenuAdapter = new LessonMenuAdapter(this,menuModelList);
        lessonRecyclerView.setAdapter(lessonMenuAdapter);
    }

    /**
     * initialize the variable from the layout
     */
    private void initialize() {
        toolbar = (Toolbar)findViewById(R.id.app_bar);
        linearLayout = (LinearLayout)findViewById(R.id.mainCont);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        lessonRecyclerView = (RecyclerView)findViewById(R.id.rvLessonMenu);
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
