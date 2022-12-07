import java.*;
import java.utill.*;
 class menu
{
    public static void main(string arg[])
    {
        int choice;
        String order;
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1, Tea"); 
        System.out.println("2, Cold Drinks");
        System.out.println("3, Samosa");
        System.out.println("4, Patties");
        System.out.println("Enter your order 1-4");
        choice=sc.nextInt();

        switch (choice)
        {
            case 1:
            order = "Tea";
            break;
            case 2:
            order = "Cold Drinks";
            break;
            case 3:
            order = "Samosa";
            break;
            case 4:
            order = "Patties";
            break;
            default:
            order = "Sorry not Available";
        

        }
        
                System.out.println("Your order"+order);


       }

}
