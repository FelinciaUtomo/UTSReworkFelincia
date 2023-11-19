package id.ac.petra.utsreworkfelincia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {

    private EditText UsernameField;
    private EditText PasswordField;
    private Button LoginButton;
    private String[] validUsernames = {"user1", "user2", "user3"};
    private String[] validPasswords = {"pass1", "pass2", "pass3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        UsernameField = findViewById(R.id.EditTextTask);
        PasswordField = findViewById(R.id.passwordField);
        LoginButton = findViewById(R.id.LoginButton);

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = UsernameField.getText().toString();
                String password = PasswordField.getText().toString();

                boolean Valid = false;
                for (int i = 0; i < validUsernames.length; i++){
                    if (username.equals(validUsernames[i]) && password.equals(validPasswords[i])) {
                        Valid = true;
                        break;
                    }
                }

                if (Valid){
                    Toast.makeText(Login_Activity.this,"Log in berhasil",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Login_Activity.this,"Username atau Password salah",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}