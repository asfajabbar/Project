package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
public class Login extends AppCompatActivity {

    Button Btn;
    Button Btn1;
    FirebaseAuth firebaseAuth;
    private DatabaseReference mDatabase;
    String Name;
    private FirebaseAuth.AuthStateListener authStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        FirebaseApp.initializeApp(this);

        firebaseAuth = FirebaseAuth.getInstance();

        Btn=findViewById(R.id.login_btn);
        Btn1=findViewById(R.id.signUp_btn);


        Btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {


                EditText Username = findViewById(R.id.email_login);
                EditText Pass = findViewById(R.id.password_login);
                String userEmail = Username.getText().toString();
                String userPaswd = Pass.getText().toString();
                if (userEmail.isEmpty())
                {
                    Username.setError("Provide your Email first!");
                    Username.requestFocus();
                }
                else if (userPaswd.isEmpty())
                {
                    Pass.setError("Enter Password!");
                    Pass.requestFocus();
                } else if (userEmail.isEmpty() && userPaswd.isEmpty())
                {
                    Toast.makeText(Login.this, "Fields Empty!", Toast.LENGTH_SHORT).show();
                }
                else if (!(userEmail.isEmpty() && userPaswd.isEmpty()))
                {
                    firebaseAuth.signInWithEmailAndPassword(userEmail, userPaswd).addOnCompleteListener(Login.this, new OnCompleteListener()
                    {
                        @Override
                        public void onComplete(@NonNull Task task) {
                            if (!task.isSuccessful()) {
                                Toast.makeText(Login.this, "Not successful", Toast.LENGTH_SHORT).show();
                            }
                            else {
                                mDatabase = FirebaseDatabase.getInstance().getReference().child("Users");
                                mDatabase.addValueEventListener(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                                        Name = dataSnapshot.child(firebaseAuth.getUid()).getValue(String.class);
                                        Intent in = new Intent(getApplicationContext(), BMI_Calculator.class);
                                        in.putExtra("username", Name);
                                        startActivity(in);
                                    }

                                    @Override
                                    public void onCancelled(@NonNull DatabaseError databaseError) {
                                        Toast.makeText(Login.this, "Error:" + databaseError.getMessage().toString(), Toast.LENGTH_SHORT).show();
                                    }
                                });
                            }
                        }
                    });
                } else {
                    Toast.makeText(Login.this, "Error", Toast.LENGTH_SHORT).show();
                }




            }
        }
        );
    }



}
