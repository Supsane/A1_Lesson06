package com.example.lesson6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class NailActivity extends AppCompatActivity {

	public static final String EXTRA_NAILNOM = "nailNom";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_nail);
		// Получить вид услуги ногтевого сервиса
		Bundle bundle = getIntent().getExtras();
		if (bundle != null) {
			int nailNom = bundle.getInt(EXTRA_NAILNOM);
			Nail nail = Nail.nails[nailNom];
			Log.d("NailActivity", "nailNom " + nailNom);
			Log.d("NailActivity", "nail " + nail.getNameId());
			Log.d("NailActivity", "nailNom " + nail.getDescriptionId());
			Log.d("NailActivity", "nailNom " + nail.getImageResourceId());
			// Заполнить ихображение услуги ногтевого сервиса
			ImageView photo = (ImageView) findViewById(R.id.photo);
			photo.setImageResource(nail.getImageResourceId());
			photo.setContentDescription(getString(nail.getNameId()));

			// Заполнение наименования услуги ногтевого сервиса
			TextView name = (TextView) findViewById(R.id.name);
			name.setText(getString(nail.getNameId()));

			// Заполнение описания услуги ногтевого сервиса
			TextView description = (TextView) findViewById(R.id.description);
			description.setText(getString(nail.getDescriptionId()));
		}
	}

}
