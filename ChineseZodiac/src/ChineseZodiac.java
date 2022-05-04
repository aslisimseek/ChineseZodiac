import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter Your Birth Year...:");
        int birthYear= scanner.nextInt();

        switch (birthYear %12){
            case 0 :
                System.out.println("Chinese Zodiacal Constellation...:Maymun");
                break;
            case 1 :
                System.out.println("Chinese Zodiacal Constellation...:Horoz");
                break;
            case 2 :
                System.out.println("Chinese Zodiacal Constellation...:Köpek");
                break;
            case 3 :
                System.out.println("Chinese Zodiacal Constellation...:Domuz");
                break;
            case 4 :
                System.out.println("Chinese Zodiacal Constellation...:Fare");
                break;
            case 5 :
                System.out.println("Chinese Zodiacal Constellation...:Öküz");
                break;
            case 6 :
                System.out.println("Chinese Zodiacal Constellation...:Kaplan");
                break;
            case 7 :
                System.out.println("Chinese Zodiacal Constellation...:Tavşan");
                break;
            case 8 :
                System.out.println("Chinese Zodiacal Constellation...:Ejderha");
                break;
            case 9 :
                System.out.println("Chinese Zodiacal Constellation...:Yılan");
                break;
            case 10 :
                System.out.println("Chinese Zodiacal Constellation...:At");
                break;
            case 11 :
                System.out.println("Chinese Zodiacal Constellation...:Koyun");
                break;
        }

    }
}
