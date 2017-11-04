package cse120project.catplan;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUp extends AppCompatActivity implements View.OnClickListener{
    private EditText edituserName;
    private EditText editpassword;
    private EditText editrepassword;
    private Button btnsignIn;

    private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        firebaseAuth = FirebaseAuth.getInstance();

        edituserName = (EditText) findViewById(R.id.editTextUsername);
        editpassword = (EditText) findViewById(R.id.editTextPassword);
        editrepassword = (EditText) findViewById(R.id.editTextRePassword);
        btnsignIn = (Button) findViewById(R.id.buttonSignUp);

        btnsignIn.setOnClickListener(this);
    }
    private void registerUser()
    {
        String username = edituserName.getText().toString().trim();
        String password = editpassword.getText().toString().trim();

        if(TextUtils.isEmpty(username))
        {
            Toast.makeText(this,"Enter Username", Toast.LENGTH_SHORT).show();
            return;
        }

        if(TextUtils.isEmpty(password)) {
            Toast.makeText(this, "Enter Password", Toast.LENGTH_SHORT).show();
            return;
        }

        firebaseAuth.createUserWithEmailAndPassword(username,password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (editpassword == editrepassword) {
                            if (task.isSuccessful()) {
                                Toast.makeText(SignUp.this, "Registered Sucess", Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            Toast.makeText(SignUp.this, "Could not Register, Please Reenter Password", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
    @Override
    public void onClick(View view) {
        if(view == btnsignIn)
        {
            registerUser();
        }
    }
}
