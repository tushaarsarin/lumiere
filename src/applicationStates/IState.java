package applicationStates;

import presenters.IStatePresenter;

public interface IState {
    void loop();
    void keyPressEvents(int keyCode);
    void keyReleaseEvents(int keyCode);
    IStatePresenter getPresenter();
}
