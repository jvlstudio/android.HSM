package br.ikomm.hsm;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import br.com.ikomm.apps.HSM.R;
import br.ikomm.hsm.adapter.AgendaAdapter;

import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.app.ActionBar.TabListener;
import com.actionbarsherlock.app.SherlockFragmentActivity;

public class AgendaActivity extends SherlockFragmentActivity implements OnClickListener, TabListener {

	private ViewPager viewPager;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_agenda);
		
		ActionBar action = getActionBar();
		action.setLogo(R.drawable.hsm_logo);
		
		Activity context = this;
		viewPager = (ViewPager) findViewById(R.id.viewPagerAgenda);
		viewPager.setAdapter(new AgendaAdapter(getSupportFragmentManager()));
		
		
		final com.actionbarsherlock.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionBar.addTab(actionBar.newTab().setText("4 Novembro").setTabListener(this));
        actionBar.addTab(actionBar.newTab().setText("5 Novembro").setTabListener(this));
        actionBar.addTab(actionBar.newTab().setText("6 Novembro").setTabListener(this));
        
        viewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
              @Override
              public void onPageSelected(int position) {
                    actionBar.setSelectedNavigationItem(position);
              }
        });
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		startActivity(new Intent(this, DetalhePalestraActivity.class));
	}
	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		viewPager.setCurrentItem(tab.getPosition());
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

}
