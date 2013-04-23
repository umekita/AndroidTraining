package jp.mixi.practice.fragment.beg;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SubFragment extends Fragment {
	public SubFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// LayoutInflater を利用して、レイアウトをリソースとして読み込む
		View view = inflater.inflate(R.layout.fragment_sub, container, false);
		return view;
	}

	public static Fragment newInstance() {
		return new SubFragment();
	}
}
