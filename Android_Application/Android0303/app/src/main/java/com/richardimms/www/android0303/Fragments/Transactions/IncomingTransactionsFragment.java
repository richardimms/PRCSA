package com.richardimms.www.android0303.Fragments.Transactions;


import android.app.SearchManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.richardimms.www.android0303.Activities.CreateAdvert.CreateAdvertTypeActivity;
import com.richardimms.www.android0303.Activities.HomePageActivity;
import com.richardimms.www.android0303.Activities.ListAdvertsActivity;
import com.richardimms.www.android0303.Activities.LogoutActivity;
import com.richardimms.www.android0303.Activities.MemberDetailsActivity;
import com.richardimms.www.android0303.Activities.MyAdvertsActivity;
import com.richardimms.www.android0303.Activities.RulesActivity;
import com.richardimms.www.android0303.Activities.SearchAdvertsActivity;
import com.richardimms.www.android0303.CustomAdapter.CustomTransactionList;
import com.richardimms.www.android0303.DataModel.Transaction;
import com.richardimms.www.android0303.Fragments.Bids.MainNavigationBids;
import com.richardimms.www.android0303.Globals.Globals;
import com.richardimms.www.android0303.Methods.GetTransactions;
import com.richardimms.www.android0303.Methods.SetStatusBarColour;
import com.richardimms.www.android0303.R;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Richard on 08/04/2015.
 */
public class IncomingTransactionsFragment extends Fragment {
    /*Creating the variables needed for the navigation*/
    private String[] mNavigationTitle;
    private DrawerLayout mDrawerLayout;
    private CharSequence mTitle;
    private ListView mDrawerList;
    private ActionBarDrawerToggle mDrawerToggle;
    /****************************************************/

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater)
    {
        super.onCreateOptionsMenu(menu,inflater);
        inflater.inflate(R.menu.options_menu, menu);

        SetStatusBarColour.setTaskbar(getActivity().getWindow());
        SetStatusBarColour.setActionbarColour(((ActionBarActivity) getActivity()).getSupportActionBar());

        SearchManager searchManager = (SearchManager) getActivity().getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView = (SearchView) menu.findItem(R.id.search).getActionView();
        ComponentName cn = new ComponentName(getActivity(),SearchAdvertsActivity.class);

        searchView.setSearchableInfo(searchManager.getSearchableInfo(cn));

        mDrawerToggle = new ActionBarDrawerToggle(
                getActivity(),
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
        ((ActionBarActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((ActionBarActivity)getActivity()).getSupportActionBar().setHomeButtonEnabled(true);
        mDrawerToggle.syncState();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.incoming_transactions, container, false);

        /*Navigation slider variables being assigned *************************/
        mNavigationTitle = getResources().getStringArray(R.array.navigation_array);
        mDrawerLayout = (DrawerLayout) v.findViewById(R.id.drawer_layout);
        mDrawerList = (ListView)       v.findViewById(R.id.left_drawer);

        mDrawerList.setAdapter(new ArrayAdapter<String>(getActivity().getBaseContext(), R.layout.drawer_list_item
                , mNavigationTitle));
        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());
        /*********************************************************************/
        new GetIncomingTransactions().execute();
        setHasOptionsMenu(true);
        return v;
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

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);

    }


    public static IncomingTransactionsFragment newInstance() {

        IncomingTransactionsFragment f = new IncomingTransactionsFragment();
        return f;
    }

    private void BuildTransactionTable(final ArrayList<Transaction> transactions)
    {

        ListView list;
        final String[] web;
        if(transactions != null) {

            web = new String[transactions.size()];

            for (int i = 0; i < transactions.size(); i++) {
                web[i] = transactions.get(i).getReviewText();
            }

            try {
                CustomTransactionList adapter = new
                        CustomTransactionList(getActivity().getBaseContext(), web, transactions);
                View fragmentView = getView();
                if (fragmentView != null) {
                    list = (ListView) getView().findViewById(R.id.incomingTransactions);
                    list.setAdapter(adapter);
                    list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view,
                                                int position, long id) {
                            //Incoming Transactions should be able to be selected and
                            Globals globals = new Globals();
                            globals.selectedTransaction = transactions.get(position);
                            FinishTransaction fdm = new FinishTransaction();
                            fdm.show(getActivity().getFragmentManager(), "missiles");
                        }
                    });
                }
            } catch (Exception ex)
            {
                Log.i("Exepton: ", ex.getMessage());
            }
        }
    }

    private class GetIncomingTransactions extends AsyncTask<Void, Void, Boolean> {
        ArrayList<Transaction> incomingTransactions = new ArrayList<>();

        @Override
        protected Boolean doInBackground(Void... params) {
            GetTransactions getTransactions = new GetTransactions();
            try {
                incomingTransactions = getTransactions.incomingTransactions();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return true;
        }

        protected void onPostExecute(Boolean result) {
            BuildTransactionTable(incomingTransactions);
        }
    }

    private void selectItem(int position) {
        Intent intent = null;
        switch (position) {
            case 0:
                intent = new Intent(getActivity(), HomePageActivity.class);
                break;
            case 1:
                intent = new Intent(getActivity(),MemberDetailsActivity.class);
                break;
            case 2:
                intent = new Intent(getActivity(), ListAdvertsActivity.class);
                break;
            case 3:
                intent = new Intent(getActivity(), CreateAdvertTypeActivity.class);
                break;
            case 4:
                intent = new Intent(getActivity(), RulesActivity.class);
                break;
            case 5:
                intent = new Intent(getActivity(), MyAdvertsActivity.class);
                break;
            case 6:
                intent = new Intent(getActivity(), MainNavigationBids.class);
                break;
            case 7:
                intent = new Intent(getActivity(), MainNavigationTransaction.class);
                break;
            case 8:
                intent = new Intent(getActivity(), LogoutActivity.class);
                break;
            default:
                intent = new Intent(getActivity(), MemberDetailsActivity.class);
                break;


        }
        startActivity(intent);
    }

    private class DrawerItemClickListener implements ListView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView parent, View view, int position, long id) {
            selectItem(position);
        }
    }
}
