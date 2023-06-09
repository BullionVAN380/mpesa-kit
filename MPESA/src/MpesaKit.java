import java.util.Scanner;
public class MpesaKit {



        public static void main(String[]rgs){
            System.out.println("Select Option Below");
            System.out.println("----------------------------------");
            System.out.println("1: Safaricom+");
            System.out.println("----------------------------------");
            System.out.println("2: M-PESA");
            System.out.println("----------------------------------");



            Scanner scanner=new Scanner(System.in);
            int Safaricom = scanner.nextInt();
            switch (Safaricom){
                case 1:
                    System.out.println("1: M-Banking Services");
                    System.out.println("----------------------------------");
                    System.out.println("1: My Acount");
                    System.out.println("----------------------------------");
                    break;
                case 2:
                    System.out.println("1: Send Money");
                    System.out.println("----------------------------------");
                    System.out.println("2: Withdraw Cash");
                    System.out.println("----------------------------------");
                    System.out.println("3: By Airtime");
                    System.out.println("----------------------------------");
                    System.out.println("4: Loans and Savings");
                    System.out.println("----------------------------------");
                    System.out.println("5: Lipa na M-PESA");
                    System.out.println("----------------------------------");
                    System.out.println("6: My Acount");
                    System.out.println("----------------------------------");

                    int Safaricom2 = scanner.nextInt();
                    switch (Safaricom2){
                        case 1:
                            System.out.println("Enter phone no.");
                            System.out.println("OK");

                    }
                    break;
                default:
                    System.out.println("1: Invalid Choice");

            }




        }
    }


