package org.freethemalloc.comman;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.freethemalloc.alict.R;
import org.freethemalloc.lessons.Lesson;

import android.widget.LinearLayout.LayoutParams;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Harshana on 7/27/2015.
 */
public class LessonGenerator extends AppCompatActivity {
    private Toolbar toolbar;
    private LinearLayout contentLayout;
    private LayoutParams lparams;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        toolbar = (Toolbar)findViewById(R.id.lesson_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setHomeButtonEnabled(true);
        lparams = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
        contentLayout = (LinearLayout)findViewById(R.id.lesson_generator_content);
        addViews(Lesson.getLesson01());
    }

    private void addViews(LinkedHashMap map){
        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        Map.Entry entry = (Map.Entry)iterator.next();
        Set valueSet = ((HashMap)entry.getValue()).entrySet();
        Iterator valueIterator = valueSet.iterator();
        while(valueIterator.hasNext()){
            Map.Entry valueEntry = (Map.Entry)valueIterator.next();
            contentLayout.addView(textViewGenerator(valueEntry.getValue().toString(), (int) valueEntry.getKey()));//need to modify
        }
    }

    private TextView textViewGenerator(String description, int size){
        TextView textView = new TextView(this);
        Typeface font = Typeface.createFromAsset(getAssets(), "iskoolaPota.ttf");
        textView.setTypeface(font);
        if (size == Lesson.HEADER_LEVEL_1){
            textView.setTextColor(getResources().getColor(R.color.HThemeTxtColorPrimary));
            textView.setBackgroundColor(getResources().getColor(R.color.HThemeFontHeader_1));
        }else if(size == Lesson.HEADER_LEVEL_2){
            textView.setTextColor(getResources().getColor(R.color.HThemeTxtColorPrimary));
            textView.setBackgroundColor(getResources().getColor(R.color.HThemeFontHeader_2));
        }else if(size == Lesson.HEADER_LEVEL_3){
            textView.setTextColor(getResources().getColor(R.color.HThemeTxtColorPrimary));
            textView.setBackgroundColor(getResources().getColor(R.color.HThemeFontHeader_3));
        }else if(size == Lesson.HEADER_LEVEL_4){
            textView.setTextColor(getResources().getColor(R.color.HThemeTxtColorPrimary));
            textView.setBackgroundColor(getResources().getColor(R.color.HThemeFontHeader_4));
        }else if(size == Lesson.DESCRIPTION){
            textView.setTextColor(getResources().getColor(R.color.HThemeFontDescription));
            textView.setTypeface(textView.getTypeface(), Typeface.BOLD);
        }
        lparams.setMargins(0,0,0,5);
        //textView.setText(description);
        textView.setTextSize(size);

        textView.setLayoutParams(lparams);
        return textView;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
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
}
