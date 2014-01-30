package br.ikomm.hsm.adapter;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.TextView;
import br.com.ikomm.apps.HSM.R;
import br.ikomm.hsm.model.Pacote;

public class PacoteAdapter extends BaseAdapter {

	private Context context;
	private LayoutInflater inflater;
	List<Pacote> pacotes = new ArrayList<Pacote>();

	public PacoteAdapter(Activity activity, Context context) {
		super();
		this.context = context;
		inflater = LayoutInflater.from(activity);

		Pacote pacote1 = new Pacote();
		pacote1.titulo = "Passe Verde";
		pacote1.validade = "Válido para 1 dia de Auditório";
		pacote1.local = "Principal e 3 dias de Exposição";
		pacote1.precoNormal = "Preço Normal: R$2.660";
		pacote1.precoApp = "R$2.380";
		pacotes.add(pacote1);

		Pacote pacote2 = new Pacote();
		pacote2.titulo = "Passe Dourado";
		pacote2.validade = "Válido para os 3 dias do Auditório";
		pacote2.local = "Principal e da Exposição";
		pacote2.precoNormal = "Preço Normal: R$6.850";
		pacote2.precoApp = "R$6.300";
		pacotes.add(pacote2);

		Pacote pacote3 = new Pacote();
		pacote3.titulo = "Passe Corporate";
		pacote3.validade = "Pacote para os 5 Passes Dourados.";
		pacote3.local = "Válidos para 3 dias de Auditório Principal e da Exposição";
		pacote3.precoNormal = "Preço Normal: R$31.900";
		pacote3.precoApp = "R$29.660";
		pacotes.add(pacote3);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return pacotes.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View converView, ViewGroup parent) {
		// TODO Auto-generated method stub

		View view = converView;
		view = inflater.inflate(R.layout.adapter_pacote, parent, false);

		TextView titulo = (TextView) view.findViewById(R.id.tTituloPacote);
		titulo.setText(pacotes.get(position).titulo);

		TextView validade = (TextView) view.findViewById(R.id.tValidade);
		validade.setText(pacotes.get(position).validade);

		TextView locais = (TextView) view.findViewById(R.id.tLocais);
		locais.setText(pacotes.get(position).local);

		TextView precoNormal = (TextView) view.findViewById(R.id.tPrecoNormal);
		precoNormal.setText(pacotes.get(position).precoNormal);

		TextView precoApp = (TextView) view.findViewById(R.id.tValor);
		precoApp.setText(pacotes.get(position).precoApp);
		
		FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.framePasseDescricao);
		
		switch (position) {
		case 0:
			frameLayout.setBackgroundColor(Color.rgb(046, 139, 87));
			precoNormal.setTextColor(Color.rgb(205, 201, 201));
			break;
		case 1:
			frameLayout.setBackgroundColor(Color.rgb(238, 173, 014));
			precoNormal.setTextColor(Color.rgb(205, 201, 201));
			break;
		case 2:
			frameLayout.setBackgroundColor(Color.rgb(255, 055, 000));
			precoNormal.setTextColor(Color.rgb(205, 201, 201));
			break;
		}
		
		return view;
	}

}
