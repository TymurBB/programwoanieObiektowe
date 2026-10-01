
void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Podaj wysokość choinki: ");
    int n = scanner.nextInt();

      for (int i = 1; i <= n; i++) {
    // Spacje przed gwiazdkami
        for (int j = 1; j <= n - i; j++) {
            System.out.print(" ");
        }

         //Gwiazdki
        for (int j = 1; j <= 2 * i - 1; j++) {
            System.out.print("*");
        }

        System.out.println();
    }

    scanner.close();

      //8

}

