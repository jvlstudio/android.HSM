package br.ikomm.hsm.adapter;

import br.com.ikomm.apps.HSM.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class PalestranteAdapter extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.adapter_palestrante);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.palestrante_adapter, menu);
		return true;
	}

}
