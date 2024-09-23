import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static class FikstirOlustirma {
        private List<String> takimlar;

        public FikstirOlustirma(List<String> takimlar) {
            this.takimlar = takimlar;
            if (takimlar.size() % 2 != 0) {
                this.takimlar.add("Bay");
            }
        }


        public void olusturFikstur() {
            Collections.shuffle(takimlar);
            int takimSayisi = takimlar.size();
            int macSayisi = takimSayisi - 1;
            for (int i = 0; i < macSayisi; i++) {
                System.out.println("Round " + (i + 1));
                for (int j = 0; j < takimSayisi / 2; j++) {
                    int evSahibi = j;
                    int deplasman = takimSayisi - 1 - j;
                    System.out.println(takimlar.get(evSahibi) + " vs " + takimlar.get(deplasman));
                }
                System.out.println();
                String sonTakim = takimlar.remove(takimSayisi - 1);
                takimlar.add(1, sonTakim);
            }
        }
    }

        public static void main(String[] args) {
            List<String> takımlar = new ArrayList<>();
            takımlar.add("Galatasaray");
            takımlar.add("Bursaspor");
            takımlar.add("Fenerbahçe");
            takımlar.add("Beşiktaş");
            takımlar.add("Başakşehir");
            takımlar.add("Trabzonspor");

            FikstirOlustirma fiksturOluşturucu = new FikstirOlustirma(takımlar);
            fiksturOluşturucu.olusturFikstur();
        }
    }