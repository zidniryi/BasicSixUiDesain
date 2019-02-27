package zidniryi.com.basicsixuidesain;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ChatActivity extends AppCompatActivity {

    @BindView(R.id.textOutput)
    TextView textOutput;
    @BindView(R.id.textInput)
    EditText textInput;
    @BindView(R.id.btnSend)
    Button btnSend;
    @BindView(R.id.linearLayout1)
    LinearLayout linearLayout1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnSend)
    public void onViewClicked() {
    }
}
