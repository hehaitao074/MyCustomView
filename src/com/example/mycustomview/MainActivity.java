package com.example.mycustomview;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

public class MainActivity extends Activity {

	private final static String TAG = "MainActivity";
	private CustomView mycustomview;
	private MyLoveView loveView;
	private MultiCricleView MultiCricleView;
	private SimpleTagImageView mSimpleTagImageView;
	private PageTurnView pageTurnView;
	private List<Bitmap> bitmaps;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// setContentView(R.layout.activity_main);
		// mycustomview = (CustomView) findViewById(R.id.mycustomview);
		// /*
		// * 开线程
		// */
		// new Thread(mycustomview).start();

		// this.loveView = new MyLoveView(this);
		// setContentView(loveView);

		setContentView(R.layout.activity_main);
		pageTurnView = (PageTurnView) findViewById(R.id.pageTurnView);
		bitmaps = new ArrayList<Bitmap>();
		// 获取位图
		Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(), R.drawable.s1);
		Bitmap bitmap2 = BitmapFactory.decodeResource(this.getResources(), R.drawable.s2);
		Bitmap bitmap3 = BitmapFactory.decodeResource(this.getResources(), R.drawable.s3);
		Bitmap bitmap4 = BitmapFactory.decodeResource(this.getResources(), R.drawable.s4);
		Bitmap bitmap5 = BitmapFactory.decodeResource(this.getResources(), R.drawable.s5);
		
		bitmaps.add(bitmap);
		bitmaps.add(bitmap2);
		bitmaps.add(bitmap3);
		bitmaps.add(bitmap4);
		bitmaps.add(bitmap5);
		pageTurnView.setBitmaps(bitmaps);
		// MultiCricleView = (MultiCricleView) findViewById(R.id.mycustomview);

		// mSimpleTagImageView = (SimpleTagImageView) findViewById(R.id.stiv);
		// setUpTextSizeSeekBar();
		// setUpCornerDistanceSeekBar();
		// setUpTextColorSpinner();
		// setUpTextTag();
		// setUpTagBackgroundColor();
		// setUpTagWidth();
		// setUpTagOrientation();
		// setUpTagRoundRadius();
		// setUpScaleType();

	}

	// private void setUpTextSizeSeekBar() {
	// SeekBar mTextSizeSeekBar = (SeekBar) findViewById(R.id.sb_text_size);
	// mTextSizeSeekBar
	// .setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
	// @Override
	// public void onProgressChanged(SeekBar seekBar,
	// int progress, boolean fromUser) {
	// Log.d(TAG, "progress:" + progress);
	// mSimpleTagImageView.setTagTextSize(progress);
	// }
	//
	// @Override
	// public void onStartTrackingTouch(SeekBar seekBar) {
	//
	// }
	//
	// @Override
	// public void onStopTrackingTouch(SeekBar seekBar) {
	//
	// }
	// });
	// }
	//
	// private void setUpCornerDistanceSeekBar() {
	// SeekBar mCornerDistanceSeekBar = (SeekBar)
	// findViewById(R.id.sb_corner_distance);
	// mCornerDistanceSeekBar
	// .setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
	// @Override
	// public void onProgressChanged(SeekBar seekBar,
	// int progress, boolean fromUser) {
	// mSimpleTagImageView.setCornerDistance(progress);
	// }
	//
	// @Override
	// public void onStartTrackingTouch(SeekBar seekBar) {
	//
	// }
	//
	// @Override
	// public void onStopTrackingTouch(SeekBar seekBar) {
	//
	// }
	// });
	// }
	//
	// private void setUpTextColorSpinner() {
	// final Map<String,Integer> colors = new LinkedHashMap<String, Integer>();
	// colors.put("WHITE",Color.WHITE);
	// colors.put("RED",Color.RED);
	// colors.put("BLUE",Color.BLUE);
	// colors.put("CYAN",Color.CYAN);
	// colors.put("YELLOW",Color.YELLOW);
	// Spinner mSpinner = (Spinner) findViewById(R.id.spinner_text_color);
	// final Object [] keys = colors.keySet().toArray();
	// final SpinnerAdapter mAdapter = new ArrayAdapter<Object>(this,
	// android.R.layout.simple_list_item_1,keys);
	// mSpinner.setAdapter(mAdapter);
	// mSpinner.setOnItemSelectedListener(new
	// AdapterView.OnItemSelectedListener() {
	// @Override
	// public void onItemSelected(AdapterView<?> parent, View view, int
	// position, long id) {
	// String key = (String) keys[position];
	// mSimpleTagImageView.setTagTextColor(colors.get(key));
	// }
	//
	// @Override
	// public void onNothingSelected(AdapterView<?> parent) {
	//
	// }
	// });
	// }
	//
	// private void setUpTextTag() {
	// EditText mEt = (EditText) findViewById(R.id.tv);
	// mEt.addTextChangedListener(new TextWatcher() {
	// @Override
	// public void beforeTextChanged(CharSequence s, int start, int count,
	// int after) {
	//
	// }
	//
	// @Override
	// public void onTextChanged(CharSequence s, int start, int before,
	// int count) {
	//
	// }
	//
	// @Override
	// public void afterTextChanged(Editable s) {
	// mSimpleTagImageView.setTagText(s.toString());
	// }
	// });
	// }
	//
	// private void setUpTagBackgroundColor(){
	// final Map<String,Integer> colors = new LinkedHashMap<String, Integer>();
	// colors.put("Green",0xaf27CDC0);
	// colors.put("RED",Color.RED);
	// colors.put("BLUE",Color.BLUE);
	// colors.put("CYAN",Color.CYAN);
	// colors.put("YELLOW",Color.YELLOW);
	// Spinner mSpinner = (Spinner) findViewById(R.id.spinner_background_color);
	// final Object [] keys = colors.keySet().toArray();
	// final SpinnerAdapter mAdapter = new ArrayAdapter<Object>(this,
	// android.R.layout.simple_list_item_1,keys);
	// mSpinner.setAdapter(mAdapter);
	// mSpinner.setOnItemSelectedListener(new
	// AdapterView.OnItemSelectedListener() {
	// @Override
	// public void onItemSelected(AdapterView<?> parent, View view, int
	// position, long id) {
	// String key = (String) keys[position];
	// mSimpleTagImageView.setTagBackgroundColor(colors.get(key));
	// }
	//
	// @Override
	// public void onNothingSelected(AdapterView<?> parent) {
	//
	// }
	// });
	// }
	//
	// private void setUpTagWidth() {
	// SeekBar mTagWidthSeekBar = (SeekBar) findViewById(R.id.sb_tag_width);
	// mTagWidthSeekBar
	// .setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
	// @Override
	// public void onProgressChanged(SeekBar seekBar,
	// int progress, boolean fromUser) {
	// mSimpleTagImageView.setTagWidth(progress);
	// }
	//
	// @Override
	// public void onStartTrackingTouch(SeekBar seekBar) {
	//
	// }
	//
	// @Override
	// public void onStopTrackingTouch(SeekBar seekBar) {
	//
	// }
	// });
	// }
	//
	// private void setUpTagOrientation() {
	// final Map<String,Byte> orientations = new LinkedHashMap<String, Byte>();
	// orientations.put("LEFT_TOP",SimpleTagImageView.LEFT_TOP);
	// orientations.put("RIGHT_TOP",SimpleTagImageView.RIGHT_TOP);
	// orientations.put("LEFT_BOTTOM",SimpleTagImageView.LEFT_BOTTOM);
	// orientations.put("RIGHT_BOTTOM",SimpleTagImageView.RIGHT_BOTTOM);
	// Spinner mSpinner = (Spinner) findViewById(R.id.spinner_tag_orientation);
	// final Object [] keys = orientations.keySet().toArray();
	// final SpinnerAdapter mAdapter = new ArrayAdapter<Object>(this,
	// android.R.layout.simple_list_item_1,keys);
	// mSpinner.setAdapter(mAdapter);
	// mSpinner.setOnItemSelectedListener(new
	// AdapterView.OnItemSelectedListener() {
	// @Override
	// public void onItemSelected(AdapterView<?> parent, View view, int
	// position, long id) {
	// String key = (String) keys[position];
	// mSimpleTagImageView.setTagOrientation(orientations.get(key));
	// }
	//
	// @Override
	// public void onNothingSelected(AdapterView<?> parent) {
	//
	// }
	// });
	// }
	//
	// @Override
	// protected void onSaveInstanceState(Bundle outState) {
	// super.onSaveInstanceState(outState);
	// if (outState != null) {
	// outState.putString("tag_text", mSimpleTagImageView.getTagText());
	// }
	// }
	//
	// @Override
	// protected void onRestoreInstanceState(Bundle savedInstanceState) {
	// super.onRestoreInstanceState(savedInstanceState);
	// if (savedInstanceState != null) {
	// mSimpleTagImageView.setTagText(savedInstanceState
	// .getString("tag_text"));
	// }
	// }
	//
	// private void setUpTagRoundRadius() {
	// SeekBar mTextSizeSeekBar = (SeekBar)
	// findViewById(R.id.sb_tag_round_radius);
	// mTextSizeSeekBar
	// .setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
	// @Override
	// public void onProgressChanged(SeekBar seekBar,
	// int progress, boolean fromUser) {
	// mSimpleTagImageView.setTagRoundRadius(progress);
	// }
	//
	// @Override
	// public void onStartTrackingTouch(SeekBar seekBar) {
	//
	// }
	//
	// @Override
	// public void onStopTrackingTouch(SeekBar seekBar) {
	//
	// }
	// });
	// }
	//
	// private void setUpScaleType() {
	// Spinner mSpinner = (Spinner) findViewById(R.id.spinner_tag_scale_type);
	// // final ImageView.ScaleType [] types = ImageView.ScaleType.values();
	// final ImageView.ScaleType [] types = {ImageView.ScaleType.FIT_XY};
	// final SpinnerAdapter mAdapter = new ArrayAdapter<ScaleType>(this,
	// android.R.layout.simple_list_item_1, types);
	// mSpinner.setAdapter(mAdapter);
	// mSpinner.setOnItemSelectedListener(new
	// AdapterView.OnItemSelectedListener() {
	// @Override
	// public void onItemSelected(AdapterView<?> parent, View view, int
	// position, long id) {
	// Log.d(TAG,types[position].toString());
	// mSimpleTagImageView.setScaleType(types[position]);
	// }
	//
	// @Override
	// public void onNothingSelected(AdapterView<?> parent) {
	//
	// }
	// });
	// }
}
