import java.util.Scanner;
public class NumberToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter a number larger or equal to zero :");
        number =scanner.nextInt();
        int ones;
        int tens;
        int hundreds;
        String storage="";
        String storage2="";
        String storage3="";
        String storage4="";
        if(number<0||number>=1000)
        {
            System.out.println("out of ability");
            System.out.println("Enter a number larger or equal to zero :");
            number=scanner.nextInt();
        }
        if(number>=0&&number<10)
        {
            switch (number) {
                case 1 -> storage="one";
                case 2 -> storage="two";
                case 3 -> storage="three";
                case 4 -> storage="four";
                case 5 -> storage="five";
                case 6 -> storage="six";
                case 7 -> storage="seven";
                case 8 -> storage="eight";
                case 9 -> storage="nine";
                case 0 -> storage="zero";
            }
            System.out.printf("%s",storage);
        }else if(number>=10&&number<20)
        {
            ones=number%10;
            switch (ones) {
                case 0 -> storage2="ten";
                case 1 -> storage2="eleven";
                case 2 -> storage2="twelve";
                case 3 -> storage2="thirteen";
                case 4 -> storage2="fourteen";
                case 5 -> storage2="fifteen";
                case 6 -> storage2="sixteen";
                case 7 -> storage2="seventeen";
                case 8 -> storage2="eighteen";
                case 9 -> storage2="nineteen";
            }
            System.out.printf("%s",storage2);
        }else if(number>=20 && number<100)
        {
            tens=number/10;
            ones=number%10;
            switch (ones) {
                case 1 -> storage="one";
                case 2 -> storage="two";
                case 3 -> storage="three";
                case 4 -> storage="four";
                case 5 -> storage="five";
                case 6 -> storage="six";
                case 7 -> storage="seven";
                case 8 -> storage="eight";
                case 9 -> storage="nine";
                case 0 -> storage="zero";
            }
            switch (tens) {
                case 2 -> storage3="twenty";
                case 3 -> storage3="thirty";
                case 4 -> storage3="fourty";
                case 5 -> storage3="fifty";
                case 6 -> storage3="sixty";
                case 7 -> storage3="seventy";
                case 8 -> storage3="eighty";
                case 9 -> storage3="ninety";
            }
            System.out.printf("%s",storage3 +" "+storage);
        } else if (number>=100&&number<1000) {
            hundreds=number/100;
            int temp=number%100;
            tens=temp/10;
            ones=temp%10;
            switch (temp) {
                case 10 -> storage2="ten";
                case 11 -> storage2="eleven";
                case 12 -> storage2="twelve";
                case 13 -> storage2="thirteen";
                case 14 -> storage2="fourteen";
                case 15 -> storage2="fifteen";
                case 16 -> storage2="sixteen";
                case 17 -> storage2="seventeen";
                case 18 -> storage2="eighteen";
                case 19 -> storage2="nineteen";
            }
            switch (ones) {
                case 0 -> storage="";
                case 1 -> storage="one";
                case 2 -> storage="two";
                case 3 -> storage="three";
                case 4 -> storage="four";
                case 5 -> storage="five";
                case 6 -> storage="six";
                case 7 -> storage="seven";
                case 8 -> storage="eight";
                case 9 -> storage="nine";
            }
            switch (tens) {
                case 0 -> storage3="";
                case 1 -> storage3="ten";
                case 2 -> storage3="twenty";
                case 3 -> storage3="thirty";
                case 4 -> storage3="fourty";
                case 5 -> storage3="fifty";
                case 6 -> storage3="sixty";
                case 7 -> storage3="seventy";
                case 8 -> storage3="eighty";
                case 9 -> storage3="ninety";
            }
            switch (hundreds) {
                case 1 -> storage4="one hundred";
                case 2 -> storage4="two hundred";
                case 3 -> storage4="three hundred";
                case 4 -> storage4="four hundred";
                case 5 -> storage4="five hundred";
                case 6 -> storage4="six hundred";
                case 7 -> storage4="seven hundred";
                case 8 -> storage4="eight hundred";
                case 9 -> storage4="nine hundred";
            }
            if(storage3.equals("")&&storage.equals(""))
            {
                System.out.printf("%s",storage4);
            }else if (tens==1)
            {
                System.out.printf("%s",storage4+" "+"and"+ " "+storage2);
            }else
                System.out.printf("%s",storage4+" "+ "and"+ " "+ storage3 + " "+storage);

        }
    }

}
