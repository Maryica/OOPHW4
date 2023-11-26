package data;

import java.util.Comparator;

/**
 * Принцип единственной ответственности (Single Responsibility Principle)
 * реализуется в классе UserComaporator (выполнение одной функции для сравнения
 * 2х объектов)
 * 
 */
public class UserComaporator<T extends User> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
            if (resultOfComparing == 0) {
                return o1.getLastName().compareTo(o2.getLastName());
            } else {
                return resultOfComparing;
            }
        } else {
            return resultOfComparing;
        }
    }
}