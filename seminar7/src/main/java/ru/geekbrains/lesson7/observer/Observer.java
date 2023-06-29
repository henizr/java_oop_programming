package ru.geekbrains.lesson7.observer;

import java.util.List;

public interface Observer extends Utility {

    boolean receiveOffer(Vacancy vacancy);

}
