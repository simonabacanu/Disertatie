package uiautomator.testing.android.example.com.healthcare;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HealthFragment extends Fragment {

    private Button mButton;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.health_fragment, container,false);
        return view;
    }
}
