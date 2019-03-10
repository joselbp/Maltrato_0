package com.example.bolaospc.maltrato_0.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.bolaospc.maltrato_0.R;
import com.example.bolaospc.maltrato_0.models.Ninios;
import com.example.bolaospc.maltrato_0.models.Pareja;

import java.util.ArrayList;

public class ParejaAdapter extends RecyclerView.Adapter<ParejaAdapter.ViewHolder> {


    private ArrayList<Pareja> datos;
    private Context context;

    public ParejaAdapter(Context context) {
        this.context = context;
        datos = new ArrayList<>();
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardparejas, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Pareja p = datos.get(position);
        holder.TV1.setText(p.getHombre());
        holder.TV2.setText(p.getHombreCasos());
        holder.TV3.setText(p.getMujer());

    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }


    public void adicionarLista(ArrayList<Pareja> lista) {
        datos.addAll(lista);
        notifyDataSetChanged();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView TV1, TV2, TV3;


        public ViewHolder(View itemView) {
            super(itemView);

            TV1 = (TextView) itemView.findViewById(R.id.txtPTotal);
            TV2 = (TextView) itemView.findViewById(R.id.txtPTotal);
            TV3 = (TextView) itemView.findViewById(R.id.txtPTotal);
        }
    }
}
