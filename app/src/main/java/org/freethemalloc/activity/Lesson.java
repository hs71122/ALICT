package org.freethemalloc.activity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;

import org.freethemalloc.alict.R;
import org.freethemalloc.comman.LessonLayoutGenerator;
import org.freethemalloc.lessons.Lessons;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by Harshana @freethemalloc.blogspot.com on 7/27/2015.
 */
public class Lesson extends AppCompatActivity {
    private Toolbar toolbar;
    private ScrollView contentLayout;
    private LinearLayout linearLayout;
    private ProgressBar progressBar;
    private String lesson;
    LessonLayoutGenerator layoutGenerator;
    LinkedHashMap<Integer, HashMap<Integer, String>> list;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_layout);
        toolbar = (Toolbar) findViewById(R.id.lesson_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        progressBar = (ProgressBar) findViewById(R.id.progress_spinner);
        progressBar.setVisibility(View.VISIBLE);
        contentLayout = (ScrollView) findViewById(R.id.lesson_generator_content);
        layoutGenerator = new LessonLayoutGenerator(this);
        lesson = getIntent().getStringExtra("lesson");
        new LoadData().execute();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the activity_al_ict_drawer_menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_al_ict, menu);
        return true;
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

    private void myAsyncTak() {
        contentLayout.addView(linearLayout);
    }

    class LoadData extends AsyncTask<Void, Integer, Void> {

        @Override
        protected Void doInBackground(Void... params) {
            System.out.println(lesson);
            try {
                list = (LinkedHashMap<Integer, HashMap<Integer, String>>) Lessons.class.getMethod(lesson).invoke(null);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            //list = Lessons.getLesson01();
            Lesson.this.linearLayout = layoutGenerator.generate(list);
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            myAsyncTak();
            progressBar.setVisibility(View.GONE);
        }
    }
}
