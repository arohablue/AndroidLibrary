package com.example.navimate;

import android.content.Context;
import android.widget.Toast;

public class LibClass {

        public static void libFun(Context c, String message){

            Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

        }
}
