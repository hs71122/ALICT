package org.freethemalloc.comman;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.CardView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.freethemalloc.alict.R;
import org.freethemalloc.model.Lessons;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generate a list if {@link CardView} for lessons as {@link LinearLayout}
 *
 */
public class LessonLayoutGenerator {

    private LinearLayout container; //parent liner layout of the creating card view
    private Context context;

    /**
     *
     * @param context {@link Context}Context of the activity
     */
    public LessonLayoutGenerator(Context context){
        this.context = context;
        container = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParam = new LinearLayout.LayoutParams(
                                                                                LinearLayout.LayoutParams.MATCH_PARENT,
                                                                                LinearLayout.LayoutParams.WRAP_CONTENT);
        container.setLayoutParams(layoutParam);
        container.setOrientation(LinearLayout.VERTICAL);

    }

    /**
     *Generate {@link CardView} from the layout of the <b>org.freethemalloc.alict.R.layout.activity_lesson_container_layout</b>
     * @return {@link CardView}
     */
    private CardView getCardView(){
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        return (CardView)inflater.inflate(R.layout.activity_lesson_container_layout, container,false);
    }

    /**
     *Generate {@link LinearLayout} for the given {@link LinkedHashMap}.
     *This method generate {@link CardView}s for each element in the {@link LinkedHashMap}
     * and append those {@link CardView}s to a {@link LinearLayout}.
     * @param map {@link LinkedHashMap}
     * @return {@link LinearLayout}
     */
    public LinearLayout generate(LinkedHashMap map){
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
                if (((int) valueEntry.getKey()) != Lessons.IMAGE) {

                    layout.addView(textViewGenerator(valueEntry.getValue().toString(), (int) valueEntry.getKey(),cardView));
                } else {
                    layout.addView(imageViewGenerator(valueEntry.getValue().toString()));
                }
                container.addView(cardView);
            }
        }
        return this.container;
    }

    /**
     * Generate {@link TextView}s for the given text, format the text-size for the given size
     *  and also this method set appropriate background color for the given CardView.
     *  Generating {@link TextView}'s {@link Typeface} also changes to "iskoolaPota.ttf"
     * @param description {@link String} text for the generating {@link TextView}
     * @param size {@link Integer} value for the text-size of generating {@link TextView}
     * @param cardView {@link CardView} which is need to change background color - {@link android.graphics.Color}
     * @return {@link TextView}
     */
    private TextView textViewGenerator(String description, int size,CardView cardView){
        TextView textView = new TextView(context);
        Typeface font = Typeface.createFromAsset(context.getAssets(), "iskoolaPota.ttf");
        textView.setTypeface(font);
        LinearLayout.LayoutParams lParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        int color = context.getResources().getColor(R.color.HThemePrimaryColor);
        if (size == Lessons.HEADER_LEVEL_1){
            textView.setTextColor(context.getResources().getColor(R.color.HThemeTxtColorPrimary));
            textView.setBackgroundColor(color);
            textView.setGravity(Gravity.CENTER_HORIZONTAL);
            cardView.setCardBackgroundColor(color);
            cardView.setCardElevation(10);
            lParams.setMargins(0, 0, 0, 5);
        }else if(size == Lessons.HEADER_LEVEL_2){
            textView.setTextColor(context.getResources().getColor(R.color.HThemeTxtColorPrimary));
            textView.setBackgroundColor(color);
            textView.setGravity(Gravity.CENTER_HORIZONTAL);
            cardView.setCardBackgroundColor(color);
            cardView.setCardElevation(5);
            lParams.setMargins(0, 0, 0, 5);
        }else if(size == Lessons.HEADER_LEVEL_3){
            textView.setTextColor(context.getResources().getColor(R.color.HThemeTxtColorPrimary));
            textView.setBackgroundColor(color);
            textView.setGravity(Gravity.CENTER_HORIZONTAL);
            cardView.setCardBackgroundColor(color);
            cardView.setCardElevation(2);
            lParams.setMargins(0, 0, 0, 5);
        }else if(size == Lessons.HEADER_LEVEL_4){
            textView.setTextColor(context.getResources().getColor(R.color.HThemeTxtColorPrimary));
            textView.setBackgroundColor(color);
            textView.setGravity(Gravity.CENTER_HORIZONTAL);
            cardView.setCardBackgroundColor(color);
            lParams.setMargins(0, 0, 0, 5);
        }else if(size == Lessons.DESCRIPTION){
            textView.setTextColor(context.getResources().getColor(R.color.HThemeFontDescription));
            textView.setTypeface(textView.getTypeface(), Typeface.BOLD);
            lParams.setMargins(0, 0, 0, 5);
            textView.setPadding(5,5,5,5);
        }else if(size == Lessons.DESCRIPTION_LIST){
            textView.setTextColor(context.getResources().getColor(R.color.HThemeFontDescriptionList));
            lParams.setMargins(30, 0, 0, 5);
        }else if(size == Lessons.IMAGE_DESCRIPTION){
            textView.setTextColor(context.getResources().getColor(R.color.HThemeFontHeader_3));
            lParams.setMargins(30, 0, 30, 5);
        }
        textView.setTypeface(textView.getTypeface(), Typeface.BOLD);
        textView.setText(description);
        textView.setTextSize(size);
        textView.setLayoutParams(lParams);
        return textView;
    }

    /**
     * Generate {@link ImageView}for the given image ID
     * @param image {@link String} String representation of image's {@link Integer} ID
     * @return {@link ImageView}
     */
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
