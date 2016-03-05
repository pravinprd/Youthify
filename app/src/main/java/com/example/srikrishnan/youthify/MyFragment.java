package com.example.srikrishnan.youthify;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


public class MyFragment extends Fragment {
    public static final String EXTRA_MESSAGE = "EXTRA_MESSAGE";


    public static final MyFragment newInstance(String message)

    {

        MyFragment f = new MyFragment();

        Bundle bdl = new Bundle(1);

        bdl.putString(EXTRA_MESSAGE, message);

        f.setArguments(bdl);

        return f;

    }



    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,

                             Bundle savedInstanceState) {

        String message = getArguments().getString(EXTRA_MESSAGE);


        View v = inflater.inflate(R.layout.fragment_my, container, false);

       TextView messageTextView = (TextView)v.findViewById(R.id.textView);

        ImageView img=(ImageView)v.findViewById(R.id.imageView);
        ImageButton imageButton=(ImageButton)v.findViewById(R.id.imageButton);
        ImageView img2=(ImageView)v.findViewById(R.id.imageView2);                //img.setImageResource(R.drawable.);
if(message.equals("Welcome to youthify!")) {
    img.setImageResource(R.drawable.bg2);
    img2.setImageResource(R.drawable.one);
    //imageButton.setImageResource(R.mipmap.next);
}
    if(message.equals("Got issues to Solve?")) {
        img.setImageResource(R.drawable.bg);
        img2.setImageResource(R.drawable.two);
        //imageButton.setImageResource(R.mipmap.next);
    }
        if(message.equals("Share your concerns!")) {
            img.setImageResource(R.drawable.bg1);
            img2.setImageResource(R.drawable.three);
            imageButton.setImageResource(R.mipmap.go);
        }
        messageTextView.setText(message);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(),LoginActivity.class);
                startActivity(i);
            }
        });
        return v;


    }
}
