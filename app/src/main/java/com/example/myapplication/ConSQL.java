package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConSQL {
    Connection con;

    @SuppressLint("NewApi")
    public Connection conclass() {
        StrictMode.ThreadPolicy a = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(a);

        String url= "jdbc:jtds:sqlserver://10.0.2.2:1433/Andro;encrypt=true;integratedsecurity=true";
        //String url= "jdbc:jtds:sqlserver://10.0.2.2:1433/Andro;encrypt=true;ssl=request;lastupdatecount=true;ssl=require;integratedsecurity=true";
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            con = DriverManager.getConnection(url,"arda","123");
        }
        catch (SQLException se)
        {
            Log.e("error here 1 : ", se.getMessage());
        }
        catch (ClassNotFoundException e)
        {
            Log.e("error here 2 : ", e.getMessage());
        }
        catch (Exception e)
        {
            Log.e("error here 3 : ", e.getMessage());
        }

        return con;
    }
}
