public class Main {

Scanner sc = new Scanner(System.in);

        public void checkPalindrome()  {

             int r,sum=0,temp;    
              int n=sc.nextInt();

              temp=n;    
              while(n>0){    
               r=n%10;   
               sum=(sum*10)+r;    
               n=n/10;    
              }    
              if(temp==sum)    
               System.out.println("palindrome number ");    
              else    
               System.out.println("not palindrome");  

            
      }

       public void printPattern() {
           
           
           
           

      }
       public void checkPrimeNumber() {
           int n = sc.nextInt();
            int i,m=0,flag=0;      
              m=n/2;      
              if(n==0||n==1){  
               System.out.println(n+" is not prime number");      
              }else{  
               for(i=2;i<=m;i++){      
                if(n%i==0){      
                 System.out.println(n+" is not prime number");      
                 flag=1;      
                 break;      
                }      
               }      
               if(flag==0)  { System.out.println(n+" is prime number"); }  
              }
           
           
        }
        public void printFibonacciSeries() {
            int count = sc.nextInt();
           int first = 0, second = 1;
            int third,i;
            
             System.out.print(first+" "+seccond);    
    
             for(i=2;i<count;i++)
             {    
              third=first+second;    
              System.out.print(" "+third);    
              first=second;    
              second=third;    
             }    

          }

    public static void main(String[] args) {

                Main obj = new Main();

                int choice;

                Scanner sc = new Scanner(System.in);

do {

System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();

choice = sc.nextInt();

switch (choice) {

case 0:
choice = 0;
break;

case 1: {
obj.checkPalindrome();
}
break;

case 2: {
obj.printPattern();
}
break;

case 3: {
obj.checkPrimeNumber();
}
break;

case 4: {
obj.printFibonacciSeries();
}
break;

default:
System.out.println("Invalid choice. Enter a valid no.\n");
}

} while (choice != 0);
System.out.println("Exited Successfully!!!");
sc.close();
}

 

}