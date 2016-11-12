package com.example.shaloin.sixthassignmentb;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;

/**
 * Created by shaloin on 8/11/16.
 */

public class ListFragment extends Fragment {
    private OnItemSelectedListener listener;

    private Button b1,b2,b3,b4;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.list_fragment,container,false);

        b1=(Button)view.findViewById(R.id.button1ID);
        b2=(Button)view.findViewById(R.id.button2ID);
        b3=(Button)view.findViewById(R.id.button3ID);
        b4=(Button)view.findViewById(R.id.button4ID);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { updateDetail("layout 1");

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateDetail("layout 2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { updateDetail("layout 3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { updateDetail("layout 4");
            }
        });

        return view;
    }

    public interface OnItemSelectedListener{

        public void onRssItemSelected(String link);

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof OnItemSelectedListener){
           // this.context=context;
            this.listener= (OnItemSelectedListener) context;
        }
        else
            throw new ClassCastException(context.toString() + "must implement MyListFragment.OnItemSelectedListener");
    }

    public void updateDetail(String s) { listener.onRssItemSelected(s);}
}


