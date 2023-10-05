package com.example.pagela;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.pagela.DAO.Connection;
import com.example.pagela.models.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Tela_Cadastro_Paciente extends AppCompatActivity {

    EditText nome;
    EditText cpf;
    EditText email;
    EditText senha;
    EditText confirmacaoSenha;
    Button botaoCriar;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro_paciente);

        nome = findViewById(R.id.cadTextNome);
        cpf = findViewById(R.id.cadTextCpf);
        email = findViewById(R.id.cadTextEmail);
        senha = findViewById((R.id.cadTexSenha));
        confirmacaoSenha = findViewById(R.id.cadTexConfirmarSenha);
        botaoCriar = findViewById(R.id.button);

        botaoCriar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("debug", "criando...");
                //se for diferente de vazio
                if(!(nome.getText().toString().equals("") || email.getText().toString().equals("") || email.getText().toString().equals("") || senha.getText().toString().equals("") || confirmacaoSenha.getText().toString().equals(""))) {
                    Connection dao = new Connection(getApplicationContext());
                    Pessoa pessoa = new Pessoa();

                    pessoa.setNome(nome.getText().toString());
                    pessoa.setCpf(cpf.getText().toString());
                    pessoa.setEmail(email.getText().toString());

                    dao.insert(pessoa);
                    List<Pessoa> x = dao.getPessoa();
                    for(int i = 0;i<x.size();i++){
                        Log.i("debug", "x = " + x.get(i).getNome());
                    }
                    dao.close();

                    //limpa os dados
                    nome.setText("");
                    nome.requestFocus();  //cursor volta pro primeiro campo
                    cpf.setText("");
                    email.setText("");
                    senha.setText("");
                    confirmacaoSenha.setText("");

                    //buscaNoBanco();
                } else {
                    Toast.makeText(getApplicationContext(), "Por favor preencha todos os campos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    private void buscaNoBanco() {
        //buscar dados
        Connection dao2 = new Connection(getApplicationContext());
        List<Pessoa> pessoas = dao2.getPessoa();

        List<String> nomes = new ArrayList<String>();
        for (Pessoa nomeBuscado : pessoas) {
            nomes.add(nomeBuscado.getNome());
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, nomes);
        listView.setAdapter(adapter);
    }
}