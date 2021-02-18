package uk.ac.tees.w9005319.chatbotapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ChatActivity extends AppCompatActivity {

    WebView chat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        Intent intent = getIntent();

        chat = findViewById(R.id.chatView);

        WebSettings webSettings = chat.getSettings();
        webSettings.setJavaScriptEnabled(true);
        chat.setWebViewClient(new Callback());
       // chat.loadUrl("https://webchat.botframework.com/embed/sC6-FeVtSk4.lym0qckVUcS6HfMiKOaOEc-cPt8o6ahIG2iKbz4RMHw");
        chat.loadUrl("https://webchat.botframework.com/embed/eve-health-bot-oluvexk?s=JxVLkDusPiI.cs7yT8kBAZ56Eb4p84sQxGKMt8RWYxeu37HISdhn0NY");
    }

    private class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
            return false;
        }
    }
}
