package main.wiz.quicktax.Activities;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.InputStream;

import main.wiz.quicktax.R;

public class ImagePickActivity extends Activity {
    private static final int REQUEST_CODE = 1;
    private Bitmap bitmap;
    private ImageView imageView;
    private Button btnTakepicture;
    private Button btnGallerypicture;
    static final int REQUEST_IMAGE_CAPTURE = 2;
    private EditText edtCategory;
    private String Category;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_pick);
        imageView = (ImageView) findViewById(R.id.result);
        btnTakepicture=(Button)findViewById(R.id.captureActual);
        btnGallerypicture=(Button)findViewById(R.id.captureFront);
        edtCategory=(EditText)findViewById(R.id.edtCategory);


        Intent intent= getIntent();
        Category=intent.getStringExtra("KEY_CATEGORY");
        edtCategory.setText(Category+"");


    }

    public void onClick(View View) {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        startActivityForResult(intent, REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        InputStream stream = null;
        if (requestCode == REQUEST_CODE && resultCode == Activity.RESULT_OK)
            try {
                // recyle unused bitmaps
                if (bitmap != null) {
                    bitmap.recycle();
                }
                stream = getContentResolver().openInputStream(data.getData());
                bitmap = BitmapFactory.decodeStream(stream);

                imageView.setImageBitmap(bitmap);
                btnTakepicture.setVisibility(View.GONE);
                btnGallerypicture.setVisibility(View.GONE);
            } catch (Exception e) {
                Toast.makeText(this, "No camera on this device", Toast.LENGTH_LONG)
                        .show();
            }


        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            imageView.setImageBitmap(imageBitmap);
        }
        }


    public void onCapture(View view) {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }




    }
