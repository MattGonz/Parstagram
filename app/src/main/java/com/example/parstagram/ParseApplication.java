package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

    Parse.initialize(new Parse.Configuration.Builder(this)
      .applicationId("31uBWPdXd8YEm3JgXhoLwRc7hsfZavv2gcVLkGbX")
      .clientKey("1d6oumJj6O8D1jNpIA17rsSh2ElEffuIEWdC384l")
      .server("https://parseapi.back4app.com")
      .build()
    );
    }
}
