package com.example.lesson6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class TopActivity extends AppCompatActivity implements View.OnClickListener {
	
	private ImageView nailIv;
	private TextView nailTv;
	private View view;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_top);
		nailIv = (ImageView) findViewById(R.id.im_nail);
		nailTv = (TextView) findViewById(R.id.tv_nail);
		nailIv.setOnClickListener(this);
		nailTv.setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		if (view.equals(nailTv) || view.equals(nailIv)) {
			Intent intent = new Intent(this, NailCategoryActivity.class);
			startActivity(intent);
		}
	}

}
