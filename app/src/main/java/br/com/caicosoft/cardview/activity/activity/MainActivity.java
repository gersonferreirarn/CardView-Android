package br.com.caicosoft.cardview.activity.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import br.com.caicosoft.cardview.R;
import br.com.caicosoft.cardview.activity.adapter.PostagemAdapter;
import br.com.caicosoft.cardview.activity.model.Postagem;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPostagem = findViewById(R.id.rvPostagem);

        // Define Layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        //((LinearLayoutManager) layoutManager).setOrientation(LinearLayout.HORIZONTAL); // IRA SER EXIBIDO LADO A LADO TIPO APRESENTAÇÃO DE SLIDE

        //RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2); // APARECE EM QUADRADOS AO LADO DO OUTRO

        rvPostagem.setLayoutManager(layoutManager);

        // Define Adapter
        prepararPostagens();
        PostagemAdapter adapter = new PostagemAdapter(postagens);
        rvPostagem.setAdapter(adapter);
    }

    public void prepararPostagens(){
        Postagem p = new Postagem("Gerson Ferreira", "Viagem top!!!", R.drawable.imagem1);
        postagens.add(p);

        p = new Postagem("Lucia", "Paisagem muito linda!!!", R.drawable.imagem2);
        postagens.add(p);

        p = new Postagem("Graziela Ferreira", "Que lugar!!", R.drawable.imagem3);
        postagens.add(p);

        p = new Postagem("Gabriela Ferreira", "Natureza!!!", R.drawable.imagem4);
        postagens.add(p);
    }
}
