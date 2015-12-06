package com.richardimms.www.android0303.Activities;

import android.app.SearchManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import com.richardimms.www.android0303.DataModel.Advert;
import com.richardimms.www.android0303.Activities.CreateAdvert.CreateAdvertTypeActivity;
import com.richardimms.www.android0303.Fragments.Bids.MainNavigationBids;
import com.richardimms.www.android0303.Fragments.Transactions.MainNavigationTransaction;
import com.richardimms.www.android0303.Globals.Globals;
import com.richardimms.www.android0303.Fragments.Bids.RespondToAdvertDialog;
import com.richardimms.www.android0303.Methods.SetStatusBarColour;
import com.richardimms.www.android0303.R;


public class AdvertDetailsActivity extends ActionBarActivity {

    /* These initialised variables help create the sliding navigation */
    private String[] mNavigationTitle;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private ActionBarDrawerToggle mDrawerToggle;
    /******************************************************************/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advert_details);

        /* This creates the navigation bar ********************************************/
        mNavigationTitle = getResources().getStringArray(R.array.navigation_array);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);

        mDrawerList.setAdapter(new ArrayAdapter<String>(this, R.layout.drawer_list_item
                , mNavigationTitle));
        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());
        /*******************************************************************************/
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
        getMenuInflater().inflate(R.menu.options_menu, menu);
        /*Search components *****************************************************************/
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView = (SearchView) menu.findItem(R.id.search).getActionView();
        ComponentName cn = new ComponentName(this,SearchAdvertsActivity.class);
        searchView.setSearchableInfo(searchManager.getSearchableInfo(cn));
        /**************************************************************************************/
        //Inflate the menu; this adds items to the action bar if it is present.
        Advert selectedAdvert = Globals.selectedAdvert;

        /*Assign the text fields with the advert details ********************************/
        TextView advertTitle = (TextView) findViewById(R.id.txtAdvertTitle);
        advertTitle.setText(selectedAdvert.getTitle());

        TextView advertDescription = (TextView) findViewById(R.id.txtDescripton);
        advertDescription.setText(selectedAdvert.getDescription());

        TextView advertCategory = (TextView) findViewById(R.id.txtAdvertCategory);
        advertCategory.setText(selectedAdvert.getCategory());

        TextView advertItemType = (TextView) findViewById(R.id.txtItemType);
        advertItemType.setText(selectedAdvert.getItem_type());

        TextView advertType = (TextView) findViewById(R.id.txtAdvertType);
        advertType.setText(selectedAdvert.getAdvert_type());

        TextView advertTransport = (TextView) findViewById(R.id.txtTransport);
        advertTransport.setText(selectedAdvert.getTransport().toString());

        ImageView imageView = (ImageView) findViewById(R.id.imgAdvert);
        imageView.setImageBitmap(selectedAdvert.getAdvertImage());

        TextView advertCost = (TextView) findViewById(R.id.txtAdvertCost);
        advertCost.setText(String.valueOf(selectedAdvert.getCost()));

        /*********************************************************************************/
        /*Button to make an bid *******************************************************/
        Button btnMake = (Button) findViewById(R.id.btnMakeOffer);
        btnMake.setVisibility(View.GONE);
        //Check if the selected advert has
        if(!Globals.selectedAdvert.getMember_id().equals(Globals.member.getId()))
        {
            btnMake.setVisibility(View.VISIBLE);
            btnMake.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    RespondToAdvertDialog fdm = new RespondToAdvertDialog();
                    fdm.show(getFragmentManager(), "Dialog");

                }
            });
        }

        /********************************************************************************/
        /*Set Status bar color **********************************************************/
        SetStatusBarColour.setTaskbar(this.getWindow());
        SetStatusBarColour.setActionbarColour(getSupportActionBar());
        /********************************************************************************/
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

    /***Swaps classes in the main content view*****************************************************/
    private void selectItem(int position) {
            Intent intent = null;
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
            }
            startActivity(intent);
        }
    /**********************************************************************************************/
    private class DrawerItemClickListener implements ListView.OnItemClickListener {
        /* Handles the navigation drawer click ****************************************************/
        @Override
        public void onItemClick(AdapterView parent, View view, int position, long id) {
            selectItem(position);
        }
    /***********************************************************************************************/
    }
}
