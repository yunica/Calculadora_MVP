package junior.dominio.calculadora_mvp.Presenter;

import junior.dominio.calculadora_mvp.Interactor.MainInteractorImpl;
import junior.dominio.calculadora_mvp.Interfaces.MainInteractor;
import junior.dominio.calculadora_mvp.Interfaces.MainPresenter;
import junior.dominio.calculadora_mvp.Interfaces.MainView;

/**
 * Created by Junior on 13/11/2016.
 */
public class MainPresenterImpl implements MainPresenter {
    private MainView   mainView;
    private MainInteractor mainInteractor;

    public MainPresenterImpl (MainView mainView){
        this.mainView = mainView;
        mainInteractor = new MainInteractorImpl(this);
    }
    @Override
    public void operacion(String numerOne, String numberTwo) {
        if (mainView != null){
            mainInteractor.SumaInteractor(numerOne,numberTwo);
        }

    }

    @Override
    public void showErrorPresenter(String error) {
        if (mainView != null){
            mainView.showError(error);
        }
    }

    @Override
    public void ShowSuccesPresenter(String valor) {
        if (mainView != null){
            mainView.showSucces(valor);
        }
    }
}
