package com.scanner.demo;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by harsh on 02/18/17.
 */
public class ScannedImage extends Fragment {
    View v;
    private ImageView scannedImageView;
    Bitmap bitmapimage;
    public ScannedImage(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.scannedimage, container, false);
        scannedImageView = (ImageView) v.findViewById(R.id.scannedImage);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            bitmapimage = bundle.getParcelable("BitmapImage");
        }
        scannedImageView.setImageBitmap(bitmapimage);
        return v;
    }

}
