package coimbra.parasite.oraculo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import android.widget.LinearLayout;

import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.gms.ads.*;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;


public class OraculoActivity extends Activity {

EditText nome; //Declaração da variavel para receber os valores do EditText ednome no XML
Spinner signos; ////Declaração da variavel para receber os valores do Spinner ednome no XML


private String[] listaSignos = new String[]{"Direto do Alem", "Aries", "Touro",
        "Gemeos","Cancer","Leao","Virgem", "Libra", "Escorpiao",
        "Sagitario","Capricornio", "Aquario","Peixe"};
         //Array de string dos Signos do zodiaco para mostrar no Spinner(Select)

Button btgerarsorte; //Declaração da variavel para receber os valores de classe do Button btgerarsorte no XML

TextView hsorte; //Declaração da variavel para receber o nome do usuario e o titulo da geração de sorte "[USER] sua Sorte é:"
TextView txtfrase; //declaração da variavel para receber a frase de sorte gerada na classe GeraSorte

int idSigno; //Declaração de variavel para receber o id do signo selecionado
String nomeUser;//declaração de variavel para receber o nome do usuario


private AdView ads; //declaração do intem de banner do admob para publicidade;
LinearLayout layoutAds;// declaração do Layout que ira receber o banner do anuncio
String IdUnico = "ca-app-pub-9206111030138265/2822747432";//sera o id do bloco de anuncio do admob  id-do-bloco-de-anuncio-do-admob

Button btsobre;

    GoogleAnalytics analytics = GoogleAnalytics.getInstance(this);
    Tracker tracker = analytics.newTracker("UA-45956575-3"); // Responsavel por enviar os Hit para o Google Analytics

@Override
protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);
    TelaSorte();  //Responsavel por carragar a tela sortes do Oraculo
    adMob(); //Responsavel por carregar os Anuncios


}

public void TelaSorte() {  //metodo criado para carregar a tela sorte
   setContentView(R.layout.activity_oraculo);

    nome = (EditText) findViewById(R.id.ednome);  //atribui o valor de class no EditText no XML na variavel nome

    signos = (Spinner) findViewById(R.id.spsignos); //atribuir o valor de class no Spinner no XML na variavel signos


    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, listaSignos);
    // Cria um objeto do tipo ArrayAdapter para se usado pelo setAdapter do Spinner
    signos.setAdapter(adapter); //recebe os parametros  feitos apartir do instanciamento do objeto adapter do tipo ArrayAdapter


    btgerarsorte = (Button) findViewById(R.id.btgerarsorte);    //atribui o valor de class no Button no XML na variavel btgerarsorte

    btsobre = (Button) findViewById(R.id.btsobre);

    hsorte = (TextView) findViewById(R.id.hsorte); //atribui o valor de classe no TextView no XML na variavel hsorte
    txtfrase = (TextView) findViewById(R.id.txtfrase); // atribuir o valor de class no TextView no XML na variavel txtfrase


    btgerarsorte.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {

            nomeUser = nome.getText().toString(); //Responsavel de pegar o texto digitado no EditText de id ednome no XML
            idSigno = (int) signos.getSelectedItemId(); //responsavel de pega o valor do indece ddo signo selecionado


            GeraSorte s1 = new GeraSorte(nomeUser, idSigno); //instancia de um objeto geraSorte responsavel pelo processo de gerar a frase de sorte

            if (nomeUser.trim().length() > 1) { //verifica se o nome digita tem mais que um caracter
                hsorte.setText(nomeUser.toUpperCase() + " sua Sorte é:"); //Altera com TextView hsorte para mostra o nome do usuario e texto "sua sorte é"
                txtfrase.setText(s1.getFrasegerada()); //receber a frase da classe gerarSorte e altera o TextView txtfrase com a frase gerada

            } else { //Aviso se o nome nao for digitado de forma valida
                hsorte.setText("Atenção");  //titulo do aviso
                txtfrase.setText("Digite um nome Valido!" + idSigno); //texto do aviso
            }


        }
    });

    btsobre.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            telaSobre();
        }
    });



}

public void adMob(){
    //Cria a adView que na vedade o objeto Anuncio do Admob
    ads = new AdView(this); //diz em qual contexto de activity sera emplementada
    ads.setAdUnitId(IdUnico); //Recebe o id do bloco de anuncio
    ads.setAdSize(AdSize.BANNER);//recebe o tipo e o tamanho do anuncio

   // ads = (AdView) this.findViewById(R.id.adView);


    layoutAds = (LinearLayout) findViewById(R.id.ads); //atribuio o valor de class  do elemento ads do tipo LinearLayout do xml a varialvel layoutAds

    layoutAds.addView(ads); //adiciona o elemento ads do tipo AdView ao LinearLayout

  /*
          <com.google.android.gms.ads.AdView android:id="@+id/adView"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    ads:adUnitId="MY_AD_UNIT_ID"
    ads:adSize="BANNER"/>
    */

    AdRequest adRequest = new AdRequest.Builder()  //requisição de anuncio
            .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)    //usado para gera os anuncio de teste em ambiente de produção
            .build();//constrouir o pedido  de anuncio

    ads.loadAd(adRequest);//Carregar o anuncio


    //  Hesponsavel por enviar os eventos da tela Principal sobre

    tracker.setScreenName("Tela PSobre");

    tracker.send(new HitBuilders.EventBuilder()

            .setCategory("Tala Ativa ")
            .setAction("click")
            .setLabel("Navegação")
            .build());



}


public void telaSobre(){
    setContentView(R.layout.sobre);
    Button btvoltar = (Button) findViewById(R.id.btvoltar);//Declaração do Botão de Voltar
    Button btface1 = (Button) findViewById(R.id.btface1); //Declaração do Botão do Facebook de Anderson Coimbra
    Button bttwitter1 = (Button) findViewById(R.id.bttwitter1);//Declaração do Botão do Twitter de Anderson Coimbra
    Button btlinkedin1 = (Button) findViewById(R.id.btlinkdin1); //Declaração do Botão do LinkedIn de Anderson Coimbra
    Button btgit1 = (Button) findViewById(R.id.btgit1); //Declaração do Botão do GitHub de Anderson Coimbra
    Button btface2 =(Button) findViewById(R.id.btface2); //Declaração do Botão do Facebook de Kim
    Button btface3 = (Button) findViewById(R.id.btface3); //Declaração do Botão do Facebook de Renato
    Button btface4 = (Button) findViewById(R.id.btface4); //Declaração do Botão do Facebook de Jully



    /////////////////////////////////////
    //  Responsavel por enviar os eventos da tela Principal sobre
    ////////////////////////////////

    tracker.setScreenName("Tela Principal");

    tracker.send(new HitBuilders.EventBuilder()
            .setCategory("TELA")
            .setAction("Tela Ativa")
            .setLabel("Navegação")
            .build());


////////////////////////////////
////  Ações de click dos botãos Sobre.xml
////////////////////////////////

    //Ação de click do botão Volta da tela Sobre
    btvoltar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TelaSorte();
        }
    });

    //Ação de click do botão da tela sobre
    //Metodo usado para simpifica a abertura de web-link
    botaoURL(btface1, "https://www.facebook.com/andersonbarroscoimbra");
    botaoURL(bttwitter1, "http://twitter.com/andersonmegax");
    botaoURL(btlinkedin1, "https://br.linkedin.com/in/andersoncoimbra");
    botaoURL(btgit1,"https://github.com/andersoncoimbra");
    botaoURL(btface2, "https://www.facebook.com/kimfarias.peniche");
    botaoURL(btface3, "https://www.facebook.com/renato.benicio.73");
    botaoURL(btface4, "https://www.facebook.com/fanymodesto");



}

///////////////////////////////////////////////////////////////////////
//  Metodo para relacionar elemento Botão com ação de abertura de url
//  Metodo para economizar linha de codigos
///////////////////////////////////////////////////////////////////////
public void botaoURL(Button bt, final String link) {
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(link);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }




    @Override
public void onPause() {
    ads.pause();
    super.onPause();
}

@Override
public void onResume() {
    super.onResume();
    ads.resume();
}

@Override
public void onDestroy() {
    ads.destroy();
    super.onDestroy();
}


}
