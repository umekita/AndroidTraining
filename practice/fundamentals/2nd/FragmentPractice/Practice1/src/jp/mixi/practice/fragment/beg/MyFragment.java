package jp.mixi.practice.fragment.beg;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyFragment extends Fragment {
	public MyFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// LayoutInflater を利用して、レイアウトをリソースとして読み込む
		View view = inflater.inflate(R.layout.fragment_main, container, false);
		return view;
	}

}
