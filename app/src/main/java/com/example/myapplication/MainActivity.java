package com.example.myapplication;

import static net.sourceforge.jtds.util.Logger.println;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainActivity extends AppCompatActivity {
    Connection connection;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.result_tv);

        ConSQL c = new ConSQL();
        connection = c.conclass();

        try {
            String querry = "Select * from names";

            Statement smt = connection.createStatement();

            ResultSet set = smt.executeQuery(querry);

            while (set.next()) {

                println(set.getString("name"));

                tv.append("\n" + set.getString("name"));

            }
        }
        catch (Exception e) {
            Log.e("Error:", e.getMessage());
        }
    }
}
