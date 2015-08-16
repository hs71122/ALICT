package org.freethemalloc.comman;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.CardView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import org.freethemalloc.alict.R;
import org.freethemalloc.lessons.Lesson;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generate a card view for lessons
 *
 */
public class LessonLayoutGenerator {

    //private CardView cardView; //inflated card view
    private LinearLayout container; //parent liner layout of the creating card view
    private Context context;
    /**
     * Generate a card view for lessons
     *
     * @param layout layout which is to append the created card view
     * @param context Context of the activity
     */
    public LessonLayoutGenerator(LinearLayout layout,Context context){
        this.container = layout;
        this.context = context;
    }

    private CardView getCardView(){
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        CardView cv = (CardView)inflater.inflate(R.layout.lesson_layout, container,false);
        return cv;
    }
    public void generate(LinkedHashMap map){
        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            Set valueSet = ((HashMap) entry.getValue()).entrySet();
            Iterator valueIterator = valueSet.iterator();
            while (valueIterator.hasNext()) {
                Map.Entry valueEntry = (Map.Entry) valueIterator.next();
                CardView cardView = getCardView();
                LinearLayout layout = (LinearLayout)cardView.findViewById(R.id.innerLayout);
                //cardView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                if (((int) valueEntry.getKey()) != Lesson.IMAGE) {

                    layout.addView(textViewGenerator(valueEntry.getValue().toString(), (int) valueEntry.getKey(),cardView));
                    //layout.addView(cardView);
                } else {
                    //cardView.addView();
                    layout.addView(imageViewGenerator(valueEntry.getValue().toString()));
                    //layout.addView(cardView);
                }
                container.addView(cardView);
            }
        }
    }

    private TextView textViewGenerator(String description, int size,CardView cv){
        TextView textView = new TextView(context);
        Typeface font = Typeface.createFromAsset(context.getAssets(), "iskoolaPota.ttf");
        textView.setTypeface(font);
        LinearLayout.LayoutParams lParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        int color = context.getResources().getColor(R.color.HThemePrimaryColor);
        if (size == Lesson.HEADER_LEVEL_1){
            textView.setTextColor(context.getResources().getColor(R.color.HThemeTxtColorPrimary));
            textView.setBackgroundColor(color);
            textView.setGravity(Gravity.CENTER_HORIZONTAL);
            cv.setBackgroundColor(color);
            cv.setCardElevation(10);
            lParams.setMargins(0, 0, 0, 5);
        }else if(size == Lesson.HEADER_LEVEL_2){
            textView.setTextColor(context.getResources().getColor(R.color.HThemeTxtColorPrimary));
            textView.setBackgroundColor(color);
            textView.setGravity(Gravity.CENTER_HORIZONTAL);
            cv.setBackgroundColor(color);
            cv.setCardElevation(5);
            lParams.setMargins(0, 0, 0, 5);
        }else if(size == Lesson.HEADER_LEVEL_3){
            textView.setTextColor(context.getResources().getColor(R.color.HThemeTxtColorPrimary));
            textView.setBackgroundColor(color);
            textView.setGravity(Gravity.CENTER_HORIZONTAL);
            cv.setBackgroundColor(color);
            cv.setCardElevation(2);
            lParams.setMargins(0, 0, 0, 5);
        }else if(size == Lesson.HEADER_LEVEL_4){
            textView.setTextColor(context.getResources().getColor(R.color.HThemeTxtColorPrimary));
            textView.setBackgroundColor(color);
            textView.setGravity(Gravity.CENTER_HORIZONTAL);
            cv.setBackgroundColor(color);
            lParams.setMargins(0, 0, 0, 5);
        }else if(size == Lesson.DESCRIPTION){
            textView.setTextColor(context.getResources().getColor(R.color.HThemeFontDescription));
            textView.setTypeface(textView.getTypeface(), Typeface.BOLD);
            lParams.setMargins(0, 0, 0, 5);
            textView.setPadding(5,5,5,5);
        }else if(size == Lesson.DESCRIPTION_LIST){
            textView.setTextColor(context.getResources().getColor(R.color.HThemeFontDescriptionList));
            lParams.setMargins(30, 0, 0, 5);
        }else if(size == Lesson.IMAGE_DESCRIPTION){
            textView.setTextColor(context.getResources().getColor(R.color.HThemeFontHeader_3));
            lParams.setMargins(30, 0, 30, 5);
        }
        textView.setTypeface(textView.getTypeface(), Typeface.BOLD);
        textView.setText(description);
        textView.setTextSize(size);
        textView.setLayoutParams(lParams);
        return textView;
    }

    private ImageView imageViewGenerator(String image) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(Integer.parseInt(image));
        LinearLayout.LayoutParams lParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        lParams.setMargins(0, 0, 0, 0);
        imageView.setLayoutParams(lParams);
        imageView.setAdjustViewBounds(true);
        return imageView;
    }
}
