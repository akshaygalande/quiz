package admin.comlab.com.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    StringBuilder rght = new StringBuilder();
    Integer score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submit=findViewById(R.id.sub);
        final TextView ans=findViewById(R.id.wrng);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(rght.toString());
                ans.setText("Total score-"+score.toString());

            }
        });
    }

    public void click(View view) {
        //StringBuilder rght = new StringBuilder();
        StringBuilder wrng = new StringBuilder();
        Boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.pune:
                if (checked)

                    break;
            case R.id.mumbai:
                if (checked)

                    break;
            case R.id.baramati:
                if (checked)
                    rght.append("Question 1,");
                score++;
                break;
            case R.id.pyt:
                if (checked)

                    break;
            case R.id.java:
                if (checked)

                    break;
            case R.id.android:
                if (checked)
                    rght.append("Question 2,");
                score++;
                break;
            case R.id.parent:
                if (checked)

                    break;
            case R.id.marks:
                if (checked)

                    break;
            case R.id.knw:
                if (checked)
                    rght.append("Question 3,");
                score++;
                break;
            case R.id.cb:
                if (checked)

                    break;
            case R.id.espn:
                if (checked)

                    break;
            case R.id.sfi:
                if (checked)
                    rght.append("Question 4,");
                score++;
                break;
            case R.id.sc:
                if (checked)

                    break;
            case R.id.baseball:
                if (checked)

                    break;
            case R.id.cric:
                if (checked)
                    rght.append("Question 5,");
                score++;
                break;
        }

    }
}
