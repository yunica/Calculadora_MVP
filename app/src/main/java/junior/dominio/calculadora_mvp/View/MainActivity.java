package junior.dominio.calculadora_mvp.View;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import junior.dominio.calculadora_mvp.Interfaces.MainPresenter;
import junior.dominio.calculadora_mvp.Interfaces.MainView;
import junior.dominio.calculadora_mvp.Presenter.MainPresenterImpl;
import junior.dominio.calculadora_mvp.R;

public class MainActivity extends AppCompatActivity implements MainView  {

    private EditText edtxt_firt, edtxt_secont;
    private TextView txtResultado;
    private Button btnSumar;
    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtxt_firt      = (EditText) findViewById(R.id.edtxtFirst);
        edtxt_secont    = (EditText) findViewById(R.id.edtxtSecond);
        txtResultado    = (TextView) findViewById(R.id.txtResultado);
        btnSumar        = (Button)   findViewById(R.id.btnSumar);
        mainPresenter = new MainPresenterImpl(this);
    }


    @Override
    public void showSucces(String result) {
        txtResultado.setTextColor(Color.parseColor("#1039ed"));
        txtResultado.setText(result);
    }

    @Override
    public void showError(String error) {
        txtResultado.setTextColor(Color.parseColor("#f54968"));
        txtResultado.setText(error);
    }
    public void Sumar (View view){
        //Mandar llamar un metodo del presentador,  el interactor tiene toda la logica
        mainPresenter.operacion(edtxt_firt.getText().toString(), edtxt_secont.getText().toString());

    }
}
