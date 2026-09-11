import java.sql.SQLOutput;

void main() {
    System.out.println("hello world");
    System.out.println("skrót");//przez skrót

    System.out.print("coś bez entera");
    System.out.println("nowa linia");

    System.out.println("W taki sposob robie znaki specjalne");
    System.out.println("\ttabulacja");
    System.out.println("\nenter");
    System.out.println("To jest jak na maszynie\rdo pisania");
    System.out.println("\" cudzysłów\"");
    System.out.println("\'apostrow\'");
    System.out.println("backslasch: \\");

    int LiczbaCalkowita = 5;
    double LiczbaRzeczywista;

    LiczbaRzeczywista = (double) LiczbaCalkowita /2;

    System.out.println("Wynik dzielenia liczby 5 przez 2 to" +LiczbaRzeczywista);

    char znak = 'a';
    System.out.println("Litera a ma wartość" + (znak + 0));

    String napis = "napis";
    System.out.println("Napis wielkimi literami: " + napis.toUpperCase());

    System.out.println("Wynik 1 + 2 + 3 = " + 1 + 2 + 3);
    System.out.println("Wynik 1 + 2 + 3 = " + (1 + 2 + 3));
