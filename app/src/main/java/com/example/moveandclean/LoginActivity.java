package com.example.moveandclean;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private EditText editTextEmail, editTextPassword;
    private Button btnLogin, btnGoogleLogin, btnFacebookLogin;
    private TextView tvRegister, tvForgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initializeViews();
        setupClickListeners();
    }

    private void initializeViews() {
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnGoogleLogin = findViewById(R.id.btnGoogleLogin);
        btnFacebookLogin = findViewById(R.id.btnFacebookLogin);
        tvRegister = findViewById(R.id.tvRegister);
        tvForgotPassword = findViewById(R.id.tvForgotPassword);
    }

    private void setupClickListeners() {
        btnLogin.setOnClickListener(v -> handleLogin());
        tvRegister.setOnClickListener(v -> startActivity(new Intent(this, RegisterActivity.class)));
        btnGoogleLogin.setOnClickListener(v -> handleGoogleLogin());
        btnFacebookLogin.setOnClickListener(v -> handleFacebookLogin());
        tvForgotPassword.setOnClickListener(v -> handleForgotPassword());
    }

    private void handleLogin() {
        String email = editTextEmail.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();
        
        // TODO: Implement login logic
        startActivity(new Intent(this, HomeActivity.class));
    }

    private void handleGoogleLogin() {
        // TODO: Implement Google login
    }

    private void handleFacebookLogin() {
        // TODO: Implement Facebook login
    }

    private void handleForgotPassword() {
        // TODO: Implement forgot password
    }
}
