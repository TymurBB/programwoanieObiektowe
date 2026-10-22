
void main() {
    //1

        Scanner sc = new Scanner(System.in);

        String tekst = sc.nextLine();
        char znak = tekst.charAt(tekst.length() - 1);
        int licznik = 0;

        for (int i = 0; i < tekst.length(); i++) {
            if (tekst.charAt(i) == znak) {
                licznik++;
            }
        }

        System.out.println(licznik);
    }


