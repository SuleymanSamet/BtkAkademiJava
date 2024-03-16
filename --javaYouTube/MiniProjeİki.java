package javaYouTube;

public class MiniProjeİki {
    public static void main(String[] args) {
        char harf='k';
        switch (harf){
            case 'A':
            case 'a':
            case 'I':
            case 'ı':
            case 'o':
            case 'O':
            case 'U':
            case 'u':
                System.out.println("Kalın sesli harfdir");
                break;
            case 'E':
            case 'e':
            case 'i':
            case 'İ':
            case 'ö':
            case 'Ö':
            case 'ü':
            case 'Ü':
                System.out.println("İnce sesli harfdir");
                break;
            default:
                System.out.println("Sesli harf değildir");


        }

    }
}
