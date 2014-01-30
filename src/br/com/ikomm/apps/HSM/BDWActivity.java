package br.com.ikomm.apps.HSM;

import android.os.Bundle;
import android.app.ActionBar;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ScrollView;
import android.widget.TextView;

public class BDWActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bdw);

		ActionBar action = getActionBar();
		action.setLogo(R.drawable.hsm_logo);

		TextView bdw = (TextView) findViewById(R.id.bdw);
		bdw.setText(Html
				.fromHtml("O design brasileiro vive seu momento de maior express�o e relev�ncia. Muita coisa aconteceu ao longo dos �ltimos anos. O n�mero de escolas e cursos aumentou significativamente, centenas de escrit�rios se desenvolveram, profissionais talentosos foram exportados para organiza��es de todo o mundo e uma infinidade de pr�mios internacionais foram conquistados. Todo esse processo � resultado do amadurecimento de uma atividade que h� mais de quatro d�cadas vem construindo um espa�o relevante na economia brasileira e agora busca ir al�m: hoje, o design brasileiro prop�e-se a ser um agente de transforma��o da nossa ind�stria, se apresentando como a grande ferramenta para gerar inova��o e inserir o Brasil na economia �criativa�, em �mbito mundial."
						+ "<br/> <br/>"
						+ "Neste contexto, a ABEDESIGN � Associa��o Brasileira de Empresas de Design, entidade que representa o setor, em parceria com a Apex-Brasil, entendeu este como o momento oportuno para promover a Brasil Design Week, um grande evento destinado a consolidar e estabelecer um novo marco para o design brasileiro, e inspirar empres�rios e gestores a utiliz�-lo como ferramenta estrat�gica de neg�cios."
						+ "<br/> <br/>"
						+ "Em sua 6� edi��o, a Brasil Design Week reafirma a parceria exclusiva com a HSM, realizadora da Expo Management, garantindo assim a inser��o do maior evento de design do Brasil na maior agenda de neg�cios da Am�rica Latina."
						+ "<br/> <br/>"
						+ "Mais que uma promo��o, este evento � um movimento intenso, com o objetivo de integrar empresas, �rg�os governamentais e institui��es de apoio ao design, para que juntos possamos construir um Brasil melhor, mais competitivo e cada vez mais inovador."
						+ "<br/> <br/>"
						+ "A sexta edi��o da Brasil Design Week � realizada em um espa�o de 400m2 dentro da HSM ExpoManagement, o maior evento de gest�o da Am�rica Latina, que recebe mais de 15 mil visitantes."));

		bdw.setMovementMethod(new ScrollingMovementMethod());
		
		ScrollView scrollView = (ScrollView) findViewById(R.id.scroll);
		
		scrollView.setOnTouchListener(new View.OnTouchListener() {
			@Override
            public boolean onTouch(View v, MotionEvent event) {
                findViewById(R.id.bdw).getParent().requestDisallowInterceptTouchEvent(false);
                return false;
            }
        });
		bdw.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
               v.getParent().requestDisallowInterceptTouchEvent(true);
               return false;
			}
        });
		
		addListenerButton();
	}

	private void addListenerButton() {
		// TODO Auto-generated method stub
		findViewById(R.id.btnAgendaBDW).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						startActivity(new Intent(BDWActivity.this,
								BDWAgendaActivity.class));
					}
				});

		findViewById(R.id.btnMaisInformacoes).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						startActivity(new Intent(BDWActivity.this,
								BDWMaisInformacoesActivity.class));
					}
				});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.bdw, menu);
		return false;
	}

}
