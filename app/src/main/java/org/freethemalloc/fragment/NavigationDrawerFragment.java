package org.freethemalloc.fragment;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.freethemalloc.adapter.DrawerMenuAdapter;
import org.freethemalloc.alict.R;
import org.freethemalloc.comman.DividerItemDecoration;
import org.freethemalloc.model.MenuModel;

import java.util.ArrayList;
import java.util.List;

public class NavigationDrawerFragment extends Fragment {


    public static final String PREF_FILE_NAME = "ictPref";
    public static final String KEY_USER_LEARNED_DRAWER ="user_learned_drawer";
    private ActionBarDrawerToggle mDrawerToggle;
    private  DrawerLayout mDrawerLayout;
    private boolean mUserLearnDrawer,mFromSavedInstanceState;
    private View viewContainer;

    public NavigationDrawerFragment() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mUserLearnDrawer = Boolean.valueOf(readFromPreferences(getActivity(),KEY_USER_LEARNED_DRAWER,"false"));
        if(savedInstanceState != null){
            mFromSavedInstanceState = true;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_al_ict_fragment_navigation_drawer, container, false);
        RecyclerView drawerRecyclerView = (RecyclerView)view.findViewById(R.id.rv);
        setUpDrawerRecyclerView(drawerRecyclerView);
        return view;
    }

    /**
     * Set up the fragment
     * @param drawerFragment Fragment ID
     * @param drawerLayout Drawer layout
     * @param toolbar Toolbar
     */
    public void setUp(int drawerFragment, DrawerLayout drawerLayout, Toolbar toolbar) {
        viewContainer = getActivity().findViewById(drawerFragment);
        mDrawerLayout = drawerLayout;
        mDrawerToggle = new ActionBarDrawerToggle(getActivity(),drawerLayout,toolbar,R.string.drawer_open,R.string.drawer_close){
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                if(!mUserLearnDrawer){
                    mUserLearnDrawer = true;
                    saveToPreferences(getActivity(),KEY_USER_LEARNED_DRAWER,mUserLearnDrawer+"");
                }
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
        };
        if(!mUserLearnDrawer && !mFromSavedInstanceState){
            mDrawerLayout.openDrawer(viewContainer);
        }
        mDrawerLayout.setDrawerListener(mDrawerToggle);
        mDrawerLayout.post(new Runnable() {
            @Override
            public void run() {
                mDrawerToggle.syncState();
            }
        });
    }

    /**
     * setup the drawer menu
     * @param drawerRecyclerView Recycler view
     */
    private void setUpDrawerRecyclerView(RecyclerView drawerRecyclerView) {
        drawerRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), R.drawable.divider));
        drawerRecyclerView.setHasFixedSize(true);
        drawerRecyclerView.setItemAnimator(new DefaultItemAnimator());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        drawerRecyclerView.setLayoutManager(layoutManager);
        DrawerMenuAdapter adapter = new DrawerMenuAdapter(getActivity(), getDrawerMenuList());
        drawerRecyclerView.setAdapter(adapter);
    }

    private List<MenuModel> getDrawerMenuList(){

        List<MenuModel> list = new ArrayList<>();
        list.add(new MenuModel("ICT පාඩම් මාලාව","ICT Lessons","",  String.valueOf(R.drawable.lesson)));
        list.add(new MenuModel("Python පාඩම් මාලාව", "Python Lessons", "", String.valueOf(R.drawable.python_logo)));
        list.add(new MenuModel("Database පාඩම් මාලාව", "Database Lessons", "", String.valueOf(R.drawable.icon_database)));
        return list;
    }

    /**
     * Save drawer state to shredPreference
     * @param context Context
     * @param preferenceName Name of the preference
     * @param preferenceValue Value of the preference
     */
    public void saveToPreferences(Context context, String preferenceName, String preferenceValue){
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_FILE_NAME,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(preferenceName,preferenceValue);
        editor.apply();
    }

    /**
     *
     * @param context Context
     * @param preferenceName Name of the preference
     * @param defaultValue default value, if the finding preference name is not found
     * @return preference value
     */
    public String readFromPreferences(Context context, String preferenceName, String defaultValue){
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_FILE_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString(preferenceName,defaultValue);
    }
}
