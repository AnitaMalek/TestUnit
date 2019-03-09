package sda;



public class Calculator {


public int dodawanie(int liczba1, int liczba2) {
    return liczba1 + liczba2;
}

public int odejmowanie(int liczba1, int liczba2) {
    return liczba1 - liczba2;
}

public int mnozenie (int liczba1, int liczba2) {
    return liczba1 * liczba2;
}

// dzielenie:

public double divide (double liczba1, double liczba2) {
    if (liczba2==0) {

    }
    return liczba1 / liczba2;
}

public int silnia(int i) {
        if (i < 1)
            return 1;
        else
            return i * silnia(i - 1);
    }



}
