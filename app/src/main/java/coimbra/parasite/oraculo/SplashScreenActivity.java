package coimbra.parasite.oraculo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


/**
 * Criado por Anderson Coimbra em 26/03/2015.
 */
public class SplashScreenActivity extends Activity implements Runnable{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Handler SplashScrem = new Handler();
        SplashScrem.postDelayed(SplashScreenActivity.this, 5000);
    }

    @Override
    public void run() {
        startActivity(new Intent(this, OraculoActivity.class));
        finish();

    }
}
