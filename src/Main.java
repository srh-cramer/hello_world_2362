void main() {
    int number; // Deklaration: Namen und Datentyp der Variable festlegen
    number = 777;   // Initialisierung mithilfe des Zuweisungsoperators
    //IO.println(number);
    number = 3;
    IO.println(number);

    float floatingNumber = 17.5f;   // Deklaration & Initialisierung
    IO.println(floatingNumber);

    byte byteNumber = 17;
    IO.println(byteNumber);

    short cherry = 13000;
    IO.println(cherry);

    long bigNumber = 10000000000000L;
    IO.println(bigNumber);

    double doubleNumber = 1.53465754;
    IO.println(doubleNumber);

    char cheese;    //Variable deklariert
    cheese = 'x';   // initialisiert
    IO.println(cheese);

    char pizza = 'P';
    IO.println(pizza);

    boolean isRainy;
    isRainy = false;
    IO.println(isRainy);
    isRainy = true;
    IO.println(isRainy);
    isRainy = false;
    IO.println(isRainy);

    //println = print line
    IO.println("2362 und 2462 sind eine tolle Gruppe!");

    for (int i = 1; i <= 5; i++) {
        IO.println("i = " + i);
    }
}
