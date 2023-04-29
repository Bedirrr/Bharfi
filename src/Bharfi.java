public class Bharfi {
    public static void main(String[] args) {
        // B harfini temsil eden çok boyutlu dizi
        int[][] B = {
                {1, 1, 1, 1},
                {1, 0, 0, 1},
                {1, 1, 1, 0},
                {1, 0, 0, 1},
                {1, 1, 1, 1}
        };

        // Dizideki her bir elemanı * veya boşluk karakterine dönüştürmek için bir lambda fonksiyonu kullanıyoruz
        String[] rowStrings = new String[B.length];
        for (int i = 0; i < B.length; i++) {
            rowStrings[i] = "";
            for (int j = 0; j < B[i].length; j++) {
                rowStrings[i] += B[i][j] == 1 ? "*" : " ";
            }
        }

        // Yıldızlarla B harfini yazdırmak için dizideki elemanları karakterlere dönüştürüyoruz
        String bChar = String.join("\n", rowStrings);

        // Karakter dizisini ekrana yazdırıyoruz
        System.out.println(bChar);
    }
}