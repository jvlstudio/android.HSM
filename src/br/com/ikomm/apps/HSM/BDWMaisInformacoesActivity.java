package br.com.ikomm.apps.HSM;

import android.os.Bundle;
import android.app.ActionBar;
import android.support.v4.app.FragmentActivity;
import android.text.Html;
import android.view.Menu;
import android.widget.TextView;

public class BDWMaisInformacoesActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bdwmais_informacoes);
		
		ActionBar action = getActionBar();
		action.setLogo(R.drawable.hsm_logo);
		
		TextView maisInfo = (TextView) findViewById(R.id.textoPaginaBDW);
		/*maisInfo.setText(Html.fromHtml("<b>DESIGN TRADE SHOW</b>"+

"Alguns dos melhores escrit�rios do mercado brasileiro apresentar�o suas principais inova��es no campo do design, neste que � o cora��o do evento. Atrav�s de seus trabalhos, ir�o mostrar que a ind�stria brasileira de design possui vis�o estrat�gica, experi�ncia, dimens�o profissional e uma grande capacidade de inova��o. Absolutamente imperd�vel para quem busca novas ideias. <br/>"+
"<b>Participantes no Design Trade Show:</b>"+
"<br/>"+
"Abedesign<br/>"+
Crama Design Estrat�gico<br/>"+
Greco Design<br/>"+
Komm Design Group<br/>"+
OZ Design<br/>"+
Pande<br/>"+
T�til<br/>"+

<b>DESIGN IN VIDEO</b>"+
<br/>"+
Apresenta��o digital de cases de design dos melhores escrit�rios do mercado brasileiro. Atrav�s de postais posicionados nas paredes e de tablets, o p�blico poder� ter acesso ao conte�do das empresas participantes."+

LVA Cria��o<br/>"+

Crama Design<br/>"+

Komm::<br/>"+

T�til<br/>"+

Saad branding+design <br/>"+

Dezign com Z<br/>"+

Commgroup<br/>"+

<b>BRASIL DESIGN AWARD</b>"+
<br/>"+
O mais abrangente pr�mio de inova��o atrav�s do design O Brasil Design Award � o pr�mio dos pr�mios! <br/>"+
Promovido pela ABEDESIGN, com a Dire��o de Andr� Poppovic e realiza��o do Centro Brasil Design, os pr�mios ser�o entregues aos trabalhos brasileiros que acumularam o maior numero de premia��es selecionadas de design, nacionais e internacionais, no ano de 2013.<br/>"+

O Brasil Design Award premiar� trabalhos na �rea de Design de Produto e Design Gr�fico, al�m de personalidades do setor e entidades dedicadas a promo��o da categoria no Brasil.<br/>"+

PATROCINADOR: Sebrae<br/>"+

ORGANIZA��O: Centro Brasil Design<br/>"+

<b>PROJETO COMPRADOR RODADA DE NEG�CIOS</b>"+

Em parceria com a Apex-Brasil, o Projeto Comprador fomenta a realiza��o de neg�cios e gera oportunidades para realiza��o de contatos internacionais entre empresas de design participantes do projeto Brasil Design e potenciais executivos internacionais. Um dos mais eficazes instrumentos de promo��o de neg�cios, organizado a partir de uma din�mica de encontros empresariais.<br/>"+

<b>PROJETO IMAGEM</b>"+
<br/>"+
Exclusivo aos participantes do projeto Brasil Design, o Projeto Imagem tem por objetivo trazer jornalistas internacionais para visitar a Brasil Design Week, conhecer as ag�ncias de design e promover o design brasileiro internacionalmente. <br/>"+

<b>COMIT� ORGANIZADOR</b><br/>"+

DIRETORIA ABEDESIGN "+
<br/>"+
<b>Gustavo Gelli</b> � Presidente"+
<br/>"+
<b>Andr� Poppovic</b> - Vice-Presidente"+
<br/>"+
<b>Roger Rieger</b> � Diretor de Promo��o Comercial e Eventos"+
<br/>"+
<b>Gian Franco Rocchiccioli</b> � Diretor de Assuntos Regulat�rios e Fomento"+
<br/>"+
<b>Gisela Schulzinger</b> � Diretora de Capacita��o Empresarial"+
<br/>"+
<b>Giovanni Vannuchi</b> � Diretor de Rela��es Institucionais"+
<br/>"+
<b>Ellen Kiss</b> � Diretora de Rela��es Internacionais"+
<br/>"+
<b>Gustavo Greco</b> � Diretor de Imagem"+
<br/>"+
<b>Vinic�us Iubel</b> � Diretor ABEDESIGN Regional Paran�"+
<br/>"+
<b>Cynthia Massote</b> � Diretora ABEDESIGN Regional Minas Gerais"+
<br/>"+
<b>Felipe Arcoverde</b> - Diretor ABEDESIGN Regional Bahia"+
<br/>"+
<b>Allyson Reis </b>� Diretor ABEDESIGN Regional Cear�"+
<br/>"+
<b>Paulo Oliva </b>� Diretor ABEDESIGN Regional Pernambuco"+
<br/>"+
<b>Marcos Sebben</b> � Diretor ABEDESIGN Regional Santa Catarina"+
<br/>"+
<b>M�rio Verdi </b>� Diretor ABEDESIGN Regional Rio Grande do Sul"+
<br/>"+

DIRE��O GERAL"+

<b>Roger Rieger </b>� KOMM::"+
<br/><br/>"+
BRASIL DESIGN AWARDS"+

Curador: Andr� Poppovic | Organiza��o: Centro Brasil Design"+
<br/><br/>"+
EQUIPE EXECUTIVA ABEDESIGN"+

Anna Carolina Maccarone � Gerente Executiva"+

Bruno Fernandes � Gerente Administrativo Financeiro"+

Paola Oliveira � Coordenadora do Projeto Interag�ncia e Intelig�ncia Comercial"+

Iara Ara�jo � Assistente de Atendimento"+
<br/><br/>"+
ESTRAT�GIA E INOVA��O"+

Maur�cio Medeiros"+
<br/><br/>
CONSELHO CONSULTIVO

Manoel M�ller | Luciano Deos | Fernando Faria | Frederico Gelli

Luis Augusto Indio da Costa | Ricardo Leite 
<br/><br/>
IDENTIDADE VISUAL

OXX DESIGN
<br/><br/>
ASSESSORIA DE IMPRENSA

Lucia Faria Intelig�ncia em Comunica��o

Marco Barone: marco@luciafaria.com.br 

Telefone: (11) 3277-8891"));
*/		
		
		String a = "<b>DESIGN TRADE SHOW</b><br/>Alguns dos melhores escrit�rios do mercado brasileiro apresentar�o suas principais inova��es no campo do design, neste que � o cora��o do evento. Atrav�s de seus trabalhos, ir�o mostrar que a ind�stria brasileira de design possui vis�o estrat�gica, experi�ncia, dimens�o profissional e uma grande capacidade de inova��o. Absolutamente imperd�vel para quem busca novas ideias. <br/><br/><b>Participantes no Design Trade Show:</b><br/>Abedesign<br/>Crama Design Estrat�gico<br/>Greco Design<br/>Komm Design Group<br/>OZ Design<br/>Pande<br/>T�til<br/><br/><b>DESIGN IN VIDEO</b><br/>Apresenta��o digital de cases de design dos melhores escrit�rios do mercado brasileiro. Atrav�s de postais posicionados nas paredes e de tablets, o p�blico poder� ter acesso ao conte�do das empresas participantes.LVA Cria��o<br/>Crama Design<br/>Komm::<br/>T�til<br/>Saad branding+design <br/>Dezign com Z<br/>Commgroup<br/><br/><b>BRASIL DESIGN AWARD</b><br/>O mais abrangente pr�mio de inova��o atrav�s do design O Brasil Design Award � o pr�mio dos pr�mios! <br/>Promovido pela ABEDESIGN, com a Dire��o de Andr� Poppovic e realiza��o do Centro Brasil Design, os pr�mios ser�o entregues aos trabalhos brasileiros que acumularam o maior numero de premia��es selecionadas de design, nacionais e internacionais, no ano de 2013.<br/>O Brasil Design Award premiar� trabalhos na �rea de Design de Produto e Design Gr�fico, al�m de personalidades do setor e entidades dedicadas a promo��o da categoria no Brasil.<br/><br/>PATROCINADOR: Sebrae<br/>ORGANIZA��O: Centro Brasil Design<br/><br/><b>PROJETO COMPRADOR RODADA DE NEG�CIOS</b><br/>Em parceria com a Apex-Brasil, o Projeto Comprador fomenta a realiza��o de neg�cios e gera oportunidades para realiza��o de contatos internacionais entre empresas de design participantes do projeto Brasil Design e potenciais executivos internacionais. Um dos mais eficazes instrumentos de promo��o de neg�cios, organizado a partir de uma din�mica de encontros empresariais.<br/><br/><b>PROJETO IMAGEM</b><br/>Exclusivo aos participantes do projeto Brasil Design, o Projeto Imagem tem por objetivo trazer jornalistas internacionais para visitar a Brasil Design Week, conhecer as ag�ncias de design e promover o design brasileiro internacionalmente. <br/><br/><b>COMIT� ORGANIZADOR</b><br/>DIRETORIA ABEDESIGN<br/><b>Gustavo Gelli</b> � Presidente<br/><b>Andr� Poppovic</b> - Vice-Presidente<br/><b>Roger Rieger</b> � Diretor de Promo��o Comercial e Eventos<br/><b>Gian Franco Rocchiccioli</b> � Diretor de Assuntos Regulat�rios e Fomento<br/><b>Gisela Schulzinger</b> � Diretora de Capacita��o Empresarial<br/><b>Giovanni Vannuchi</b> � Diretor de Rela��es Institucionais<br/><b>Ellen Kiss</b> � Diretora de Rela��es Internacionais<br/><b>Gustavo Greco</b> � Diretor de Imagem<br/><b>Vinic�us Iubel</b> � Diretor ABEDESIGN Regional Paran�<br/><b>Cynthia Massote</b> � Diretora ABEDESIGN Regional Minas Gerais<br/><b>Felipe Arcoverde</b> - Diretor ABEDESIGN Regional Bahia<br/><b>Allyson Reis </b>� Diretor ABEDESIGN Regional Cear�<br/><b>Paulo Oliva </b>� Diretor ABEDESIGN Regional Pernambuco<br/><b>Marcos Sebben</b> � Diretor ABEDESIGN Regional Santa Catarina<br/><b>M�rio Verdi </b>� Diretor ABEDESIGN Regional Rio Grande do Sul<br/><br/>DIRE��O GERAL<br/><b>Roger Rieger </b>� KOMM::<br/><br/>BRASIL DESIGN AWARDS<br/>Curador: Andr� Poppovic | Organiza��o: Centro Brasil Design<br/><br/>EQUIPE EXECUTIVA ABEDESIGN<br/>Anna Carolina Maccarone � Gerente ExecutivaBruno Fernandes � Gerente Administrativo FinanceiroPaola Oliveira � Coordenadora do Projeto Interag�ncia e Intelig�ncia ComercialIara Ara�jo � Assistente de Atendimento<br/><br/>ESTRAT�GIA E INOVA��OMaur�cio Medeiros<br/><br/>CONSELHO CONSULTIVO<br/>Manoel M�ller | Luciano Deos | Fernando Faria | Frederico GelliLuis Augusto Indio da Costa | Ricardo Leite<br/><br/>IDENTIDADE VISUALOXX DESIGN<br/><br/>ASSESSORIA DE IMPRENSA<br/>Lucia Faria Intelig�ncia em Comunica��o<br/>Marco Barone: marco@luciafaria.com.br<br/>Telefone: (11) 3277-8891";
		maisInfo.setText(Html.fromHtml(a));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.bdwmais_informacoes, menu);
		return false;
	}

}
