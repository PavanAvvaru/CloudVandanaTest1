import java.util.*;

class JavacodeFirststQuestion
{
  public static void main(String[] args) {
        //Shuffle an array
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(array);
        System.out.println("Shuffled Array: "+Arrays.toString(array));
        // B. Convert Roman Number to Integer
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Roman Number: ");
        String romanNumber=sc.nextLine();
        int intValue=romanToInt(romanNumber.toUpperCase());
        System.out.println("Converted to Integer: " + intValue);
        // C. Check if the input is pangram or not
        System.out.println("Enter a sentence to check for Pangram: ");
        String sentence=sc.nextLine();
        isPangram(sentence);
    }
    // Shuffle an array
    private static void shuffleArray(int[] array) 
    {
        Random random=new Random();
        for (int i=array.length-1;i>0;i--) 
        {
            int j=random.nextInt(i+1);
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
        }
    }

    // Convert Roman Number to Integer
    private static int romanToInt(String s) 
    {
        int result=0;
        int prevValue=0;

        for (int i=s.length()-1;i>=0;i--) 
        {
            int currentValue=getRomanValue(s.charAt(i));
            if(currentValue<prevValue) 
            {
                result-=currentValue;
            } 
            else 
            {
                result+=currentValue;
            }
            prevValue=currentValue;
        }

        return result;
    }
    private static int getRomanValue(char c) 
    {
        switch(c) 
        {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new IllegalArgumentException("Invalid Roman numeral character: " + c);
        }
    }

    // Check if the input is pangram or not
    private static void isPangram(String string) 
    {
        string = string.toLowerCase();  
        boolean allLetterPresent = true;  
        for(char ch='a';ch<='z';ch++)   
        {    
        if(!string.contains(String.valueOf(ch)))   
        {  
        allLetterPresent=false;  
        break;  
        }  
        }   
        if(allLetterPresent)
        System.out.println("Pangram String");  
        else
        System.out.println("Not a Pangram String");  
        }  
}
