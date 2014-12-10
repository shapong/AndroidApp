package com.example.mythirdapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class NewSuggest extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_suggest);
		
		// Get a reference to the AutoCompleteTextView in the layout
		AutoCompleteTextView textView = (AutoCompleteTextView) findViewById(R.id.suggest_entity);
		
		// Get the string array
		String[] movies = getResources().getStringArray(R.array.movies_arr);
		
		// Create the adapter and set it to the AutoCompleteTextView 
		ArrayAdapter<String> adapter =
		        new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, movies);
		textView.setAdapter(adapter);
		
	}
	
	
	

}
