public class Pattern {
    
    public static void main(String[] args) 
    {
        numtriangle(4, 0, 0);
        uppertriangle(1, 0, 3);
        lowertriangle(3,0 ,1);
    }

    static void numtriangle(int row,int col,int spaces)
    {
        if(row == 0)
            return;
        if(col < row)
        {
            if(col == 0)
            {
                for (int s = 0; s < spaces; s++) 
                {
                    System.out.print("  ");
                }
            }
            
            System.out.print(row+" ");
            numtriangle(row, col+1,spaces);
        }
        else
        {
            System.out.println();
            numtriangle(row-1, 0,spaces+1);
        }  
    }

    static void uppertriangle(int row,int col,int spaces) 
    {
        if(row  == 5)
            return;
        if(col < row)
        {
            if(col == 0)
            {
                for (int s = 0; s < spaces; s++) 
                {
                    System.out.print("  ");
                }
            }

           
            System.out.print("* ");
            uppertriangle(row, col+1,spaces);
            
        }
        else
        {
            System.out.println();
            uppertriangle(row+1, 0,spaces-1);  
        }  

    }
    static void lowertriangle(int row,int col,int spaces) 
    {
        if(row  == 0)
            return;
        if(col < row)
        {
            if(col == 0)
            {
                for (int s = 0; s < spaces; s++) 
                {
                    System.out.print("  ");
                }
            }

           
            System.out.print("* ");
            lowertriangle(row, col+1,spaces);
            
        }
        else
        {
            System.out.println();
            lowertriangle(row-1, 0,spaces+1);  
        }  

    }
}
