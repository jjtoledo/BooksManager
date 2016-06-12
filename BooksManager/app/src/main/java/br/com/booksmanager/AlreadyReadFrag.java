package br.com.booksmanager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by jose on 12/06/16.
 */
public class AlreadyReadFrag extends android.support.v4.app.Fragment {
    public static AlreadyReadFrag newInstance(){
        AlreadyReadFrag fragment = new AlreadyReadFrag();
        return fragment;
    }

    public AlreadyReadFrag(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.fragment_reading, container, false);

        return rootView;
    }
}

