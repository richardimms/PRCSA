package com.richardimms.www.android0303.Activities;

import android.app.SearchManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.AsyncTask;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import com.richardimms.www.android0303.Activities.CreateAdvert.CreateAdvertTypeActivity;
import com.richardimms.www.android0303.CustomAdapter.CustomRuleList;
import com.richardimms.www.android0303.DataModel.Rules;
import com.richardimms.www.android0303.Fragments.Bids.MainNavigationBids;
import com.richardimms.www.android0303.Fragments.Transactions.MainNavigationTransaction;
import com.richardimms.www.android0303.Methods.GetRules;
import com.richardimms.www.android0303.Methods.SetStatusBarColour;
import com.richardimms.www.android0303.R;

import java.util.ArrayList;

public class RulesActivity extends ActionBarActivity {

    /* These initialised variables help create the sliding navigation */
    private String[] mNavigationTitle;
    private DrawerLayout mDrawerLayout;
    private CharSequence mTitle;
    private ListView mDrawerList;
    private ActionBarDrawerToggle mDrawerToggle;
    /*****************************************************************/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);

        /*Navigation slider variables being assigned *************************/
        mNavigationTitle = getResources().getStringArray(R.array.navigation_array);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);

        mDrawerList.setAdapter(new ArrayAdapter<String>(this, R.layout.drawer_list_item
                , mNavigationTitle));
        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());
        /*********************************************************************/
        /*Action Bar Toggling **********************************************************/
        mDrawerToggle = new ActionBarDrawerToggle(
                this,
                mDrawerLayout,
                R.string.hello_world,
                R.string.hello_world
        ){
            public void onDrawerClosed(View view)
            {
                super.onDrawerClosed(view);
            }

            public void onDrawerOpened(View drawerView)
            {
                super.onDrawerOpened(drawerView);
            }
        };
        mDrawerLayout.setDrawerListener(mDrawerToggle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        /********************************************************************************/

    }
    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.options_menu, menu);

        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView = (SearchView) menu.findItem(R.id.search).getActionView();
        ComponentName cn = new ComponentName(this,SearchAdvertsActivity.class);
        searchView.setSearchableInfo(searchManager.getSearchableInfo(cn));
        SetStatusBarColour.setTaskbar(this.getWindow());
        SetStatusBarColour.setActionbarColour(getSupportActionBar());

        new GetRulesTask().execute();
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

        if(mDrawerToggle.onOptionsItemSelected(item))
        {
            return true;
        }


        return super.onOptionsItemSelected(item);
    }

    private void BuildRuleTable(final ArrayList<Rules> rules) {

        ListView list;
        final String[] web = new String[rules.size()];

        for (int i = 0; i < rules.size(); i++) {
            web[i] = rules.get(i).getRule();

        }

        CustomRuleList adapter = new
                CustomRuleList(RulesActivity.this, web, rules);
        list = (ListView) findViewById(R.id.ruleList);
        list.setAdapter(adapter);
    }

    private void selectItem(int position) {
        Intent intent = null;
        /*Switch to determine which activity needs to be launched based on the selection in the
        navigation bar */
        switch (position) {
            case 0:
                intent = new Intent(this, HomePageActivity.class);
                break;
            case 1:
                intent = new Intent(this,MemberDetailsActivity.class);
                break;
            case 2:
                intent = new Intent(this, ListAdvertsActivity.class);
                break;
            case 3:
                intent = new Intent(this, CreateAdvertTypeActivity.class);
                break;
            case 4:
                intent = new Intent(this, RulesActivity.class);
                break;
            case 5:
                intent = new Intent(this, MyAdvertsActivity.class);
                break;
            case 6:
                intent = new Intent(this, MainNavigationBids.class);
                break;
            case 7:
                intent = new Intent(this, MainNavigationTransaction.class);
                break;
            case 8:
                intent = new Intent(this, LogoutActivity.class);
                break;
            default:
                intent = new Intent(this, MemberDetailsActivity.class);
                break;

            /**************************************************************************************/

        }
        startActivity(intent);
    }

    private class GetRulesTask extends AsyncTask<Void, Void, Boolean> {
        ArrayList<Rules> rulesArrayList;

        @Override
        protected Boolean doInBackground(Void... params) {
            GetRules getRules = new GetRules();
            rulesArrayList = getRules.getRules();
            return true;
        }

        protected void onPostExecute(Boolean result) {
            BuildRuleTable(rulesArrayList);
        }
    }

    private class DrawerItemClickListener implements ListView.OnItemClickListener {
        /* Handles the navigation drawer click ***********************************/
        @Override
        public void onItemClick(AdapterView parent, View view, int position, long id) {
            selectItem(position);
        }
        /*************************************************************************/
    }
}
