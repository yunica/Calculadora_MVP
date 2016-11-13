package junior.dominio.calculadora_mvp.Interfaces;

/**
 * Created by Junior on 13/11/2016.
 */
public interface MainPresenter {
    void operacion(String numerOne, String numberTwo);
    void showErrorPresenter(String error);
    void  ShowSuccesPresenter (String valor);

}
