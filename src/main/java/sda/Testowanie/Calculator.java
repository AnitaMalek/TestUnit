package sda.Testowanie;



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
    if (liczba1==0 || liczba2==0 ) {
// opcja1:
       throw new ArithmeticException("Zła wartość!!!");
// opcja2:
// throw new IllegalArgumentException("Dzielisz przez 0!!");
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
