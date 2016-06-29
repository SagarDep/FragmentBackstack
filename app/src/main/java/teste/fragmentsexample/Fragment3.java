package teste.fragmentsexample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Max Cavalheiro on 6/29/16.
 * for Copyright © 2016 Cavalheiro Max. All rights reserved.
 * you can contact me at: cavalheirof.max@gmail.com
 */
public class Fragment3 extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_3, container, false);

        Button clickButton = (Button) view.findViewById(R.id.button);
        clickButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //Used to remove last fragment from queue (if you need to do it hard coded)
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });

        return view;
    }
}
