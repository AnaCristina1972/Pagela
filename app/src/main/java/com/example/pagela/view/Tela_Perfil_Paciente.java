package com.example.pagela.view;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.pagela.R;

public class Tela_Perfil_Paciente extends AppCompatActivity {

    Button button,voltar,sair;
    ImageView imgem;
    static final int REQUEST_IMAGE_CAPTURE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_perfil_paciente);
        getSupportActionBar().hide();
        button=(Button) findViewById(R.id.imageButton);
        imgem=(ImageView) findViewById(R.id.imageView2);
        iniciarComponentes();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_PICK,MediaStore.Images.Media.INTERNAL_CONTENT_URI);
                startActivityForResult(Intent.createChooser(intent,"Galeria"),1);
            }
        });

        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tela_Perfil_Paciente.this.finish();
            }
        });


    }
    protected  void onActivityResult(int RequestCode,int ResultCode,Intent dados) {
        super.onActivityResult(RequestCode, ResultCode, dados);
        if (ResultCode == Activity.RESULT_OK) {
            if (RequestCode == 1) {
                imgem.setImageURI(dados.getData());
            }

        }


    }
    private void iniciarComponentes(){
        Button voltar = (Button) findViewById(R.id.Button_voltarLogin);
        Button sair = (Button) findViewById(R.id.Button_sairLogin);
    }
    public  void notificacao(){

    }
}