package main.wiz.quicktax.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import main.wiz.quicktax.R;

public class CategoryActivity extends AppCompatActivity {

    private ImageView imgSupplies;
    private ImageView imgUtilities;
    private ImageView imgPayments;
    private ImageView imgFood;
    private ImageView imgTravel;
    private TextView txtSupplies;
    private TextView txtUtilities;
    private TextView txtPayments;
    private TextView txtFood;
    private TextView txtTravel;
    private EditText edtCategory;
    private AppBarLayout app_bar;
    private ImageView btnaddPhoto;

    ///// VARIABLES ////////////////////////////////////
    String category;

    ///////////////////////////////////////////////////

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        imgSupplies=(ImageView)findViewById(R.id.iconSupplies);
        imgUtilities=(ImageView)findViewById(R.id.iconUtilities);
        imgPayments=(ImageView)findViewById(R.id.iconPayments);
        imgFood=(ImageView)findViewById(R.id.iconFood);
        imgTravel=(ImageView)findViewById(R.id.iconTravel);
        txtSupplies=(TextView)findViewById(R.id.txtSupplies);
        txtUtilities=(TextView)findViewById(R.id.txtUtilities);
        txtPayments=(TextView)findViewById(R.id.txtPayments);
        txtFood=(TextView)findViewById(R.id.txtFood);
        txtTravel=(TextView)findViewById(R.id.txtTravel);
        app_bar=(AppBarLayout) findViewById(R.id.app_bar);
        edtCategory=(EditText)findViewById(R.id.edtCategory);
        btnaddPhoto=(ImageView)findViewById(R.id.btnAddPhoto);


        imgSupplies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                category="Supplies";
                app_bar.setExpanded(false);
//                imgTravel.setVisibility(View.GONE);
//                txtTravel.setVisibility(View.GONE);
                edtCategory.setText(category+"");
            }
        });

        txtSupplies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                category="Supplies";
                app_bar.setExpanded(false);
//                imgTravel.setVisibility(View.GONE);
//                txtTravel.setVisibility(View.GONE);
                edtCategory.setText(category+"");
            }
        });

        imgUtilities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                category="Utilities";
                app_bar.setExpanded(false);
//                imgTravel.setVisibility(View.GONE);
//                txtTravel.setVisibility(View.GONE);
                edtCategory.setText(category+"");
            }
        });

        txtUtilities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                category="Utilities";
                app_bar.setExpanded(false);
//                imgTravel.setVisibility(View.GONE);
//                txtTravel.setVisibility(View.GONE);
                edtCategory.setText(category+"");
            }
        });

        imgPayments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                category="Payments";
                app_bar.setExpanded(false);
//                imgTravel.setVisibility(View.GONE);
//                txtTravel.setVisibility(View.GONE);
                edtCategory.setText(category+"");
            }
        });

        txtPayments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                category="Payments";
                app_bar.setExpanded(false);
//                imgTravel.setVisibility(View.GONE);
//                txtTravel.setVisibility(View.GONE);
                edtCategory.setText(category+"");
            }
        });

        imgFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                category="Food";
                app_bar.setExpanded(false);
//                imgTravel.setVisibility(View.GONE);
//                txtTravel.setVisibility(View.GONE);
                edtCategory.setText(category+"");
            }
        });

        txtFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                category="Food";
                app_bar.setExpanded(false);
//                imgTravel.setVisibility(View.GONE);
//                txtTravel.setVisibility(View.GONE);
                edtCategory.setText(category+"");
            }
        });

        imgTravel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                category="Travel";
                app_bar.setExpanded(false);
//                imgTravel.setVisibility(View.GONE);
//                txtTravel.setVisibility(View.GONE);
                edtCategory.setText(category+"");
            }
        });

        txtTravel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                category="Travel";
                app_bar.setExpanded(false);
//                imgTravel.setVisibility(View.GONE);
//                txtTravel.setVisibility(View.GONE);
                edtCategory.setText(category+"");
            }
        });



        btnaddPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(CategoryActivity.this,ImagePickActivity.class);
                intent.putExtra("KEY_CATEGORY",category);
                startActivity(intent);


            }
        });





    }



    /////////////// PRINTERS /////////////////////////////////////////////////

    public void showToast(String msg) {
        Toast.makeText(CategoryActivity.this, msg, Toast.LENGTH_LONG).show();
    }




    //////////////////////////////////////////////////////////////////////////
}
