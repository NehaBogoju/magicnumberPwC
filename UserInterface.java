import java.util.Scanner;

public class UserInterface{

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        
        // Fill the code
        System.out.println("Enter the total number of PIN numbers");
        int n=sc.nextInt();
        if(n<=0){
            System.out.println(n+" is an invalid number");
            return;
        }
        System.out.println("Enter the PIN numbers");
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]<1000 || a[i]>9999){
                System.out.println(a[i]+" is an invalid PIN number");
                return;
            }
            
        }
        
        int[] c=new int[n];
        int j=0;
        int count=0;
        for(int num:a){
            int res=isvalid(num);
                if(res!=0){
                    count++;
                    
                    // System.out.println(res);
                }
                // else{
                //     System.out.println("All these "+n+" numbers are not a valid PIN number");
                // }
                    
        
            
        }
        if(count==0){
            System.out.println("All these "+n+" numbers are not a valid PIN number");
        }
        else{
            System.out.println("Valid PIN numbers are");
            for(int num:a){
            int res=isvalid(num);
                if(res!=0){
                    
                    System.out.println(res);
                }
        }
        }
        
    }
    public static boolean isprime(int n){
        int c=0;
        for(int i=2;i<n;i++){
            if(n/i==0)
                c++;
            
        }
        if(c==0)
            return true;
        else
            return false;
        
    }
    public static int isvalid(int num){
        char[] b=String.valueOf(num).toCharArray();
        boolean flag=true;
        if(b[0]%2!=0){
            if(b[1]%2==0){
                if(isprime(b[2])==true){
                    if(isprime(b[3])!=false){
                        flag=true;
                        return num;
                    }
                    
                }
            }
        }
                
    
    return 0;
}
}
