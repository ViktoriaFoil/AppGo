package com.example.myappgo.ui.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("ПРАВИЛА ИГРЫ ГО. " + "\n"
                + "\n" + "Правило хода."
                + "\n" +"Ход – это постановка камня на одно из пересечений вертикальных и горизонтальных линий. Ходы делаются по очереди! После совершения хода камень запрещено передвигать! " + "\n"
                + "\n" +"2. Правило захвата камней."
                + "\n" +"Камни, у которых нет свободных пунктов (дамэ) немедленно удаляются с игрового поля!"  + "\n"
                + "\n" +"3. Правило запрещённых ходов."
                + "\n" + "Запрещено делать “самоубийственные” ходы. Запрещено повторять позицию (правило ко)."  + "\n"
                + "\n" + "Цель игры:"
                + "\n" +"Разыграть  всё  игровое  поле  и  набрать  больше  очков,  чем соперник.  Очки  начисляются  за  каждый  захваченный  камень противника и за каждый окружённый пункт территории.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}