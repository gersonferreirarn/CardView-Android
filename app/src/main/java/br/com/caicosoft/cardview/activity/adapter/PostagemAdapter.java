package br.com.caicosoft.cardview.activity.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.com.caicosoft.cardview.R;
import br.com.caicosoft.cardview.activity.model.Postagem;

public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.MyViewHolder> {

    private List<Postagem> postagens;

    // faz necessario o construtor para que receba a lista de postagens
    public PostagemAdapter(List<Postagem> listaPostagens) {
        postagens = listaPostagens;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View itemLista = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.postagem_detalhe, viewGroup, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        // recuperar as postagens da listaPostagens
        Postagem postagem = postagens.get(i);

        myViewHolder.tvNome.setText(postagem.getNome());
        myViewHolder.ivFoto.setImageResource(postagem.getFoto());
        myViewHolder.tvDescricao.setText(postagem.getDescricao());
    }

    @Override
    public int getItemCount() {
        return postagens.size(); // retorna o numero de postagens a  ser exibido
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView tvNome;
        private TextView tvDescricao;
        private ImageView ivFoto;

        public MyViewHolder(@NonNull View itemView) {

            super(itemView);
            tvNome = itemView.findViewById(R.id.tvNome);
            tvDescricao = itemView.findViewById(R.id.tvDescricao);
            ivFoto = itemView.findViewById(R.id.ivFoto);
        }
    }
}
