package com.iclub.locallogin;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclickreg(View view){
        Intent intent=new Intent(this,Register.class);
        startActivity(intent);
    }

    public void onclicklog(View view){
        Intent intent=new Intent(this,Login.class);
        startActivity(intent);
    }
}
