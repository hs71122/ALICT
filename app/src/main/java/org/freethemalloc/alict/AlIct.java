package org.freethemalloc.alict;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import org.freethemalloc.comman.LessonGenerator;

import java.util.ArrayList;
import java.util.List;


public class AlIct extends AppCompatActivity {

    private Toolbar toolbar;
    RecyclerView rv ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_ict);
        toolbar = (Toolbar)findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setHomeButtonEnabled(true);
        NavigationDrawerFragment drawerFragment = (NavigationDrawerFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        drawerFragment.setup(R.id.fragment_navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout), toolbar);

        List<String> list = new ArrayList<String>();
        list.add("Lesson");
        list.add("Python Console");
        list.add("Database");
        list.add("Lesson");
        list.add("Lesson");
        rv = (RecyclerView)findViewById(R.id.rv);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        MenuAdapter adapter = new MenuAdapter(this,list);
        rv.setAdapter(adapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_al_ict, menu);
        return true;
    }

    public void showCards(View view){
        startActivity(new Intent(this,LessonGenerator.class));
    }
    public void read(View view){
      /*  AssetManager assetManager = getAssets();

        InputStream in = null;
        try
        {
            in = assetManager.open("example.xml");
            LessonLayout lessonLayout = new LessonLayout(this,in);
            in.close();
        } catch (Exception e)
        {
            Log.e("tag", e.getMessage());
        }*/
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
