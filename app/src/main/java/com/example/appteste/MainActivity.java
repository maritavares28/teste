package com.example.appteste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

     //atributo tipo botão, ID dos elementos
    //no arqiovo java atual
     Button btntela,btnsair;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* troca de tela */
        //localizar o elemento pelo ID e atribuir os valores ao atributo
        btntela = findViewById (R.id.btntela);
        //configurando o botão com a opção de click
        btntela.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           //instanciando a tela - activity (na tela do arquivo java ex: tela2.class)
                                           Intent tela2 = new Intent(getApplicationContext(), tela2.class);
                                           // inicia a intent = tela2 = Activity
                                           startActivity(tela2);
                                       }
                                   });

                //botão para fechar o app
                btnFechar = findViewById(R.id.btnFechar);
                btnFechar.setOnClickListener (new View.OnClickListenner(){
                    @Override
                    public void onClick(View view){
                        finish();
                        finishAffinity();
                    }
        });
    }
}