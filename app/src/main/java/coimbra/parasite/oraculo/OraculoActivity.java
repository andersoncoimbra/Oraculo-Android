package coimbra.parasite.oraculo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


public class OraculoActivity extends ActionBarActivity {

    EditText nome; //Declaração da variavel para receber os valores do EditText ednome no XML
    Spinner signos; ////Declaração da variavel para receber os valores do Spinner ednome no XML

    private String[] listaSignos = new String[]{"Aries", "Touro",
            "Gemeos","Cancer","Leao","Virgem", "Libra", "Escorpiao",
            "Sagitario","Capricornio", "Aquario","Peixe","Direto do Alem"};
             //Array de string dos Signos do zodiaco para mostrar no Spinner(Select)

    Button btgerarsorte; //Declaração da variavel para receber os valores de classe do Button btgerarsorte no XML

    TextView hsorte; //Declaração da variavel para receber o nome do usuario e o titulo da geração de sorte "[USER] sua Sorte é:"
    TextView txtfrase; //declaração da variavel para receber a frase de sorte gerada na classe GeraSorte

    int idSigno; //Declaração de variavel para receber o id do signo selecionado
    String nomeUser;//declaração de variavel para receber o nome do usuario





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TelaSorte();  //Responsavel por carragar a tela sortes do Oraculo

    }

    public void TelaSorte() {  //metodo criado para carregar a tela sorte
       setContentView(R.layout.activity_oraculo);

        nome = (EditText) findViewById(R.id.ednome);  //atribui o valor de class no EditText no XML na variavel nome

        signos = (Spinner) findViewById(R.id.spsignos); //atribuir o valor de class no Spinner no XML na variavel signos


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, listaSignos);
        // Cria um objeto do tipo ArrayAdapter para se usado pelo setAdapter do Spinner
        signos.setAdapter(adapter); //recebe os parametros  feitos apartir do instanciamento do objeto adapter do tipo ArrayAdapter


        btgerarsorte = (Button) findViewById(R.id.btgerarsorte);    //atribui o valor de class no Button no XML na variavel btgerarsorte

        hsorte = (TextView) findViewById(R.id.hsorte); //atribui o valor de classe no TextView no XML na variavel hsorte
        txtfrase = (TextView) findViewById(R.id.txtfrase); // atribuir o valor de class no TextView no XML na variavel txtfrase


        btgerarsorte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nomeUser = nome.getText().toString(); //Responsavel de pegar o texto digitado no EditText de id ednome no XML
                idSigno = (int) signos.getSelectedItemId(); //responsavel de pega o valor do indece ddo signo selecionado

                GeraSorte s1 = new GeraSorte(nomeUser, idSigno); //instancia de um objeto geraSorte responsavel pelo processo de gerar a frase de sorte

                if(nomeUser.trim().length() > 1) { //verifica se o nome digita tem mais que um caracter
                    hsorte.setText("Testando Titulo ok! posisão " + idSigno); //Altera com TextView hsorte para mostra o nome do usuario e texto "sua sorte é"
                    txtfrase.setText("Testando frase de sorte ok! Signo " + nomeUser + nomeUser.length()); //receber a frase da classe gerarSorte e altera o TextView txtfrase com a frase gerada

                } else { //Aviso se o nome nao for digitado de forma valida
                    hsorte.setText("Atenção");  //titulo do aviso
                    txtfrase.setText("Digite um nome Valido!"); //texto do aviso
                }


            }
        });


    }


}
