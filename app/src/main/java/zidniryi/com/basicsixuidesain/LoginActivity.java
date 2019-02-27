package zidniryi.com.basicsixuidesain;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.btnlg1)
    Button btnlg1;
    @BindView(R.id.btnrg1)
    Button btnrg1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btnlg1, R.id.btnrg1})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnlg1:
                startActivity(new Intent(LoginActivity.this, ProfilActivity.class));
                break;
            case R.id.btnrg1:
                break;
        }
    }
}
