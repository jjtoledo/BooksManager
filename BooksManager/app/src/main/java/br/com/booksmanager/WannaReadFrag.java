package br.com.booksmanager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by jose on 12/06/16.
 */
public class WannaReadFrag extends android.support.v4.app.Fragment {
    public static WannaReadFrag newInstance(){
        WannaReadFrag fragment = new WannaReadFrag();
        return fragment;
    }

    public WannaReadFrag(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.fragment_wanna_read, container, false);

        return rootView;
    }
}
