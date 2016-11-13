package junior.dominio.calculadora_mvp.Interactor;

import junior.dominio.calculadora_mvp.Interfaces.MainInteractor;
import junior.dominio.calculadora_mvp.Interfaces.MainPresenter;

/**
 * Created by Junior on 13/11/2016.
 */
public class MainInteractorImpl implements MainInteractor {
    private MainPresenter mainPresenter;
    public MainInteractorImpl (MainPresenter mainPresenter){
        this.mainPresenter = mainPresenter;
    }
    @Override
    public void SumaInteractor(String fist, String second) {
        if (fist.equals("") && second.equals("")){
            mainPresenter.showErrorPresenter("Los campos estan vacios");
        }else{
            if(fist.equals("")){
                mainPresenter.showErrorPresenter("El Primer campo esta vacio");
            }else{
                if(second.equals("")){
                    mainPresenter.showErrorPresenter("El Segundo campo esta vacio");
                }else{

                    Double suma = Double.valueOf(fist)+ Double.valueOf(second);
                    mainPresenter.ShowSuccesPresenter(String.valueOf(suma));
                }
            }
        }
    }
}
