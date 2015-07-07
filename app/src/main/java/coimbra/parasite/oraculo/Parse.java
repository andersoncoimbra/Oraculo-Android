package coimbra.parasite.oraculo;

import android.app.Application;
import android.util.Log;

import com.parse.ParseException;
import com.parse.ParseInstallation;
import com.parse.ParsePush;
import com.parse.SaveCallback;

/**
 * Created by Para Site on 07/07/2015.
 */
public class Parse extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        com.parse.Parse.initialize(this, "sLdj4TybVbuueYa9tDdls8XcxN9hDvkFRWv5SE54", "lKSU5SECxAjBAWCqAB3fjCHSC6pR5nfJ39Ux10F9");
        ParseInstallation.getCurrentInstallation().saveInBackground();

        ParsePush.subscribeInBackground("", new SaveCallback() {
            @Override
            public void done(ParseException e) {
                if (e == null) {
                    Log.d("com.parse.push", "Successfully subscribed to the broadcast channel.");
                } else {
                    Log.e("com.parse.push", "Failed to subscribe for push", e);
                }
            }
        });

    }


}
