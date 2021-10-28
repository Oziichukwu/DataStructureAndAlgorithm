package arrayTasks;

import java.util.Scanner;

public class SalesCommission {

    public static void main(String[] args) {

        int []counter = new int[9];
        Scanner input = new Scanner(System.in);
        int salary = 0;
        int gross = 0;
        System.out.println("Kindly input the gross income");
        System.out.println("Kindly input -1 to exit");
        gross = input.nextInt();

        while (gross != -1){
            salary = (int)(200 + (0.09 * gross));
            if (salary >= 200 && salary <= 299){
                counter[0]++;
            }else {
                if (salary >= 300 && salary <= 399){
                    counter[1]++;
                }else{
                    if (salary >= 400 && salary <= 499){
                        counter[2]++;
                    }else{
                        if (salary >= 500 && salary <= 599){
                            counter[3]++;
                        }else {
                            if (salary >= 600 && salary <= 699){
                                counter[4]++;
                            }else {
                                if (salary >= 700 && salary <= 799){
                                    counter[5]++;
                                }else {
                                    if (salary >= 800 && salary <= 899){
                                        counter[6]++;
                                    }else {
                                        if (salary >= 900 && salary <= 999){
                                            counter[7]++;
                                        }else {
                                            if (salary >= 1000){
                                                counter[8]++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
        }
            System.out.println("Kindly input the gross income");
            System.out.println("Kindly input -1 to exit");
            gross = input.nextInt();
            }
       System.out.printf("$200 - $299 - %d%n$300 - $399 - %d%n$400 - $499 - %d%n$500 - $599 - %d%n$600 - $699 - %d%n$700 - $799 - %d%n$800 - $899 - %d%n$900 - $999 - %d%nAbove $1000 - %d%n",counter[0], counter[1], counter[2], counter[3], counter[4],
                counter[5],counter[6],
                counter[7], counter[8]);
    }

    }

