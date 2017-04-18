package com.example.lesson6;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

public class Nail extends AppCompatActivity {

	private int nameId;
	private int descriptionId;
	private int imageResourceId;

	// Для каждой услуги ногтевого сервиса хранится название, описание и ресурс изображения
	private Nail(int name, int description, int imageResourceId) {
		this.nameId = name;
		this.descriptionId = description;
		this.imageResourceId = imageResourceId;
	}

	public int getNameId() {
		return nameId;
	}

	public int getDescriptionId() {
		return descriptionId;
	}

	public int getImageResourceId() {
		return imageResourceId;
	}

	@Override
	public String toString() {
		Context context = getApplicationContext();
		return context.getResources().getString(nameId);
	}

	// nails - массив с элементами Nail
	public static final Nail[] nails = {
			new Nail(R.string.kl_man,
					R.string.kl_man_op,
					R.drawable.kl_man),
			new Nail(R.string.ap_man,
					R.string.ap_man_op,
					R.drawable.ap_man),
			new Nail(R.string.ap_ped,
					R.string.ap_ped_op,
					R.drawable.ap_ped)};

}