package eureka.com.navigationdrawerdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

import com.labo.kaji.fragmentanimations.CubeAnimation;
import com.labo.kaji.fragmentanimations.PushPullAnimation;

/**
 * Created by hp on 7/9/2017.
 */

public class GalleryFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.gallery_fragment,container,false);
        return view;
    }


    @Override
    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {

        return PushPullAnimation.create(CubeAnimation.RIGHT,enter,500);
    }
}
