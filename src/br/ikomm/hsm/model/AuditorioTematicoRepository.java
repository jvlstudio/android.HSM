package br.ikomm.hsm.model;

import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

public class AuditorioTematicoRepository {
	private static String jsonTematicoAuditorio = 
			"[{'id':'1','textoBranco':'Esta��o do conhecimento','textoPagina':'Uma iniciativa HSM pela valoriza��o da gest�o empresarial brasileira. <br/><br/>A Esta��o ir� abordar a <b>gest�o para o futuro</b>, com um olhar para asoportunidades e desafios que o pa�s ir� enfrentar, trazendo informa��es ediscuss�es importantes para as decis�es empresariais.<br/><br/>Quais as mudan�as de cen�rio que ir�o influenciar as decis�es dos l�deresbrasileiros?<br/><br/>O que � necess�rio para prosperar neste novo Brasil?<br/><br/>Como alguns dos principais setores da economia est�o se organizando paracompetir em um cen�rio de competi��o global?<br/><br/>Para ajudar a responder a essas e outras perguntas, constru�mos umagrade que une uma vis�o pr�tica com grandes estudiosos sobre temas como: <b>empreendedorismo, �tica, economia, digital, varejo, entre outros</b>.','titulo':'Brasil: Gest�o para o futuro'},{'id':'2','textoBranco':'Esta��o do conhecimento','textoPagina':'O objetivo deste espa�o � reunir grupos de lideran�as, formadores deopini�o, para promover o di�logo sobre as pol�ticas p�blicas existentes noBrasil. Por meio dessa discuss�o, queremos engajar o p�blico presentee transformar o local em um ambiente de cria��o coletiva e troca de experi�ncias.<br/><br/>E, para que esta discuss�o sobre as pol�ticas p�blicas possa serenriquecedora, os contextos problem�ticos atuais da sociedade brasileiraser�o utilizados como exemplo na busca das defini��es necess�rias para aconstru��o do pa�s das Cidades do Futuro.','titulo':'Esta��o Sustentabilidade'},{'id':'3','textoBranco':'Esta��o do conhecimento','textoPagina':'Conhecimento e inspira��o para o desenvolvimento de grandes l�deres.<br/><br/>Comandado por C�sar Souza, um dos maiores especialistas em lideran�ano Pa�s e curador de conte�do do espa�o, esta Esta��o visa contribuir parao incremento da capacidade de gest�o dos l�deres brasileiros, em conversascom empres�rios e executivos, discutindo, analisando e apontando caminhospara combater a atual escassez de l�deres em diversas �reas. Iniciativa daHSM e da Empreenda.','titulo':'Atelier de L�deres'},{'id':'4','textoBranco':'Esta��o do conhecimento','textoPagina':'Construindo uma nova gera��o de executivos.<br/><br/>A <b>3� Edi��o do CBN Young Professional apresenta</b> conte�dos para jovensprofissionais que desejam ampliar suas vis�es sobre gest�o e neg�cios.Durantes os 3 dias, �ncoras e comentaristas da CBN apresentar�o parao jovem profissional aspectos ligados a sua carreira, economia, gest�o,educa��o e sucesso.<br/><br/>Ao final de cada palestra, participe ainda da rodada de perguntas e respostas com <b>M�rio S�rgio Cortela, Juca Kfouri, Max Gehringer entre outros</b>.','titulo':'CBN Young Professional'}]";
	private Gson gson = new Gson();

	public List<AuditorioTematico> getAll() {
		AuditorioTematico[] auditoriosTematicos = gson.fromJson(jsonTematicoAuditorio,
				AuditorioTematico[].class);
		return Arrays.asList(auditoriosTematicos);
	}

	public AuditorioTematico getById(int id) {
		AuditorioTematico[] palestrasArray = gson.fromJson(jsonTematicoAuditorio,
				AuditorioTematico[].class);
		List<AuditorioTematico> palestras = Arrays.asList(palestrasArray);

		for (int i = 0; i < palestras.size(); i++) {
			if (!palestras.get(i).id.isEmpty()
					&& Long.valueOf(palestras.get(i).id) == id) {
				return palestras.get(i);
			}
		}
		return null;
	}
}