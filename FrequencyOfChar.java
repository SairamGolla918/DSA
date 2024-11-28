public class FrequencyOfChar 
{
    static int i = 10;
    int k =0;

    public static void method()
    {
        i += 15;
        // k = 10;
        System.out.println("Static Block"+i);
    }
    public static void main(String[] args) {

        FrequencyOfChar f = new FrequencyOfChar();
        
        f.method();
        String str = "hey hello hai how are you";

        boolean arr[] = new boolean[str.length()];

        
        for (int i = 0; i < str.length(); i++) 
        {
            int count = 1;
            if (arr[i])
			{
				continue;
			}
            for (int j = i+1; j < str.length(); j++)
            {   
                    if(str.charAt(i) == str.charAt(j))
                    {
                        arr[j] = true;
                        count++; 
                    }
            }  
            if(str.charAt(i) != ' ')
                System.out.print(str.charAt(i)+"="+count +" ,");   
                 
        }
    }
    
}

class SubClass extends FrequencyOfChar
{
    public static void main(String[] args) {
        FrequencyOfChar f = new FrequencyOfChar();
        f.method();   
        FrequencyOfChar.method();
    }
   
}

interface InnerFrequencyOfChar{
    

    
}