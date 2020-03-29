package imageloader.dropdevelopers.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import imageloader.dropdevelopers.imageloader.ImageLoader;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.im_view);

        new ImageLoader(imageView)
                .execute("https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
    }
}
