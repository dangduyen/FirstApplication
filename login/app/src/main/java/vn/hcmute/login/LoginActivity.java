package vn.hcmute.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    CheckBox chkRemember;
    EditText edtUsername, edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        chkRemember = findViewById(R.id.chkRemember);
        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);

    }

    public void btnLoginClick(View view) {
        if (edtUsername.getText().toString().equals("")) {
            Toast.makeText(LoginActivity.this, "Ban chua nhap username", Toast.LENGTH_LONG).show();
            return;
        }

        if (edtPassword.getText().toString().equals("")) {
            Toast.makeText(LoginActivity.this, "Ban chua nhap password", Toast.LENGTH_LONG).show();
            return;
        }

        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
    }
}