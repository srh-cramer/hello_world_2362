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

    double result = 2 + 1.2;
    IO.println(result);

    int a = 3;
    int b = 5;
    int c = a * b - 2; // Wert?
    //          5 / 3
    int d = b / a; // Wert 1
    int e = c; // Wert?

//      3 + 1
    a = a + 1; // Wert 4


    IO.println("c ist " + c);   //Konkatenieren

    IO.println(a + d);  // 4 + 1 = 5
    IO.println("" + a + d); // 41
    IO.println("" + (a + d)); // 5

    IO.println("e ist " + e);
    IO.println("a ist " + a);

    boolean greater = 8 > 7;
    IO.println(greater);    // Wert: true
    boolean equal = 8 == 7;
    IO.println(equal);  // Wert: false

}
