package org.freethemalloc.alict;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.freethemalloc.comman.C;


/**
 * A simple {@link Fragment} subclass.
 */
public class NavigationDrawerFragment extends Fragment {

    private static final String PREF_KEY = "user_learned_drawer";
    private ActionBarDrawerToggle drawerToggle;
    private DrawerLayout drawerLayout;
    private boolean mUserLearnedDrawer;
    private boolean mFromSavedInstence;
    private View containerFragment;
    public NavigationDrawerFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mUserLearnedDrawer = Boolean.valueOf(readFromSharedPreferences(getActivity(),PREF_KEY,"false"));
        if(savedInstanceState != null){
            mFromSavedInstence = true;
        }else{
            mFromSavedInstence = false;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_navigation_drawer, container, false);
    }


    public void setup(int fragmentId,DrawerLayout drawer, Toolbar toolbar) {
        this.drawerLayout = drawer;
        this.containerFragment = getActivity().findViewById(fragmentId);
        drawerToggle = new ActionBarDrawerToggle(getActivity(),this.drawerLayout,R.string.drawer_open,R.string.drawer_close){
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                if (!mUserLearnedDrawer){
                    mUserLearnedDrawer = true;
                    saveToSharedPreferences(getActivity(),PREF_KEY,mUserLearnedDrawer+"");
                }
                getActivity().invalidateOptionsMenu();
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                getActivity().invalidateOptionsMenu();
            }
        };
        if (!mUserLearnedDrawer && !mFromSavedInstence){
            drawerLayout.openDrawer(this.containerFragment);
        }
        drawerLayout.setDrawerListener(drawerToggle);
        drawerLayout.post(new Runnable() {
            @Override
            public void run() {
                drawerToggle.syncState();
            }
        });
    }

    public static void  saveToSharedPreferences(Context context,String preferenceName,String preferenceValue ){
        SharedPreferences preferences = context.getSharedPreferences(C.DRAWER_FILE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(preferenceName,preferenceValue);
        editor.apply();
    }
    public static String  readFromSharedPreferences(Context context,String preferenceName,String preferenceValue ){
        SharedPreferences preferences = context.getSharedPreferences(C.DRAWER_FILE_NAME, Context.MODE_PRIVATE);
        return preferences.getString(preferenceName,preferenceValue);
    }
}
