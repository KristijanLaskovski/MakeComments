package com.example.makecoments;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class custumAdapter extends ArrayAdapter<Komentar>{

	public custumAdapter(Context context, List<Komentar>  lista) {
		super(context,R.layout.costumview, lista);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		
		LayoutInflater linflater=LayoutInflater.from(getContext());
		View custumView=linflater.inflate(R.layout.costumview,parent,false);
		Komentar comment=getItem(position);
		TextView name=(TextView)custumView.findViewById(R.id.TVname);
		TextView lastname=(TextView)custumView.findViewById(R.id.TVlastnmae);
		TextView time=(TextView)custumView.findViewById(R.id.TVtime);
		TextView commentar=(TextView)custumView.findViewById(R.id.TVComment);
		
		ImageView profilePhoto=(ImageView)custumView.findViewById(R.id.imageView1);
		profilePhoto.setImageResource(R.drawable.kikko);
		
		 name.setText(comment.getFirstName());
		 lastname.setText(comment.getLastName());
		 time.setText(comment.getTime());
		 commentar.setText(comment.getComment());
		 
		
		
		return custumView;
	
	}

	
	
	
}
