import java.util.Arrays;
import java.util.Scanner;

public class SortControl {
	
	public static void main(String[] args) {
		//Toplam girilecek kelime sayısı
		Scanner scan=new Scanner(System.in);
		System.out.println("How many words will you input? Must above or equal 2!");
		int number=scan.nextInt();
		do{
		//Default harf sıralaması
		String[] letters= {"d","e","f","g","a","u","ğ","ı","v","i","j","ç","k","l","ü",
				"m","n","o","c","ö","p","r","s","y","h","b","ş","t","z"};
		
		//Kullanıcıdan kelimeleri alma
		String[] words=new String[number];
		System.out.println("Input your words. Words legnth must be more than or equal to 2");
		for(int i=0;i<number;i++) {
			words[i]=scan.next().toLowerCase();
			int a=words[i].length();
			if(a<2) {
				break;
			}
		}
		//Alınan kelimelerin baş harfini bulma
		char[] indexZero=new char[number];
		for(int i=0;i<number;i++) {
			indexZero[i]=words[i].charAt(0);
		}
		
		System.out.println("First letters of your words "+Arrays.toString(indexZero)+" ");
		//Baş harflerin birleştirilmesi
		String temp="";
		for(int i=0;i<number;i++) {
			temp+=indexZero[i];
		}
		//Baş harflerin sıralamada karşılaştırılması için default sıralamadaki index numaralarını elde etme
		System.out.print("Index numbers of letters for default ");
		for(int i=0;i<number;i++) {
			String x=temp.substring(i,i+1);
			System.out.print(Arrays.asList(letters).indexOf(x)+"  ");
		}
		//Harflerin sıralamada karşılaştırılması
		for(int i=0;i<number;i++) {
			String x=temp.substring(i,i+1);
			System.out.print(Arrays.asList(letters).indexOf(x)+"  ");
			int a=Arrays.asList(letters).indexOf(temp.substring(i,i+1));
			int b=Arrays.asList(letters).indexOf(temp.substring(i+1,i+2));
			
			if(a<=b) {
				System.out.println("Your words are in order!!");
			break;
			}
			else {
				System.out.println("Your words are NOT in order!!");
				break;
			}
		}
	}while(number<=2);// En az 2 kelime alma
  }
}
