package br.ikomm.hsm.adapter;

import br.ikomm.hsm.fragment.Data1Fragment;
import br.ikomm.hsm.fragment.Data2Fragment;
import br.ikomm.hsm.fragment.Data3Fragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;



public class AgendaAdapter extends FragmentPagerAdapter {

	public AgendaAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}
	@Override
	public Fragment getItem(int position) {
		
		switch (position) {
		case 0:
			return new Data1Fragment();
		case 1:
			return new Data2Fragment();
		default:
			return new Data3Fragment();
		}
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 3;
	}

}
