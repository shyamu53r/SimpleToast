package com.shyamu53r.testlibs;

import android.content.Context;
import android.widget.Toast;

public class ToastMessage {
    public static void toastDemo(Context context,String str){
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show();
    }
}
