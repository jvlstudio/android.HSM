package br.com.ikomm.apps.HSM;

import android.net.Uri;
import android.os.Bundle;
import android.app.ActionBar;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.text.Html;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MostraConteudoActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mostra_conteudo);

		ActionBar action = getActionBar();
		action.setLogo(R.drawable.hsm_logo);

		TextView texto = (TextView) findViewById(R.id.tvMostra);

		texto.setText(Html
				.fromHtml("Voc� vai vivenciar o que h� de mais inovador no mundo do management, ingressando gratuitamente, na Mostra de Conte�dos e Solu��es."
						+ "<br/><br/>"
						+ "Um formato especialmente desenhado para proporcionar networking,apresenta��o de solu��es e oportunidades de novos neg�cios."
						+ "<br/><br/>"
						+ "Al�m de poder participar da Mostra com 50 empresas participantes, a suacredencial ainda lhe permite assistir a mais de 120 palestras gratuitas, nosn�cleos tem�ticos das Esta��es de Conhecimento (Brasil: Gest�o para oFuturo, Sustentabilidade, Brasil Design Week � Inova��o e Design, Atelierde L�deres e CBN Young Professionals) e nos 10 audit�rios patrocinados doCiclo de Palestras, aprofundando-se em temas que, acreditamos, sejam deseu total interesse."));

		addListenerButton();
	}

	private void addListenerButton() {
		findViewById(R.id.btnClick1).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(Intent.ACTION_VIEW);
				i.setData(Uri
						.parse("http://www.expositoronline.com.br/Collaboration/Mailling/Registration.aspx?ca=1338&fe=73&pr=127&co=2"));
				startActivity(i);
			}
		});

		findViewById(R.id.btnClick2).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent(MostraConteudoActivity.this,
						AuditoriosActivity.class));
			}
		});

		findViewById(R.id.btnClick3).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent(MostraConteudoActivity.this,
						ListaAudutoriosActivity.class));
			}
		});

		findViewById(R.id.btnClick4).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(Intent.ACTION_VIEW);
				i.setData(Uri
						.parse("http://agenda.expositoronline.com.br/?eventid=8"));
				startActivity(i);
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mostra_conteudo, menu);
		return false;
	}

}
