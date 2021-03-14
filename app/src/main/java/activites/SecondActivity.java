package activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.testrandomusers.R;
import com.squareup.picasso.Picasso;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setTitle("Second Activity");


        Intent intent = getIntent();
        if(intent != null) {

            String imageURL = intent.getStringExtra("imageAvatar");
            String name = intent.getStringExtra("name");

            ImageView photoImageView = findViewById(R.id.photoImageView);
            TextView nameTextView = findViewById(R.id.detailTextView);

            Picasso.get().load(imageURL).fit().centerInside().into(photoImageView);
            nameTextView.setText(name);
        }



        }
    }
