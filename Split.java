public class Split {

    static void split(String str) {


        String temp = "";
        for (int i = 0; i <= str.length(); i++) 
        {
            if (i == str.length() || str.charAt(i) == ' '  ) 
            {
                System.out.println(temp);  
                temp = "";
            }
            else{
                temp = temp + str.charAt(i);
            }
        }
        

    }



    public static void main(String[] args) 
    {
        split("Saiee Yadav");
    }
    
}
