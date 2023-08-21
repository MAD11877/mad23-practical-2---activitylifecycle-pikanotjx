package sg.edu.np.mad.madpractical;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializes a dummy user
        user = new User("MAD", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", 1, false);

        // Changes the TextView values
        TextView name = findViewById(R.id.nameTextView);
        TextView description = findViewById(R.id.descriptionTextView);
        name.setText(user.name);
        description.setText(user.description);
//        name.setText(user.getName());
//        description.setText(user.getDescription());

        // Creates and sets event listeners for the buttons
        Button followButton = findViewById(R.id.followButton);
        followButton.setOnClickListener(v -> {
            user.followed = !user.followed;
            followButton.setText(user.followed ? "Unfollow" : "Follow");
//            user.setFollowed(!user.isFollowed());
//            followButton.setText(user.isFollowed() ? "Unfollow" : "Follow");
        });
    }
}